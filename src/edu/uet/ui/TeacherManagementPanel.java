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

public class TeacherManagementPanel extends JPanel {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField teacherNameField;
    private JTextField teacherTitleField;

    public TeacherManagementPanel(CardLayout cardLayout, JPanel mainPanel) {
        this.cardLayout = cardLayout;
        this.mainPanel = mainPanel;
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Teacher Management");
        add(label, BorderLayout.NORTH);

        // Table for displaying teachers
        tableModel = new DefaultTableModel(new Object[]{"ID", "Name", "Title"}, 0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        // Form for adding/editing teachers
        JPanel formPanel = new JPanel(new GridLayout(3, 2));
        formPanel.add(new JLabel("Teacher Name:"));
        teacherNameField = new JTextField();
        formPanel.add(teacherNameField);

        formPanel.add(new JLabel("Teacher Title:"));
        teacherTitleField = new JTextField();
        formPanel.add(teacherTitleField);

        JButton addButton = new JButton("Add Teacher");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add teacher logic
            }
        });
        formPanel.add(addButton);

        JButton editButton = new JButton("Edit Teacher");
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Edit teacher logic
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