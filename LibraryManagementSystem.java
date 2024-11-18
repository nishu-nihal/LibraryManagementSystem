import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LibraryManagementSystem {

    // Database connection details
    static final String DB_URL = "jdbc:mysql://localhost:3306/LibraryDB";
    static final String DB_USER = "root";
    static final String DB_PASS = "password";

    public static void main(String[] args) {
        new LibraryManagementSystem();
    }

    public LibraryManagementSystem() {
        // Initialize main frame
        JFrame frame = new JFrame("Library Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Main panel with options
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        JButton bookButton = new JButton("Manage Books");
        JButton userButton = new JButton("Manage Users");
        JButton borrowReturnButton = new JButton("Borrow/Return Book");
        JButton fineButton = new JButton("Calculate Fines");
        JButton searchButton = new JButton("Search and Filter");
        JButton statsButton = new JButton("View Reports and Statistics");

        panel.add(bookButton);
        panel.add(userButton);
        panel.add(borrowReturnButton);
        panel.add(fineButton);
        panel.add(searchButton);
        panel.add(statsButton);

        frame.add(panel);

        // Add listeners for each button
        bookButton.addActionListener(e -> manageBooks());
        userButton.addActionListener(e -> manageUsers());
        borrowReturnButton.addActionListener(e -> borrowReturnBook());
        fineButton.addActionListener(e -> calculateFines());
        searchButton.addActionListener(e -> searchFilterBooks());
        statsButton.addActionListener(e -> viewReports());

        frame.setVisible(true);
    }

    private void manageBooks() {
        // Frame for managing books
        JFrame bookFrame = new JFrame("Manage Books");
        bookFrame.setSize(400, 300);

        JLabel titleLabel = new JLabel("Title:");
        JTextField titleField = new JTextField(20);

        JLabel authorLabel = new JLabel("Author:");
        JTextField authorField = new JTextField(20);

        JLabel genreLabel = new JLabel("Genre:");
        JTextField genreField = new JTextField(20);

        JButton addButton = new JButton("Add Book");

        JPanel panel = new JPanel();
        panel.add(titleLabel);
        panel.add(titleField);
        panel.add(authorLabel);
        panel.add(authorField);
        panel.add(genreLabel);
        panel.add(genreField);
        panel.add(addButton);

        addButton.addActionListener(e -> {
            String title = titleField.getText();
            String author = authorField.getText();
            String genre = genreField.getText();

            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                 PreparedStatement stmt = conn.prepareStatement(
                         "INSERT INTO Books (Title, Author, Genre) VALUES (?, ?, ?)")) {

                stmt.setString(1, title);
                stmt.setString(2, author);
                stmt.setString(3, genre);
                stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Book Added Successfully!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        });

        bookFrame.add(panel);
        bookFrame.setVisible(true);
    }

    private void manageUsers() {
        // Similar implementation to manageBooks for managing users
    }

    private void borrowReturnBook() {
        // Implementation for borrowing and returning books
    }

    private void calculateFines() {
        // Implementation for calculating fines
    }

    private void searchFilterBooks() {
        // Implementation for search and filter functionality
    }

    private void viewReports() {
        // Implementation for reports and statistics
    }
}
