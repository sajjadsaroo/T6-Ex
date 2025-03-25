# Exception Handling - Library Management System

## Overview
This project is a **Library Management System** implemented in Java, focusing on **exception handling**. The system allows users to:
- Add books to the library.
- Borrow books.
- Return books.
- List available books.

The project ensures robustness by handling various exceptions to prevent crashes and provide meaningful error messages.

## Features
- **Custom Exceptions**: Handles errors using custom exception classes.
- **Exception Handling**: Uses `try-catch` blocks to manage errors gracefully.
- **Encapsulation**: Private fields with proper getters.
- **Java OOP Principles**: Uses classes and object-oriented concepts effectively.

## Classes
### 1. Exception Classes
These custom exceptions extend `Exception` and provide meaningful error messages:
- `BookNotFoundException` – Thrown when trying to borrow or return a non-existent book.
- `EmptyLibraryException` – Thrown when attempting to borrow from or list books in an empty library.
- `InvalidBookException` – Thrown when trying to add an invalid book (null book or empty title).

### 2. `Book` Class
Represents a book with:
- **Fields**: `title` (String), `pageCount` (int)
- **Methods**:
  - Constructor to initialize book details (throws `IllegalArgumentException` if invalid input)
  - `toString()` method to display book details.

### 3. `Library` Class
Manages book operations:
- **Fields**: `ArrayList<Book> books`
- **Methods**:
  - `addBook(Book book)` – Adds a book to the library (throws `InvalidBookException` if invalid).
  - `borrowBook(String title)` – Borrows a book (throws `EmptyLibraryException` or `BookNotFoundException`).
  - `returnBook(String title)` – Returns a borrowed book (throws `BookNotFoundException`).
  - `listBooks()` – Displays all books (throws `EmptyLibraryException` if none exist).

### 4. `Main` Class
Contains the `main()` method with `try-catch` blocks to test the library system and handle exceptions.

## Usage
1. **Compile the project:**
   ```sh
   javac Main.java
   ```
2. **Run the program:**
   ```sh
   java Main
   ```
