package controller;

import model.Task;
import java.util.ArrayList;

public class TaskManager {
    // The list to hold all the tasks
    private ArrayList<Task> taskList;

    public TaskManager() {
        this.taskList = new ArrayList<>();
    }

    // Adding a task to the list 
    public void addTask(Task task) {
        taskList.add(task);
    }

    // Getting the whole list that is needed for the table 
    public ArrayList<Task> getAllTasks() {
        return taskList;
    }

    // Used for generating a simple ID based on list size
    public String generateNextId() {
        int nextId = taskList.size() + 1;
        return "TASK-" + nextId;
    }
}


