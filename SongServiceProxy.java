package Q2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongServiceProxy implements SongService{
    private final RealSongService realService;
    private final Map<Integer, Song> cache = new HashMap<>();

    public SongServiceProxy() {
        this.realService = new RealSongService();
    }
    @Override
    public Song searchById(Integer songID) {
        if (cache.containsKey(songID)) {
            return cache.get(songID); // Return from cache
        } else {
            Song song = realService.searchById(songID); // Fetch from server
            cache.put(songID, song); // Store in cache
            return song;
        }
    }

    @Override
    public List<Song> searchByTitle(String title) {
        return realService.searchByTitle(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        return realService.searchByAlbum(album);
    }
}
