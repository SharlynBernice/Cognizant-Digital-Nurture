import java.util.PriorityQueue;

public class TaskManager {

    private PriorityQueue<Task> taskQueue;

    public TaskManager() {
        taskQueue = new PriorityQueue<>();
    }

    // Add Task
    public void addTask(Task task) {

        taskQueue.offer(task);

        System.out.println("Task added: " + task);

        System.out.println("-------------------------");
    }

    // Execute Tasks
    public void executeTasks() {

        System.out.println("\nExecuting Tasks Based on Priority");
        System.out.println("----------------------------------");

        while (!taskQueue.isEmpty()) {

            Task task = taskQueue.poll();

            System.out.println(task);
            System.out.println("----------------------------------");

        }

    }

}