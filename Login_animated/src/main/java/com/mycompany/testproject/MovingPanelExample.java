package com.mycompany.testproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovingPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Panel Example");
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setPreferredSize(new Dimension(200, 200));

        panel.addMouseListener(new MouseAdapter() {
            private int X, Y;

            @Override
            public void mousePressed(MouseEvent e) {
                X = e.getX();
                Y = e.getY();
            }
        });

        panel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int deltaX = e.getX();
                int deltaY = e.getY() ;
                int newX = panel.getX() + deltaX;
                int newY = panel.getY() + deltaY;
                panel.setLocation(newX, newY);
            }
        });

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
