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

public class RoomManagementPanel extends JPanel {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField roomNameField;
    private JTextField roomFloorField;
    private JTextField roomCapacityField;
    private JTextField roomTypeField;

    public RoomManagementPanel(CardLayout cardLayout, JPanel mainPanel) {
        this.cardLayout = cardLayout;
        this.mainPanel = mainPanel;
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Room Management");
        add(label, BorderLayout.NORTH);

        // Table for displaying rooms
        tableModel = new DefaultTableModel(new Object[]{"ID", "Name", "Floor", "Capacity", "Type"}, 0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        // Form for adding/editing rooms
        JPanel formPanel = new JPanel(new GridLayout(5, 2));
        formPanel.add(new JLabel("Room Name:"));
        roomNameField = new JTextField();
        formPanel.add(roomNameField);

        formPanel.add(new JLabel("Room Floor:"));
        roomFloorField = new JTextField();
        formPanel.add(roomFloorField);

        formPanel.add(new JLabel("Room Capacity:"));
        roomCapacityField = new JTextField();
        formPanel.add(roomCapacityField);

        formPanel.add(new JLabel("Room Type:"));
        roomTypeField = new JTextField();
        formPanel.add(roomTypeField);

        JButton addButton = new JButton("Add Room");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add room logic
            }
        });
        formPanel.add(addButton);

        JButton editButton = new JButton("Edit Room");
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Edit room logic
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