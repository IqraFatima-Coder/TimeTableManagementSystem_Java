package edu.uet.ui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseManagementPanel extends JPanel {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField courseCodeField;
    private JTextField courseTitleField;
    private JTextField courseDescField;
    private JTextField courseCreditHourField;

    public CourseManagementPanel(CardLayout cardLayout, JPanel mainPanel) {
        this.cardLayout = cardLayout;
        this.mainPanel = mainPanel;
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Course Management");
        add(label, BorderLayout.NORTH);

        // Table for displaying courses
        tableModel = new DefaultTableModel(new Object[]{"ID", "Code", "Title", "Description", "Credit Hour"}, 0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        // Form for adding/editing courses
        JPanel formPanel = new JPanel(new GridLayout(5, 2));
        formPanel.add(new JLabel("Course Code:"));
        courseCodeField = new JTextField();
        formPanel.add(courseCodeField);

        formPanel.add(new JLabel("Course Title:"));
        courseTitleField = new JTextField();
        formPanel.add(courseTitleField);

        formPanel.add(new JLabel("Course Description:"));
        courseDescField = new JTextField();
        formPanel.add(courseDescField);

        formPanel.add(new JLabel("Course Credit Hour:"));
        courseCreditHourField = new JTextField();
        formPanel.add(courseCreditHourField);

        JButton addButton = new JButton("Add Course");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add course logic
            }
        });
        formPanel.add(addButton);

        JButton editButton = new JButton("Edit Course");
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Edit course logic
            }
        });
        formPanel.add(editButton);

        add(formPanel, BorderLayout.SOUTH);

        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "Home");
            }
        });
        add(backButton, BorderLayout.SOUTH);
    }
}