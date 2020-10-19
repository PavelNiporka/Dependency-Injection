package ua.niporka.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

//    private Music music1;
//    private Music music2;
//
//
//    @Autowired
//    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(Musical musical) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (musical == Musical.CLASSICALMUSIC) {
            System.out.println(classicalMusic.getSong().get(randomNumber));
        } else {
            System.out.println(rockMusic.getSong().get(randomNumber));
        }

    }


    //   private List<Music> musicList = new ArrayList<>();
//
//    private String name;
//    private int volume;
//    public MusicPlayer(List<Music> musicList) {
//        this.musicList = musicList;
//    }

//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
//

    // public MusicPlayer() {
    // }

    //  public void setMusic(Music music) {
    //   this.music = music;
    // }
//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }

//    public String playMusic() {
//        return "Playing: " + music1.getSong() + " , " + music2.getSong();
//        // System.out.println("Playing: " + rockMusic.getSong());
//
//    }

//    public void playMusicList() {
//        for (Music music : musicList)
//            System.out.println("Playing: " + music);
//
//
//    }


}
