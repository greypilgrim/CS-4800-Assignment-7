package Q2;

import java.util.ArrayList;
import java.util.List;

public class RealSongService implements SongService{
    private final List<Song> songDatabase;

    public RealSongService() {
        // Initialize the song database (replace with actual songs)
        songDatabase = new ArrayList<>();
        songDatabase.add(new Song(1, "Imagine", "John Lennon", "Imagine Album", 240));
        songDatabase.add(new Song(2, "Bohemian Rhapsody", "Queen", "A Night at the Opera", 354));
        songDatabase.add(new Song(3, "Shape of You", "Ed Sheeran", "÷ (Divide)", 233));
        songDatabase.add(new Song(4, "Hotel California", "Eagles", "Hotel California", 390));
        songDatabase.add(new Song(5, "Billie Jean", "Michael Jackson", "Thriller", 294));
        // ... (add other songs)
    }

    @Override
    public Song searchById(Integer songID) {
        // Simulate fetching from the server (with delay)
        try {
            Thread.sleep(1000); // Simulate 1-second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Fetch actual metadata from the song database
        for (Song song : songDatabase) {
            if (song.getSongID().equals(songID)) {
                return song;
            }
        }

        // Return a default song (you can customize this behavior)
        return new Song(-1, "Unknown Song", "Unknown Artist", "Unknown Album", 0);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        // Simulate fetching from the server (with delay)
        try {
            Thread.sleep(1000); // Simulate 1-second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Song> songsWithTitle = new ArrayList<>();
        for (Song song : songDatabase) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                songsWithTitle.add(song);
            }
        }
        return songsWithTitle;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Song> songsWithAlbum = new ArrayList<>();
        for (Song song : songDatabase) {
            if (song.getAlbum().equalsIgnoreCase(album)) {
                songsWithAlbum.add(song);
            }
        }
        return songsWithAlbum;
    }
}
