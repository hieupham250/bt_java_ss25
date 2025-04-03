package bai4;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new Adapter("mp4");
        player.play("mp4", "video.mp4");

        player = new Adapter("vlc");
        player.play("vlc", "movie.vlc");
    }
}
