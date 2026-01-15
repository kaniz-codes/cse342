class Book {
    String title, author;
    int yearPublished;
    Book()
    {
        this.title = "Java: The Complete Reference";
        this.author = "Herbert Schildt";
        this.yearPublished = 2018;
    }
    Book(String title, String author, int yearPublished)
    {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    void displayInfo()
    {
        System.out.println("Title: "+ title + " Author: " + author +" Year Published: " + yearPublished);
    }
}
public class task2 {
    public static void main (String args[])
    {
        Book B1 = new Book();
        Book B2 = new Book("Atomic Habits", "James Clear", 2018);

        B1.displayInfo();
        B2.displayInfo();

    }
}
