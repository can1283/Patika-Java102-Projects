package BookProject;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sorted alphabetically:");

        Set<Book> books = new TreeSet<>();
        books.add(new Book("God, Human, Animal, Machine", 116, "Meghan O'Gieblyn", "July 12, 2022"));
        books.add(new Book("Genius Makers", 382, "Cade Metz", "March 16, 2021"));
        books.add(new Book("System Design Interview", 320, "Alex Xu", "June 12, 2020"));
        books.add(new Book("Designing Machine Learning Systems", 386, "Chip Huyen", "June 21, 2022"));
        books.add(new Book("Deep Learning", 800, "Ian Goodfellow", "November 18, 2016"));

        int count = 1;
        for (Book i : books) {
            System.out.print(count++ + " - ");
            System.out.println(i.toString());
        }

        System.out.println("Books Amount : " + (count-1));
        System.out.println();
        System.out.println("Sorted by number of pages:");

        Set<Book> books2 = new TreeSet<>(new OrderByNameComparator().reversed());
        books2.add(new Book("God, Human, Animal, Machine", 116, "Meghan O'Gieblyn", "July 12, 2022"));
        books2.add(new Book("Genius Makers", 382, "Cade Metz", "March 16, 2021"));
        books2.add(new Book("System Design Interview", 320, "Alex Xu", "June 12, 2020"));
        books2.add(new Book("Designing Machine Learning Systems", 386, "Chip Huyen", "June 21, 2022"));
        books2.add(new Book("Deep Learning", 800, "Ian Goodfellow", "November 18, 2016"));

        int count2 = 1;
        for (Book i : books2) {
            System.out.print(count2++ + " - ");
            System.out.println(i.toString());
        }

        System.out.println("Books Amount : " + (count2-1));


    }
}
