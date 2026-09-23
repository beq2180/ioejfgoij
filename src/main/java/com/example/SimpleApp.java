// src/main/java/com/example/SimpleApp.java
package com.example;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Font;

public class SimpleApp {
    public static void main(String[] args) {
        // Create the main window
        JFrame frame = new JFrame("Welcome App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);

        // Create a panel with a layout
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 10));

        // Create a welcome message
        JLabel label = new JLabel("Hello! Thanks for opening this app. Have a wonderful day!", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(label, BorderLayout.CENTER);

        // Create a close button
        JButton closeButton = new JButton("Close Application");
        closeButton.addActionListener(e -> System.exit(0));
        panel.add(closeButton, BorderLayout.SOUTH);

        // Add panel to frame and display
        frame.add(panel);
        frame.setVisible(true);
    }
}
