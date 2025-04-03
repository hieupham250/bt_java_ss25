package bai4;

public class Adapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public Adapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new AdvancedMediaPlayer() {
                @Override
                public void playMp4(String fileName) {
                    System.out.println("Playing mp4 file: " + fileName);
                }

                @Override
                public void playVlc(String fileName) {

                }


            };
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new AdvancedMediaPlayer() {
                @Override
                public void playMp4(String fileName) {
                }

                @Override
                public void playVlc(String fileName) {
                    System.out.println("Playing vlc file: " + fileName);
                }
            };
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        }
    }
}
