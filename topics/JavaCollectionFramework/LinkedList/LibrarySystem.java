import java.util.*;

class Book {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LinkedList<Book> books = new LinkedList<>();

        books.add(new Book(101, "Java Basics", "Rahim"));
        books.add(new Book(102, "OOP Concepts", "Karim"));
        books.add(new Book(103, "Data Structure", "Ayesha"));
        books.add(new Book(104, "Database System", "Lima"));
        books.add(new Book(105, "Operating System", "Hasan"));

        System.out.println("Books on special shelf:");
        for (Book b : books) {
            System.out.println(b);
        }

        System.out.println("\nIssued Book: " + books.removeFirst());

        // System.out.println("\nIssued Book: " + books.remove(0));

        System.out.println("\nLast available book: " + books.getLast());

        System.out.println("\nUpdated book list:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}