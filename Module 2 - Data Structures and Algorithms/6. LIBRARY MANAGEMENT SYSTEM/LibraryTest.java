public class LibraryTest {

    public static void main(String[] args) {

        LibraryBST library = new LibraryBST();

        library.insert(new Book(104, "Clean Code", "Robert C. Martin"));
        library.insert(new Book(101, "Java Programming", "Herbert Schildt"));
        library.insert(new Book(103, "Data Structures", "Mark Allen Weiss"));
        library.insert(new Book(102, "Algorithms", "Robert Sedgewick"));
        library.insert(new Book(105, "Operating Systems", "Abraham Silberschatz"));

        library.displayBooks();

        System.out.println("\nSearching Book...\n");

        Book book = library.search(103);

        if (book != null)
            System.out.println(book);
        else
            System.out.println("Book not found.");

    }

}