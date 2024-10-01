import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class BookTracker {

    ArrayList<Book> books;

    BookTracker(ArrayList<Book> books) {
        this.books = books;
    }

    public void readBook(String fileName) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            String title = data[0].trim();
            String author = data[1].trim();
            String genre = data[2].trim();
            int numberOfPages = Integer.parseInt(data[3].trim());
            int date = Integer.parseInt(data[4].trim());
            books.add(new Book(title, author, genre, date, numberOfPages));
            reader.close();
        }
    }

    public double averageBookLength() {
        int pages = 0;
        for (Book book : books) {
            pages += book.getNumberOfPages();
        }
        return (double) pages / (double) books.size();
    }

    public int totalBooksRead() {
        return books.size();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

}

