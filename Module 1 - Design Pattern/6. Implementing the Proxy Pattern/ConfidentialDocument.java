// Real Subject
public class ConfidentialDocument implements Document {

    @Override
    public void openDocument() {
        System.out.println("Opening Confidential Document...");
        System.out.println("Document Content: Company Financial Report");
    }
}