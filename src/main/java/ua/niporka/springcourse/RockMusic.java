package ua.niporka.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Music1");
        songs.add("Music2");
        songs.add("Music3");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
