package com.mycompany.testproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleAnimator extends JPanel implements ActionListener {
    private int x = 0;
    private int y = 0;
    private int deltaX = 1;
    private int deltaY = 1;
    private final int circleSize = 50;

    public CircleAnimator() {
        Timer timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, circleSize, circleSize);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x += deltaX;
        y += deltaY;

        if (x < 0 || x > getWidth() - circleSize) {
            deltaX *= -1;
        }
        if (y < 0 || y > getHeight() - circleSize) {
            deltaY *= -1;
        }

        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle Animator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(new CircleAnimator());
        frame.setVisible(true);
    }
}
