import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 464, 2014));
        books.add(new Book("The Innovators: How a Group of Hackers, Geniuses, and Geeks Created the Digital Revolution", "Walter Isaacson", 560, 2014));
        books.add(new Book("Astrophysics for People in a Hurry", "Neil deGrasse Tyson", 224, 2017));
        books.add(new Book("The Gene: An Intimate History", "Siddhartha Mukherjee", 608, 2016));
        books.add(new Book("Elon Musk: Tesla, SpaceX, and the Quest for a Fantastic Future", "Ashlee Vance", 400, 2015));
        books.add(new Book("The Code Book: The Science of Secrecy from Ancient Egypt to Quantum Cryptography", "Simon Singh", 432, 1999));
        books.add(new Book("The Emperor of All Maladies: A Biography of Cancer", "Siddhartha Mukherjee", 608, 2010));
        books.add(new Book("Guns, Germs, and Steel: The Fates of Human Societies", "Jared Diamond", 528, 1997));
        books.add(new Book("Thinking, Fast and Slow", "Daniel Kahneman", 512, 2011));
        books.add(new Book("The Wright Brothers", "David McCullough", 336, 2015));

        // Filtering by book title and author
        System.out.println("All Books");
        System.out.println("------------------------");
        Map<String, String> bookNameAndAuthor = new TreeMap<>();
        books.forEach(book -> bookNameAndAuthor.put(book.getBookName(), book.getAuthor()));
        bookNameAndAuthor.forEach((bookName, author) -> System.out.println("Book: " + bookName + " Author: " + author));
        System.out.println("------------------------");
        System.out.println();

        // Filter by page count
        System.out.println("Books Filtered by Page Number");
        System.out.println("------------------------");
        List<Book> filteredPageNumber = books.stream().filter(book -> book.getPageNumber() > 500).toList();
        filteredPageNumber.forEach(book -> System.out.println("Book: " + book.getBookName() + " Author: " + book.getAuthor() + " Page Amount: " + book.getPageNumber()));
        System.out.println("------------------------");
    }
}
