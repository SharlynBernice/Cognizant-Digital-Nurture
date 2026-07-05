// Client
public class CommandPatternTest {

    public static void main(String[] args) {

        Document document = new Document();

        Editor editor = new Editor();

        System.out.println("Opening Document");
        editor.setCommand(new OpenCommand(document));
        editor.executeCommand();

        System.out.println();

        System.out.println("Saving Document");
        editor.setCommand(new SaveCommand(document));
        editor.executeCommand();

        System.out.println();

        System.out.println("Printing Document");
        editor.setCommand(new PrintCommand(document));
        editor.executeCommand();
    }
}