public class Book {
    private final String author;
    private final String genre;
    private final String title;

    public Book(String title, String author, String genre) {
         this.title = title;
         this.author = author;
         this.genre = genre;
    }


    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getGenre() {
        return this.genre;
    }
}
