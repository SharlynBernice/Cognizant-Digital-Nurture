public class TaskManagementTest {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();

        manager.addTask(new Task(101, "Generate Monthly Report", 2));

        manager.addTask(new Task(102, "Fix Critical Bug", 5));

        manager.addTask(new Task(103, "Deploy Application", 4));

        manager.addTask(new Task(104, "Update Documentation", 1));

        manager.addTask(new Task(105, "Security Audit", 3));

        manager.executeTasks();

    }

}