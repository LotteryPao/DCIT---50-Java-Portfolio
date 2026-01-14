package ui;

import controller.TaskManager;
import model.Task;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    private TaskManager taskManager;
    private JTable taskTable;
    private DefaultTableModel tableModel;
    private TaskForm openFormInstance = null; // To track if form is open

    public MainFrame(TaskManager taskManager) {
        this.taskManager = taskManager;

        // Window setup
        setTitle("Student To-Do List App");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 1. Create the Top Panel with Add Button
        JPanel topPanel = new JPanel();
        JButton btnAddTask = new JButton("Add Task");
        topPanel.add(btnAddTask);
        add(topPanel, BorderLayout.NORTH);

        // 2. Create the Table
        // Column names
        String[] columns = {"Task ID", "Task Name", "Task Description", "Status"};
        // Model handles the data
        tableModel = new DefaultTableModel(columns, 0);
        taskTable = new JTable(tableModel);
        
        // Wrap table in ScrollPane so headers show up
        JScrollPane scrollPane = new JScrollPane(taskTable);
        add(scrollPane, BorderLayout.CENTER);

        // 3. Button Action Listener
        btnAddTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check if form is already open
                if (openFormInstance == null || !openFormInstance.isVisible()) {
                    openFormInstance = new TaskForm(taskManager, MainFrame.this);
                    openFormInstance.setVisible(true);
                } else {
                    // If open, just bring it to front
                    openFormInstance.toFront();
                }
            }
        });
        
        // Center the window
        setLocationRelativeTo(null);
    }

    // Method to refresh table data (called by TaskForm)
    public void refreshTable() {
        // Clear existing data
        tableModel.setRowCount(0);

        // Get fresh data from manager
        ArrayList<Task> tasks = taskManager.getAllTasks();

        for (Task t : tasks) {
            Object[] rowData = {
                t.getTaskId(),
                t.getTaskName(),
                t.getTaskDescription(),
                t.getStatus()
            };
            tableModel.addRow(rowData);
        }
    }
}