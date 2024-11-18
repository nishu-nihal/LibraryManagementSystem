public class LibraryManagementSystem {
    private LibraryGUI gui;
    private LibraryDB database;

    public LibraryManagementSystem() {
        gui = new LibraryGUI();
        database = new LibraryDB();
    }

    public void manageBooks(String action, String title, String author, int year) {
        if (action.equalsIgnoreCase("add")) {
            database.addBook(title, author, year);
        } else {
            System.out.println("Unsupported book action.");
        }
    }

    public void manageUsers(String action, String name, String email) {
        if (action.equalsIgnoreCase("add")) {
            database.addUser(name, email);
        } else {
            System.out.println("Unsupported user action.");
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem system = new LibraryManagementSystem();

        // Example usage
        system.manageBooks("add", "Java Programming", "Author Name", 2023);
        system.manageUsers("add", "John Doe", "john@example.com");
    }
}
