public class LibraryBST {

    private Node root;

    // Insert Book
    public void insert(Book book) {
        root = insertRec(root, book);
    }

    private Node insertRec(Node root, Book book) {

        if (root == null)
            return new Node(book);

        if (book.getBookId() < root.book.getBookId())
            root.left = insertRec(root.left, book);

        else if (book.getBookId() > root.book.getBookId())
            root.right = insertRec(root.right, book);

        return root;
    }

    // Search Book
    public Book search(int id) {

        Node current = root;

        while (current != null) {

            if (id == current.book.getBookId())
                return current.book;

            if (id < current.book.getBookId())
                current = current.left;
            else
                current = current.right;
        }

        return null;
    }

    // Display Books
    public void displayBooks() {

        System.out.println("\nLibrary Books");
        System.out.println("--------------------------");

        inorder(root);

    }

    private void inorder(Node root) {

        if (root != null) {

            inorder(root.left);

            System.out.println(root.book);
            System.out.println("--------------------------");

            inorder(root.right);

        }

    }

}