public class PlaySpotify implements COMmand { //playsmusic

    private Spotify musicPlayer;
    private String playlist;

    public PlaySpotify(Spotify musicPlayer, String playlist) {
        this.musicPlayer = musicPlayer;
        this.playlist = playlist;
    }

    @Override
    public void execute() {
        musicPlayer.play(playlist);
    }

}