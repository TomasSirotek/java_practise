package unit_library_app;


import unit_library_app.models.Song;
import unit_library_app.repositories.SongRepo;
import java.util.ArrayList;

// Front end
public class LibraryApp {
        private final SongRepo songRepo = new SongRepo();

        public void searchSongByIsbn(String isbn){
               Song s =  songRepo.findByIsbn(isbn);
               if(s != null){
                       System.out.println(s.getAuthor());
               }else {
                       System.out.println("No records sorry :( ");
               }
        }
        public void searchByTitle(String keyWord){
            System.out.println("Searching by title");
            ArrayList<Song> repoSongs = songRepo.findByTitle(keyWord);
            System.out.println(repoSongs.size() > 0 ? "Found" : "No match");
            for (Song s : repoSongs){
                System.out.println(s.getTitle());
            }
        }

        // just fucking around
        public void addLike(String isbn,int amount){
            System.out.println("Adding like to song " + isbn);
            Song s =  songRepo.findByIsbn(isbn);
            if(s != null){
                System.out.println(s.getAuthor());
                s.setLikesCount(amount);
                int test  = s.getLikesCount();
                System.out.println(test);
            }else {
                System.out.println("No records sorry :( ");
            }
        }
}
