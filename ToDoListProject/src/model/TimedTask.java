package model;

public class TimedTask extends Task {
    // Additional attribute for timed tasks
    private int estimatedMinutes;

    public TimedTask(String taskId, String taskName, String taskDescription, String status, int estimatedMinutes) {
        super(taskId, taskName, taskDescription, status);
        this.estimatedMinutes = estimatedMinutes;
    }

    // Encapsulation
    public int getEstimatedMinutes() {
        return estimatedMinutes;
    }

    public void setEstimatedMinutes(int estimatedMinutes) {
        if(estimatedMinutes > 0) {
            this.estimatedMinutes = estimatedMinutes;
        }
    }
}