package unit_library_app.repositories;

import unit_library_app.models.Song;
import java.util.ArrayList;

// contains all the songs
public class SongRepo {
    private final ArrayList<Song> songArrayList = new ArrayList<>();

    public SongRepo(){
        songArrayList.add(new Song("39214","I kissed the girl","Pop","Very beautiful song","Katy Perry"));
        songArrayList.add(new Song("59605","Heroin","Rap","Rap song about rap","Momo "));
    }

    public Song findByIsbn(String isbn){
        for (Song s : songArrayList){
            if(s.getIsbn().equals(isbn)){
                return s;
            }
        }
        return null;
    }

    public ArrayList<Song> findByTitle(String keyWord){
        ArrayList<Song> fetchedSongs = new ArrayList<>();
        for (Song s : songArrayList){
            if(s.getTitle().toLowerCase().contains(keyWord.toLowerCase())){
                fetchedSongs.add(s);
            }
        }
        return fetchedSongs;
    }

}
