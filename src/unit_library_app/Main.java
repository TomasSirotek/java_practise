package unit_library_app;

public class Main {
    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        app.searchSongByIsbn("39214");
        app.searchByTitle("heroin");

        app.addLike("39214",1);
        app.addLike("39214",1);
    }
}
