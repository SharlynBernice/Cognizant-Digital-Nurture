import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeControllerTest {

    private EmployeeController controller;

    @BeforeEach
    void setUp() {

        EmployeeService service = new EmployeeService();
        controller = new EmployeeController(service);

    }

    @Test
    void testEmployeeFound() {

        assertEquals("Sharlyn", controller.getEmployee(101));

    }

    @Test
    void testEmployeeNotFound() {

        assertEquals("Employee Not Found",
                controller.getEmployee(102));

    }

}