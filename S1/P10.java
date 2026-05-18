
class BookUnavailableException extends Exception {
    public BookUnavailableException(String message) {
        super(message);
    }
}

class Book {

    private int copiesAvailable;

    public Book(int copiesAvailable) {
        if (copiesAvailable < 0) {
            throw new IllegalArgumentException("Invalid number of copies!");
        }
        this.copiesAvailable = copiesAvailable;
    }

    public void issueBook() throws BookUnavailableException {
        if (copiesAvailable <= 0) {
            throw new BookUnavailableException("No copies available!");
        }

        copiesAvailable--; 
        System.out.println("Book issued successfully!");
    }


    public void returnBook() {
        copiesAvailable++; 
        System.out.println("Book returned successfully!");
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }
}


public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book(1);

        try {
            book.issueBook(); 
            book.issueBook(); 
        } catch (BookUnavailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        book.returnBook();
        System.out.println("Available copies: " + book.getCopiesAvailable());
    }
}
