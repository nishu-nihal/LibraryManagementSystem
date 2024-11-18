import java.awt.*;
import javax.swing.*;

public class LibraryGUI extends JFrame {
    // Components for the GUI
    private JButton manageBooks, manageUsers, borrowReturn, searchFilter, viewReports;

    public LibraryGUI() {
        // Frame properties
        setTitle("Library Management System");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        // Buttons
        manageBooks = new JButton("Book Management");
        manageUsers = new JButton("User Management");
        borrowReturn = new JButton("Borrow/Return Books");
        searchFilter = new JButton("Search & Filter");
        viewReports = new JButton("View Reports");

        // Adding components
        add(manageBooks);
        add(manageUsers);
        add(borrowReturn);
        add(searchFilter);
        add(viewReports);

        // Action Listeners
        manageBooks.addActionListener(e -> JOptionPane.showMessageDialog(this, "Manage Books clicked"));
        manageUsers.addActionListener(e -> JOptionPane.showMessageDialog(this, "Manage Users clicked"));
        borrowReturn.addActionListener(e -> JOptionPane.showMessageDialog(this, "Borrow/Return clicked"));
        searchFilter.addActionListener(e -> JOptionPane.showMessageDialog(this, "Search & Filter clicked"));
        viewReports.addActionListener(e -> JOptionPane.showMessageDialog(this, "View Reports clicked"));

        setVisible(true);
    }

    public static void main(String[] args) {
        new LibraryGUI();
    }
}
