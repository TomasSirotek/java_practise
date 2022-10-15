package unit_library_app.models;

public class Song {
    private String isbn;
    private String title;
    private String genre;
    private String description;
    private String author;

    private int likesCount;

    public Song(String isbn, String title, String genre, String description, String author){
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.author = author;
        this.likesCount = 0;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setLikesCount(int amount){
        this.likesCount += amount;
    }
    public int getLikesCount(){
       return likesCount;
    }
}
