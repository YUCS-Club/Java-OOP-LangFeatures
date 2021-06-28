package com.csculb;

import java.util.UUID;

public class Movie {

    UUID id = UUID.randomUUID();
    String title = "No Title";
    String description = "No Description";
    boolean isAvailable;

    public Movie(String title, String description, boolean isAvailable) {
        this.title = title;
        this.description = description;
        this.isAvailable = isAvailable;
    }

}
