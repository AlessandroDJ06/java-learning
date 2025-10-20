package ExtraUitdaging;

import java.awt.*;
import java.awt.event.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.*;
import javax.swing.*;

public class HelloWorld3DRealistic extends JPanel implements ActionListener {

    private Timer timer = new Timer(16, this); // ~60 FPS
    private double angleX = 0;
    private double angleZ = Math.toRadians(20);

    private Shape textShape;   // outline of text
    private Path2D.Double[] faces; // front/back faces

    private final int depth = 20; // extrusion depth

    public HelloWorld3DRealistic() {
        setBackground(Color.black);

        Font font = new Font("SansSerif", Font.BOLD, 120);
        FontRenderContext frc = new FontRenderContext(null, true, true);
        textShape = font.createGlyphVector(frc, "HELLO WORLD").getOutline();

        // front and back faces
        faces = new Path2D.Double[2];
        faces[0] = new Path2D.Double(textShape);
        AffineTransform backTransform = AffineTransform.getTranslateInstance(0, 0);
        backTransform.translate(0, 0);
        backTransform.translate(0, 0); // we’ll handle Z in projection
        faces[1] = new Path2D.Double(textShape);

        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        int w = getWidth();
        int h = getHeight();
        g2.translate(w / 2.0, h / 2.0); // center
        g2.scale(1, -1); // flip Y for 3D math

        // light direction
        double[] light = {0, 0, -1};
        normalize(light);

        // Draw the extruded text
        draw3DShape(g2, textShape, depth, angleX, angleZ, light);

        g2.scale(1, -1);
        g2.setColor(Color.white);
        g2.drawString("3D HELLO WORLD Demo", -100, h / 2 - 20);
    }

    private void draw3DShape(Graphics2D g2, Shape shape, int depth, double angleX, double angleZ, double[] light) {
        PathIterator pi = shape.getPathIterator(null, 1.0);

        // Convert Shape to points
        java.util.List<double[]> frontPoints = new java.util.ArrayList<>();
        double[] coords = new double[6];
        while (!pi.isDone()) {
            int type = pi.currentSegment(coords);
            if (type != PathIterator.SEG_CLOSE) {
                frontPoints.add(new double[]{coords[0], coords[1], 0});
            }
            pi.next();
        }

        // Draw back face (extruded)
        java.util.List<double[]> backPoints = new java.util.ArrayList<>();
        for (double[] p : frontPoints) {
            backPoints.add(new double[]{p[0], p[1], depth});
        }

        // Draw sides
        for (int i = 0; i < frontPoints.size(); i++) {
            double[] p1 = frontPoints.get(i);
            double[] p2 = frontPoints.get((i + 1) % frontPoints.size());
            double[] p3 = backPoints.get((i + 1) % backPoints.size());
            double[] p4 = backPoints.get(i);

            Polygon poly = projectQuad(p1, p2, p3, p4, angleX, angleZ);
            g2.setColor(getShade(p1, p2, p3, light));
            g2.fillPolygon(poly);
            g2.setColor(Color.BLACK);
            g2.drawPolygon(poly);
        }

        // Draw front face
        Polygon frontPoly = projectPolygon(frontPoints, angleX, angleZ);
        g2.setColor(Color.RED);
        g2.fillPolygon(frontPoly);
        g2.setColor(Color.BLACK);
        g2.drawPolygon(frontPoly);

        // Draw back face
        Polygon backPoly = projectPolygon(backPoints, angleX, angleZ);
        g2.setColor(Color.DARK_GRAY);
        g2.fillPolygon(backPoly);
        g2.setColor(Color.BLACK);
        g2.drawPolygon(backPoly);
    }

    private Polygon projectPolygon(java.util.List<double[]> points, double angleX, double angleZ) {
        Polygon poly = new Polygon();
        for (double[] p : points) {
            double[] r = rotatePoint(p, angleX, angleZ);
            Point proj = project(r);
            poly.addPoint(proj.x, proj.y);
        }
        return poly;
    }

    private Polygon projectQuad(double[] p1, double[] p2, double[] p3, double[] p4, double angleX, double angleZ) {
        Polygon poly = new Polygon();
        poly.addPoint(project(rotatePoint(p1, angleX, angleZ)).x,
                project(rotatePoint(p1, angleX, angleZ)).y);
        poly.addPoint(project(rotatePoint(p2, angleX, angleZ)).x,
                project(rotatePoint(p2, angleX, angleZ)).y);
        poly.addPoint(project(rotatePoint(p3, angleX, angleZ)).x,
                project(rotatePoint(p3, angleX, angleZ)).y);
        poly.addPoint(project(rotatePoint(p4, angleX, angleZ)).x,
                project(rotatePoint(p4, angleX, angleZ)).y);
        return poly;
    }

    private Point project(double[] p) {
        double fov = 500;
        double scale = fov / (fov + p[2]);
        int x = (int)(p[0] * scale);
        int y = (int)(p[1] * scale);
        return new Point(x, y);
    }

    private double[] rotatePoint(double[] p, double angleX, double angleZ) {
        double x = p[0], y = p[1], z = p[2];

        // X-axis
        double y1 = y * Math.cos(angleX) - z * Math.sin(angleX);
        double z1 = y * Math.sin(angleX) + z * Math.cos(angleX);

        // Z-axis
        double x2 = x * Math.cos(angleZ) - y1 * Math.sin(angleZ);
        double y2 = x * Math.sin(angleZ) + y1 * Math.cos(angleZ);

        return new double[]{x2, y2, z1};
    }

    private Color getShade(double[] p1, double[] p2, double[] p3, double[] light) {
        double[] v1 = subtract(p2, p1);
        double[] v2 = subtract(p3, p1);
        double[] normal = cross(v1, v2);
        normalize(normal);
        double brightness = Math.max(0, dot(normal, light));
        brightness = 0.3 + 0.7 * brightness; // ambient + directional
        int r = (int)(255 * brightness);
        int g = (int)(50 * brightness);
        int b = (int)(50 * brightness);
        return new Color(r, g, b);
    }

    // --- Vector math helpers ---
    private static double[] subtract(double[] a, double[] b) {
        return new double[]{a[0]-b[0], a[1]-b[1], a[2]-b[2]};
    }

    private static double[] cross(double[] a, double[] b) {
        return new double[]{
                a[1]*b[2] - a[2]*b[1],
                a[2]*b[0] - a[0]*b[2],
                a[0]*b[1] - a[1]*b[0]
        };
    }

    private static double dot(double[] a, double[] b) {
        return a[0]*b[0] + a[1]*b[1] + a[2]*b[2];
    }

    private static void normalize(double[] v) {
        double len = Math.sqrt(dot(v,v));
        if(len!=0) { v[0]/=len; v[1]/=len; v[2]/=len; }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        angleX += 0.02;
        angleZ += 0.01;
        repaint();
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("HELLO WORLD 3D – Realistic AWT Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new HelloWorld3DRealistic());
        f.setSize(1000, 600);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
