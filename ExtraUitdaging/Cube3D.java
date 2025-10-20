package ExtraUitdaging;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cube3D extends JPanel implements ActionListener {
    private Timer timer;
    private double angleX = 0;
    private double angleY = 0;


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


    private int[][] edges = {
            {0,1},{1,2},{2,3},{3,0},  // back face
            {4,5},{5,6},{6,7},{7,4},  // front face
            {0,4},{1,5},{2,6},{3,7}   // connectors
    };

    public Cube3D() {
        timer = new Timer(1000, this); // ~30 FPS
        timer.start();
        setBackground(Color.black);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;

        // Apply rotation and projection
        Point[] projected = new Point[vertices.length];
        double fov = 256;
        double viewerDistance = 4;

        for (int i = 0; i < vertices.length; i++) {
            double[] v = vertices[i];

            // Rotation around X
            double y = v[1] * Math.cos(angleX) - v[2] * Math.sin(angleX);
            double z = v[1] * Math.sin(angleX) + v[2] * Math.cos(angleX);
            double x = v[0];

            // Rotation around Y
            double tempX = x * Math.cos(angleY) + z * Math.sin(angleY);
            double tempZ = -x * Math.sin(angleY) + z * Math.cos(angleY);
            x = tempX;
            z = tempZ;

            // Perspective projection
            double scale = fov / (viewerDistance * 100 + z);
            int px = (int) (x * scale + centerX);
            int py = (int) (y * scale + centerY);
            projected[i] = new Point(px, py);
        }


        g2.setColor(Color.white);
        for (int[] e : edges) {
            Point p1 = projected[e[0]];
            Point p2 = projected[e[1]];
            g2.drawLine(p1.x, p1.y, p2.x, p2.y);
        }


        g2.setColor(Color.green);
        g2.drawString("AWT 2.5D Cube", 10, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        angleX += 0.03;
        angleY += 0.02;
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("2.5D Cube - AWT Demo");
        Cube3D cube = new Cube3D();
        frame.add(cube);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
