public class Book implements Comparable<Book> {
    private String bookName;
    private int pageCount;
    private String authorName;
    private Date publicationDate;

    public Book(String bookName, int pageCount, String authorName, Date publicationDate) {
        this.bookName = bookName;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.bookName.compareTo(otherBook.bookName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", pageCount=" + pageCount +
                ", authorName='" + authorName + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
