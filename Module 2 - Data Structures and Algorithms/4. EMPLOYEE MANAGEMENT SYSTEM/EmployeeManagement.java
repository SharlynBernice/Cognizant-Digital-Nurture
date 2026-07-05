import java.util.HashMap;

public class EmployeeManagement {

    private HashMap<Integer, Employee> employees;

    public EmployeeManagement() {
        employees = new HashMap<>();
    }

    // Add Employee
    public void addEmployee(Employee employee) {

        employees.put(employee.getEmployeeId(), employee);

        System.out.println(employee.getEmployeeName()
                + " added successfully.");

    }

    // Search Employee
    public void searchEmployee(int id) {

        Employee employee = employees.get(id);

        if (employee != null) {

            System.out.println("\nEmployee Found");
            System.out.println("------------------------");
            System.out.println(employee);

        } else {

            System.out.println("\nEmployee Not Found.");

        }

    }

    // Display Employees
    public void displayEmployees() {

        System.out.println("\nEmployee Records");
        System.out.println("------------------------");

        for (Employee employee : employees.values()) {

            System.out.println(employee);
            System.out.println("------------------------");

        }

    }

    // Delete Employee
    public void deleteEmployee(int id) {

        if (employees.remove(id) != null)
            System.out.println("\nEmployee removed successfully.");
        else
            System.out.println("\nEmployee not found.");

    }

}