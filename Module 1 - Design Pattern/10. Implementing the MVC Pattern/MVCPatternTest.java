// Client
public class MVCPatternTest {

    public static void main(String[] args) {

        Employee employee =
                new Employee(101, "Sharlyn", "Software Development");

        EmployeeView view = new EmployeeView();

        EmployeeController controller =
                new EmployeeController(employee, view);

        System.out.println("Initial Employee Details\n");

        controller.updateView();

        System.out.println("\nUpdating Employee Details...\n");

        controller.setEmployeeName("Sharlyn Bernice");
        controller.setDepartment("Artificial Intelligence");

        controller.updateView();

    }

}