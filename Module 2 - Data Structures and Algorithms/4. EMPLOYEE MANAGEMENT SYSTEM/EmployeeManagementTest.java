public class EmployeeManagementTest {

    public static void main(String[] args) {

        EmployeeManagement management = new EmployeeManagement();

        management.addEmployee(
                new Employee(101, "Sharlyn", "AI & ML"));

        management.addEmployee(
                new Employee(102, "Rahul", "Cloud"));

        management.addEmployee(
                new Employee(103, "Priya", "Cyber Security"));

        management.displayEmployees();

        management.searchEmployee(102);

        management.deleteEmployee(101);

        management.displayEmployees();

    }

}