package ua.niporka.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony");
        songs.add("Night on Bald Mountain");
    }


    @Override
    public List<String> getSong() {
        return songs;
    }


}
