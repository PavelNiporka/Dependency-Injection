package ua.niporka.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }
//  private List<Music> musicList = new ArrayList<>();
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

    public void playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong());
       // System.out.println("Playing: " + rockMusic.getSong());


    }
//    public  void playMusicList() {
//        for (Music music : musicList)
//            System.out.println("Playing: " + music);
//
//
//    }

}
