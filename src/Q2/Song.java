package Q2;

public class Song {
    private Integer songID; // Unique identifier for the song
    private String title;
    private String artist;
    private String album;
    private int duration;

    public Song(Integer songID, String title, String artist, String album, int duration) {
        this.songID = songID;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public void printInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Artist: " + this.artist);
        System.out.println("Album: " + this.album);
        System.out.println("Duration: " + this.duration + " seconds");
        System.out.println();
    }

    public Integer getSongID() {
        return this.songID;
    }

    public void setSongID(Integer songID) {
        this.songID = songID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
