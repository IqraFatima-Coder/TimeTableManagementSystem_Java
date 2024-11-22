package edu.uet.ui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Time Table Management System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Home Tab
        JPanel homePanel = new JPanel(new BorderLayout());
        JLabel homeLabel = new JLabel("Welcome to the Time Table Management System", JLabel.CENTER);
        homeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        homePanel.add(homeLabel, BorderLayout.NORTH);

        JLabel imageLabel = new JLabel(new ImageIcon("path/to/your/image.jpg"));
        homePanel.add(imageLabel, BorderLayout.CENTER);

        tabbedPane.addTab("Home", homePanel);

        // Course Management Tab
        CourseManagementPanel courseManagementPanel = new CourseManagementPanel(new CardLayout(), new JPanel());
        tabbedPane.addTab("Course Management", courseManagementPanel);

        // Student Management Tab
        StudentManagementPanel studentManagementPanel = new StudentManagementPanel(new CardLayout(), new JPanel());
        tabbedPane.addTab("Student Management", studentManagementPanel);

        // Teacher Management Tab
        TeacherManagementPanel teacherManagementPanel = new TeacherManagementPanel(new CardLayout(), new JPanel());
        tabbedPane.addTab("Teacher Management", teacherManagementPanel);

        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }
}