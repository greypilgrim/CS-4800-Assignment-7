package Q2;

import java.util.List;

public class Q2Driver {
    public static void main(String[] args){
        SongService songService = new SongServiceProxy();

        // Create sample songs
        Song song1 = new Song(1, "Imagine", "John Lennon", "Imagine Album", 240);
        Song song2 = new Song(2, "Bohemian Rhapsody", "Queen", "A Night at the Opera", 354);
        Song song3 = new Song(3 ,"Shape of You", "Ed Sheeran", "÷ (Divide)", 233);
        Song song4 = new Song(4 ,"Hotel California", "Eagles", "Hotel California", 390);
        Song song5 = new Song(5 ,"Billie Jean", "Michael Jackson", "Thriller", 294);

        // Search for a song by title using both proxy and real server calls
        String searchTitle = "Imagine";

        // Measure response time for the proxy
        long proxyStartTime = System.currentTimeMillis();
        List<Song> proxySearchResult = songService.searchByTitle(searchTitle);
        long proxyEndTime = System.currentTimeMillis();
        System.out.println("Proxy response time: " + (proxyEndTime - proxyStartTime) + " ms");
        System.out.println("Proxy search result: " + proxySearchResult);

        // Measure response time for the real server
        long realServerStartTime = System.currentTimeMillis();
        List<Song> realServerSearchResult = new RealSongService().searchByTitle(searchTitle);
        long realServerEndTime = System.currentTimeMillis();
        System.out.println("Real server response time: " + (realServerEndTime - realServerStartTime) + " ms");
        System.out.println("Real server search result: " + realServerSearchResult);

        // Compare response times
        if (proxyEndTime - proxyStartTime < realServerEndTime - realServerStartTime) {
            System.out.println("Proxy is faster!");
        } else {
            System.out.println("Real server is faster!");
        }
    }
}
