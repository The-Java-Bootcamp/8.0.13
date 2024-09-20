package academy.javapro.lab;

abstract class MediaItem {
    protected String title;
    protected int year;

    // Constructor
    public MediaItem(String title, int year) {
        this.title = title;
        this.year = year;
    }

    // Abstract method
    public abstract void play();

    // Concrete method
    public String getInfo() {
        return title + " (" + year + ")";
    }
}

class Book extends MediaItem {
    private String author;

    // Implement constructor and methods
}

class Movie extends MediaItem {
    private String director;

    // Implement constructor and methods
}

class Music extends MediaItem {
    private String artist;
    private int duration;

    // Implement constructor and methods
}

public class MediaLibrary {
    public static void playMedia(MediaItem item) {
        // Implement this method
    }

    public static void main(String[] args) {
        // Create an array of MediaItem objects and demonstrate polymorphism
    }
}
