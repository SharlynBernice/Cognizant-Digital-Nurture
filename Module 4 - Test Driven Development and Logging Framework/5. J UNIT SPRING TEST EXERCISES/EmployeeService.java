public class EmployeeService {

    public String getEmployeeName(int id) {

        if (id == 101) {
            return "Sharlyn";
        }

        return "Employee Not Found";
    }
}