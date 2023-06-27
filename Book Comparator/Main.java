import java.util.*;
public static void main(String[] args) {
        Set<Book> bookSetByName = new HashSet<>();
        bookSetByName.add(new Book("Book C", 300, "Author1", new Date()));
        bookSetByName.add(new Book("Book A", 200, "Author2", new Date()));
        bookSetByName.add(new Book("Book E", 400, "Author3", new Date()));
        bookSetByName.add(new Book("Book D", 350, "Author4", new Date()));
        bookSetByName.add(new Book("Book B", 250, "Author5", new Date()));
  
        for (Book book : bookSetByName) {
            System.out.println(book);
        }

        Set<Book> bookSetByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        bookSetByPageCount.add(new Book("Book C", 300, "Author1", new Date()));
        bookSetByPageCount.add(new Book("Book A", 200, "Author2", new Date()));
        bookSetByPageCount.add(new Book("Book E", 400, "Author3", new Date()));
        bookSetByPageCount.add(new Book("Book D", 350, "Author4", new Date()));
        bookSetByPageCount.add(new Book("Book B", 250, "Author5", new Date()));

        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
