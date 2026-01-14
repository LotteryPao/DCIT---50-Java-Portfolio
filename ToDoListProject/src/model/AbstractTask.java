package model;

public abstract class AbstractTask {
    // Attributes
    protected String taskId;
    protected String taskName;
    protected String taskDescription;

    // Default Constructor
    public AbstractTask() {
    }

    // Parameterized Constructor
    public AbstractTask(String taskId, String taskName, String taskDescription) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    // Abstract methods for status (to be implemented by children)
    public abstract String getStatus();
    public abstract void setStatus(String status);

    // Normal Getters and Setters
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
}