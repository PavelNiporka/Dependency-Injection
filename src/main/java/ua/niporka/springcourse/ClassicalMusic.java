package ua.niporka.springcourse;

import org.springframework.beans.factory.annotation.Autowired;

public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }



}
