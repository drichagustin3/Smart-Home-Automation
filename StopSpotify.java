public class StopSpotify implements COMmand { //stopsmusic

    private Spotify musicPlayer;

    public StopSpotify(Spotify musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.stop();
    }

}
