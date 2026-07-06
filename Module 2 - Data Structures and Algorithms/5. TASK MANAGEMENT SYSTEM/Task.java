public class Task implements Comparable<Task> {

    private int taskId;
    private String taskName;
    private int priority;

    public Task(int taskId, String taskName, int priority) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        // Higher priority value gets served first
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {

        return "Task ID      : " + taskId +
               "\nTask Name    : " + taskName +
               "\nPriority     : " + priority;

    }
}