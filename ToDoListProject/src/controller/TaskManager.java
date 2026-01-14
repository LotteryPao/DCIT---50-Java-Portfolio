package controller;

import model.Task;
import java.util.ArrayList;

public class TaskManager {
    // List to hold all tasks
    private ArrayList<Task> taskList;

    public TaskManager() {
        this.taskList = new ArrayList<>();
    }

    // Add a task to the list
    public void addTask(Task task) {
        taskList.add(task);
    }

    // Get the whole list (needed for the table)
    public ArrayList<Task> getAllTasks() {
        return taskList;
    }

    // Helper to generate a simple ID based on list size
    public String generateNextId() {
        int nextId = taskList.size() + 1;
        return "TASK-" + nextId;
    }
}

