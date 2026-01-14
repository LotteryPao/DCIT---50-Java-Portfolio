package ui;

import controller.TaskManager;
import model.Task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskForm extends JFrame {
    private TaskManager taskManager;
    private MainFrame mainFrame; // Reference to update the table later

    // UI Components
    private JTextField txtId;
    private JTextField txtName;
    private JTextArea txtDesc;
    private JComboBox<String> cmbStatus;

    public TaskForm(TaskManager taskManager, MainFrame mainFrame) {
        this.taskManager = taskManager;
        this.mainFrame = mainFrame;

        setTitle("Add New Task");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only this window
        setLayout(new BorderLayout(10, 10));

        // Create form panel using GridLayout
        JPanel formPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // 1. Task ID (Read only)
        formPanel.add(new JLabel("Task ID:"));
        txtId = new JTextField();
        txtId.setEditable(false);
        txtId.setText(taskManager.generateNextId()); // Auto-generate ID
        formPanel.add(txtId);

        // 2. Task Name
        formPanel.add(new JLabel("Task Name:"));
        txtName = new JTextField();
        formPanel.add(txtName);

        // 3. Description
        formPanel.add(new JLabel("Description:"));
        txtDesc = new JTextArea(3, 20);
        // Wrap text area in scroll pane for better look
        JScrollPane descScroll = new JScrollPane(txtDesc);
        formPanel.add(descScroll);

        // 4. Status
        formPanel.add(new JLabel("Status:"));
        String[] statuses = {Task.STATUS_NOT_STARTED, Task.STATUS_ONGOING, Task.STATUS_DONE};
        cmbStatus = new JComboBox<>(statuses);
        formPanel.add(cmbStatus);

        add(formPanel, BorderLayout.CENTER);

        // Save Button at the bottom
        JButton btnSave = new JButton("Save Task");
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnSave);
        add(buttonPanel, BorderLayout.SOUTH);

        // Action Listener for Save
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveTask();
            }
        });

        setLocationRelativeTo(null);
    }

    private void saveTask() {
        // Validation: Check if name is empty
        if (txtName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Task Name cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get data
        String id = txtId.getText();
        String name = txtName.getText();
        String desc = txtDesc.getText();
        String status = (String) cmbStatus.getSelectedItem();

        // Create Object
        Task newTask = new Task(id, name, desc, status);

        // Pass to Manager
        taskManager.addTask(newTask);

        // Refresh Main Window Table
        mainFrame.refreshTable();

        // Close this form
        dispose();
    }
}
