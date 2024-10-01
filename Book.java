public class Book {
    private String title;
    private String author;
    private String genre;
    private int numOfPages;
    private int date;

    public Book(String title, String author, String genre, int numOfPages, int date) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.numOfPages = numOfPages;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public int getDate() {
        return date;
    }
    public int getNumberOfPages() {
        return numOfPages;
    }
}
