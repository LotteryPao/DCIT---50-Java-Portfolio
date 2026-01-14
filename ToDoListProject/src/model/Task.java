package model;

public class Task extends AbstractTask {
    // Additional attribute
    private String status;

    // Constants for status values to avoid typos
    public static final String STATUS_DONE = "Completed";
    public static final String STATUS_ONGOING = "Ongoing";
    public static final String STATUS_NOT_STARTED = "Not Started";

    // Constructor
    public Task(String taskId, String taskName, String taskDescription, String status) {
        super(taskId, taskName, taskDescription);
        this.status = status;
    }

    // Overriding abstract methods
    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        // Simple validation to make sure we only accept valid statuses
        if (status.equals(STATUS_DONE) || status.equals(STATUS_ONGOING) || status.equals(STATUS_NOT_STARTED)) {
            this.status = status;
        } else {
            this.status = STATUS_NOT_STARTED; // Default fallback
        }
    }
}
