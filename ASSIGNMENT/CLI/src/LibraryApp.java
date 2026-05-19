import java.util.*;

// Main class - Console menu for Library Management System
public class LibraryApp {
    static Scanner sc = new Scanner(System.in);
    static Library library = new Library("data/library_data.txt");

    public static void main(String[] args) {
        // Add sample books if library is empty
        if (library.books.size() == 0) {
            library.addBook("The Alchemist", "Paulo Coelho", "Fiction", 1988);
            library.addBook("Atomic Habits", "James Clear", "Self-Help", 2018);
            library.addBook("The Art of War", "Sun Tzu", "Philosophy", 1910);
            library.addBook("Sapiens", "Yuval Noah Harari", "History", 2011);
            library.addBook("Rich Dad Poor Dad", "Robert Kiyosaki", "Finance", 1997);
            System.out.println("5 sample books loaded.\n");
        }

        int choice;
        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Search Books");
            System.out.println("6. Sort Books");
            System.out.println("7. Borrow Book");
            System.out.println("8. Return Book");
            System.out.println("9. Export Report (File Handling)");
            System.out.println("0. Save & Exit");
            System.out.print("Enter choice: ");
            choice = readInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    updateBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    searchBooks();
                    break;
                case 6:
                    sortBooks();
                    break;
                case 7:
                    borrowBook();
                    break;
                case 8:
                    returnBook();
                    break;
                case 9:
                    exportReport();
                    break;
                case 0:
                    library.saveToFile();
                    System.out.println("Data saved. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Returning to main menu...");
            }
        } while (choice != 0);
    }

    // Display table header
    static void printHeader() {
        System.out.println("  ----------------------------------------------------------------------------------");
        System.out.printf("  %-4s %-28s %-18s %-12s %-6s %-10s%n", "ID", "Title", "Author", "Genre", "Year", "Status");
        System.out.println("  ----------------------------------------------------------------------------------");
    }

    // 1. Add Book
    static void addBook() {
        System.out.println("\n--- Add New Book (type 'back' to return) ---");
        System.out.print("Title: ");
        String title = sc.nextLine();
        if (title.equalsIgnoreCase("back")) return;

        System.out.print("Author: ");
        String author = sc.nextLine();
        if (author.equalsIgnoreCase("back")) return;

        System.out.print("Genre: ");
        String genre = sc.nextLine();
        if (genre.equalsIgnoreCase("back")) return;

        System.out.print("Year: ");
        int year = readInt();

        Book book = library.addBook(title, author, genre, year);
        System.out.println("Book added! ID: " + book.id);
    }

    // 2. View All Books
    static void viewBooks() {
        System.out.println("\n--- All Books ---");
        if (library.books.isEmpty()) {
            System.out.println("No books found.");
            return;
        }
        printHeader();
        for (Book b : library.books) {
            b.display();
        }
        System.out.println("  Total: " + library.books.size() + " books");
    }

    // 3. Update Book
    static void updateBook() {
        System.out.println("\n--- Update Book ---");
        System.out.print("Enter Book ID: ");
        int id = readInt();
        Book book = library.getBookById(id);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        System.out.println("Current: " + book.title + " by " + book.author);
        System.out.print("New Title (press Enter to skip): ");
        String title = sc.nextLine();
        System.out.print("New Author (press Enter to skip): ");
        String author = sc.nextLine();
        System.out.print("New Genre (press Enter to skip): ");
        String genre = sc.nextLine();
        System.out.print("New Year (0 to skip): ");
        int year = readInt();

        library.updateBook(id, title, author, genre, year);
        System.out.println("Book updated!");
    }

    // 4. Delete Book
    static void deleteBook() {
        System.out.println("\n--- Delete Book ---");
        System.out.print("Enter Book ID: ");
        int id = readInt();

        if (library.deleteBook(id)) {
            System.out.println("Book deleted!");
        } else {
            System.out.println("Book not found!");
        }
    }

    // 5. Search Books
    static void searchBooks() {
        System.out.println("\n--- Search Books ---");
        System.out.println("1. Search by Title");
        System.out.println("2. Search by Author");
        System.out.println("0. Back to Main Menu");
        System.out.print("Choice: ");
        int choice = readInt();

        if (choice == 0) return;
        if (choice != 1 && choice != 2) {
            System.out.println("Invalid choice! Returning to main menu...");
            return;
        }

        System.out.print("Enter keyword: ");
        String keyword = sc.nextLine();

        ArrayList<Book> results;
        if (choice == 1) {
            results = library.searchByTitle(keyword);
        } else {
            results = library.searchByAuthor(keyword);
        }

        if (results.isEmpty()) {
            System.out.println("No results found.");
        } else {
            printHeader();
            for (Book b : results) {
                b.display();
            }
            System.out.println("  Found: " + results.size() + " books");
        }
    }

    // 6. Sort Books
    static void sortBooks() {
        System.out.println("\n--- Sort Books ---");
        System.out.println("1. Sort by Title");
        System.out.println("2. Sort by Year");
        System.out.println("0. Back to Main Menu");
        System.out.print("Choice: ");
        int choice = readInt();

        if (choice == 0) return;
        if (choice != 1 && choice != 2) {
            System.out.println("Invalid choice! Returning to main menu...");
            return;
        }

        ArrayList<Book> sorted;
        if (choice == 1) {
            sorted = library.sortByTitle();
        } else {
            sorted = library.sortByYear();
        }

        printHeader();
        for (Book b : sorted) {
            b.display();
        }
    }

    // Helper - read integer safely
    static int readInt() {
        while (true) {
            try {
                int num = Integer.parseInt(sc.nextLine().trim());
                return num;
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid number: ");
            }
        }
    }

    // 7. Borrow Book
    static void borrowBook() {
        System.out.println("\n--- Borrow Book ---");
        System.out.print("Enter Book ID: ");
        int id = readInt();
        if (library.borrowBook(id)) {
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Cannot borrow! Book not found or already borrowed.");
        }
    }

    // 8. Return Book
    static void returnBook() {
        System.out.println("\n--- Return Book ---");
        System.out.print("Enter Book ID: ");
        int id = readInt();
        if (library.returnBook(id)) {
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Cannot return! Book not found or not borrowed.");
        }
    }

    // 9. Export Report (File Handling)
    static void exportReport() {
        System.out.println("\n--- Export Report to File ---");
        String path = library.exportReport();
        if (path != null) {
            System.out.println("Report exported successfully!");
            System.out.println("Saved to: " + path);
        } else {
            System.out.println("Failed to export report!");
        }
    }

}
