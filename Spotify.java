public class Spotify { //MusicPlayer

	private boolean isPlaying;
    private int volume;
    private String playlist;

    public Spotify() {
        isPlaying = false;
        volume = 50;
        playlist = "None";
    }

    public void play(String playlist) {
        this.playlist = playlist;
        isPlaying = true;

        System.out.println("Music player is PLAYING.");
        System.out.println("Playlist: " + playlist);
    }

    public void stop() {
        isPlaying = false;
        System.out.println("Music player is STOPPED.");
    }

    public void increaseVolume() {
        volume++;
        System.out.println("Volume increased to " + volume + "%.");
    }

    public void decreaseVolume() {
        volume--;
        System.out.println("Volume decreased to " + volume + "%.");
    }
}
