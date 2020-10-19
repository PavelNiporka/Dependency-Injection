package ua.niporka.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sound.midi.Soundbank;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic(Musical.CLASSICALMUSIC);
        musicPlayer.playMusic(Musical.ROCKMUSIC);

        //  System.out.println(computer);

        //  Music music = context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();


        // MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//        Music music2 = context.getBean("rockMusic", Music.class);
//        MusicPlayer rockMusicPlayer = new MusicPlayer(music2);
//        rockMusicPlayer.playMusic();
//        Music music3 =context.getBean("jazzMusic",Music.class);
//        MusicPlayer jazzMusicPlayer  = new MusicPlayer(music3);
//        jazzMusicPlayer.playMusic();


//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;

//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//        firstMusicPlayer.setVolume(10);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
//      System.out.println(musicPlayer.getName());
//      System.out.println(musicPlayer.getVolume());


        context.close();

    }


}
