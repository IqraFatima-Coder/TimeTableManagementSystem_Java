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
public class StudentManagementPanel extends JPanel {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField studentNameField;
    private JTextField studentRollNoField;
    private JTextField studentProgramField;
    private JTextField studentYearField;

    public StudentManagementPanel(CardLayout cardLayout, JPanel mainPanel) {
        this.cardLayout = cardLayout;
        this.mainPanel = mainPanel;
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Student Management");
        add(label, BorderLayout.NORTH);

        // Table for displaying students
        tableModel = new DefaultTableModel(new Object[]{"ID", "Name", "Roll No", "Program", "Year"}, 0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        // Form for adding/editing students
        JPanel formPanel = new JPanel(new GridLayout(5, 2));
        formPanel.add(new JLabel("Student Name:"));
        studentNameField = new JTextField();
        formPanel.add(studentNameField);

        formPanel.add(new JLabel("Student Roll No:"));
        studentRollNoField = new JTextField();
        formPanel.add(studentRollNoField);

        formPanel.add(new JLabel("Study Program:"));
        studentProgramField = new JTextField();
        formPanel.add(studentProgramField);

        formPanel.add(new JLabel("Study Year:"));
        studentYearField = new JTextField();
        formPanel.add(studentYearField);

        JButton addButton = new JButton("Add Student");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add student logic
            }
        });
        formPanel.add(addButton);

        JButton editButton = new JButton("Edit Student");
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Edit student logic
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