public class Book {
    private String bookName;
    private String author;
    private int pageNumber;
    private int date;

    public Book(String bookName, String author, int pageNumber, int date) {
        this.bookName = bookName;
        this.author = author;
        this.pageNumber = pageNumber;
        this.date = date;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
