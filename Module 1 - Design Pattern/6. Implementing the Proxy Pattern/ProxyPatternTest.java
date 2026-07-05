// Client
public class ProxyPatternTest {

    public static void main(String[] args) {

        System.out.println("Employee Login");
        Document employee = new DocumentProxy("Employee");
        employee.openDocument();

        System.out.println();

        System.out.println("Manager Login");
        Document manager = new DocumentProxy("Manager");
        manager.openDocument();
    }
}