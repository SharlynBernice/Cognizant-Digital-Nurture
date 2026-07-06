public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public String getEmployee(int id) {
        return employeeService.getEmployeeName(id);
    }
}