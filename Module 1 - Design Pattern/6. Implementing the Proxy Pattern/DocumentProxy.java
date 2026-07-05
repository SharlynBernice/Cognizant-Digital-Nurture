// Proxy Class
public class DocumentProxy implements Document {

    private String role;
    private ConfidentialDocument confidentialDocument;

    public DocumentProxy(String role) {
        this.role = role;
    }

    @Override
    public void openDocument() {

        if (role.equalsIgnoreCase("Manager")) {

            if (confidentialDocument == null) {
                confidentialDocument = new ConfidentialDocument();
            }

            confidentialDocument.openDocument();

        } else {

            System.out.println("Access Denied!");
            System.out.println("Only Managers can access confidential documents.");
        }
    }
}