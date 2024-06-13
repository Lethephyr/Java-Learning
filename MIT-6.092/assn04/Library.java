import java.util.ArrayList;

public class Library {
    // Add the missing implementation to this class
    private String address;
    private int size;
    private ArrayList<Book> books;
    private static final String OPENINGHOUR = "Libraries are open daily from 9am to 5pm.";

    public static void printOpeningHours() {
        System.out.println(OPENINGHOUR);
    }
    
    public Library(String address) {
        this.address = address;
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void printAddress() {
        System.out.println(address);
    }

    private void borrowBook(String string) {
        for (Book book : books) {
            // if (book == null) break;
            if (book.getTitle().equals(string)) {
                if (book.isBorrowed()) {
                    System.err.println("Sorry, this book is already borrowed.");
                } else {
                    book.rented();
                    System.out.printf("You successfully borrowed %s\n", string);
                }
                return;
            }
        }
        System.err.println("Sorry, this book is not in our catalog.");
    }

    private void returnBook(String string) {
        for (Book book : books) {
            // if (book == null) break;
            if (book.getTitle().equals(string) && book.isBorrowed()) {
                book.returned();
                System.out.printf("You successfully returned %s\n", string);
                return;
            }
        }
        System.err.println("Something wrong happened.");
    }

    private void printAvailableBooks() {
        if (this.books.size()==0) {
            System.out.println("No book in catalog");
            return;
        }
        for (Book book : books) {
            if (book == null) break;
            if (!book.isBorrowed()) System.out.println(book);
        }
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
} 