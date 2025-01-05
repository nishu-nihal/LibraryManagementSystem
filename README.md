# LibraryManagementSystem
Library Management System: Take Control of Your Book Collection This Java code provides a foundational framework for a simple library management system. It allows users to:

Create a library: Manage a collection of books with titles, authors, and availability status. Add books: Easily add new books to your library with their details. Borrow books: Simulate the borrowing process, marking books as unavailable. Return books: Track returned books, updating their availability status. List books: View a list of all books in the library, including their availability. This code serves as a starting point for building a more comprehensive library management system. Here are some potential enhancements:

Member Management: Include functionality for adding and managing members, allowing for tracking who borrows which books. Due Dates: Implement a system for assigning due dates to borrowed books and generating overdue notices. Search Functionality: Allow users to search for books by title, author, or keywords. Persistence: Save and load library data to a file or database for persistent storage. Graphical User Interface (GUI): Develop a user-friendly GUI application for easier interaction with the library system. This code demonstrates the basic principles of object-oriented programming and data structures (using ArrayLists) to manage a library collection. It's a valuable tool for practicing these concepts and provides a foundation for building a more robust library management system.
# Library Management System

## Objective
A simple yet efficient library management system with user-friendly features to manage books, users, transactions, and fines.

## Features
- **User-Friendly Interface**: Easy-to-use Swing GUI.
- **Book Management**: Add, view, search, and filter books.
- **User Management**: Manage user records with validation.
- **Borrow and Return Books**: Record transactions with fine calculation.
- **Real-Time Search**: Search for books dynamically.
- **Dark Mode Toggle**: UI toggle for light/dark themes.
- **Reporting and Statistics**: Generate summaries for library usage.

## Data Validation
- Ensures non-empty input fields.
- Validates email formats using regex.

## Code Quality
- Modularized code with reusable components.
- Constants for error messages and queries.

## Setup Instructions
1. Install MySQL and create the database using `resources/database.sql`.
2. Configure database credentials in `DatabaseConnection.java`.
3. Compile and run the project:
   ```bash
   javac -d bin src/*.java
   java -cp bin MainApp
