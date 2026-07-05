// Controller
public class EmployeeController {

    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setEmployeeName(name);
    }

    public String getEmployeeName() {
        return model.getEmployeeName();
    }

    public void setDepartment(String department) {
        model.setDepartment(department);
    }

    public String getDepartment() {
        return model.getDepartment();
    }

    public void updateView() {

        view.displayEmployeeDetails(
                model.getEmployeeId(),
                model.getEmployeeName(),
                model.getDepartment());

    }

}