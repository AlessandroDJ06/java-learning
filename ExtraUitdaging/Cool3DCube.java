package ExtraUitdaging;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cool3DCube extends JPanel implements ActionListener {
    private Timer timer;
    private double angleX = 0;
    private double angleY = 0;
    private double angleZ = 0;


    private double[][] vertices = {
            {-100, -100, -100},
            { 100, -100, -100},
            { 100,  100, -100},
            {-100,  100, -100},
            {-100, -100,  100},
            { 100, -100,  100},
            { 100,  100,  100},
            {-100,  100,  100}
    };

    private int[][] faces = {
            {0,1,2,3}, // back
            {4,5,6,7}, // front
            {0,1,5,4}, // bottom
            {3,2,6,7}, // top
            {1,2,6,5}, // right
            {0,3,7,4}  // left
    };

    private Color[] baseColors = {
            new Color(220, 40, 40),
            new Color(40, 220, 40),
            new Color(40, 100, 220),
            new Color(220, 220, 40),
            new Color(220, 40, 220),
            new Color(40, 220, 220)
    };

    public Cool3DCube() {
        setBackground(Color.black);
        timer = new Timer(33, this); // ~30 FPS
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int w = getWidth();
        int h = getHeight();
        int cx = w / 2;
        int cy = h / 2;

        // Light direction
        double[] light = {0.5, 0.5, -1};
        normalize(light);

        // Rotate vertices
        double[][] rotated = new double[8][3];
        for (int i = 0; i < vertices.length; i++) {
            double[] v = vertices[i];
            double x = v[0], y = v[1], z = v[2];

            // Rotation around X
            double y1 = y * Math.cos(angleX) - z * Math.sin(angleX);
            double z1 = y * Math.sin(angleX) + z * Math.cos(angleX);

            // Rotation around Y
            double x2 = x * Math.cos(angleY) + z1 * Math.sin(angleY);
            double z2 = -x * Math.sin(angleY) + z1 * Math.cos(angleY);

            // Rotation around Z
            double x3 = x2 * Math.cos(angleZ) - y1 * Math.sin(angleZ);
            double y3 = x2 * Math.sin(angleZ) + y1 * Math.cos(angleZ);

            rotated[i][0] = x3;
            rotated[i][1] = y3;
            rotated[i][2] = z2;
        }

        // Perspective projection
        double fov = 300;
        double viewerDistance = 400;
        Point[] projected = new Point[8];
        for (int i = 0; i < 8; i++) {
            double[] v = rotated[i];
            double scale = fov / (viewerDistance + v[2]);
            int px = (int) (v[0] * scale + cx);
            int py = (int) (v[1] * scale + cy);
            projected[i] = new Point(px, py);
        }

        // Draw faces (with shading)
        double[] faceDepth = new double[faces.length];
        for (int i = 0; i < faces.length; i++) {
            int[] f = faces[i];
            double avgZ = 0;
            for (int v : f) avgZ += rotated[v][2];
            faceDepth[i] = avgZ / f.length;
        }

        // Painter’s algorithm: draw back to front
        Integer[] order = new Integer[faces.length];
        for (int i = 0; i < faces.length; i++) order[i] = i;
        java.util.Arrays.sort(order, (a, b) -> Double.compare(faceDepth[b], faceDepth[a]));

        for (int idx : order) {
            int[] f = faces[idx];
            int[] x = new int[4];
            int[] y = new int[4];
            for (int j = 0; j < 4; j++) {
                x[j] = projected[f[j]].x;
                y[j] = projected[f[j]].y;
            }

            // Normal for lighting
            double[] v1 = subtract(rotated[f[1]], rotated[f[0]]);
            double[] v2 = subtract(rotated[f[2]], rotated[f[0]]);
            double[] normal = cross(v1, v2);
            normalize(normal);
            double brightness = dot(normal, light);
            brightness = Math.max(0, brightness);

            // Shaded color
            Color base = baseColors[idx];
            int r = (int) (base.getRed() * brightness);
            int gC = (int) (base.getGreen() * brightness);
            int b = (int) (base.getBlue() * brightness);
            g2.setColor(new Color(r, gC, b));

            g2.fillPolygon(x, y, 4);
            g2.setColor(Color.BLACK);
            g2.drawPolygon(x, y, 4);
        }

        // Overlay text
        g2.setColor(Color.white);
        g2.drawString("Cool 3D Cube in AWT ✨", 10, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        angleX += 0.03;
        angleY += 0.02;
        angleZ += 0.01;
        repaint();
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
        double len = Math.sqrt(dot(v, v));
        if (len != 0) {
            v[0] /= len; v[1] /= len; v[2] /= len;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cool AWT 3D Cube");
        frame.add(new Cool3DCube());
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
