# Lab: 8.0.13

**Objective:**

- Understand the concept and importance of abstract classes in Java development.
- Learn how to implement abstract classes and methods in Java.
- Explore practical applications of abstract classes in real-world Java projects.
- Identify common pitfalls and best practices when working with abstract classes.
- Gain hands-on experience with a complete Java example that demonstrates abstract classes.

**Prerequisites:**

- Basic understanding of Java programming.
- Familiarity with creating classes and objects in Java.
- Understanding of inheritance in Java.
- Knowledge of method overriding.

**What You'll Achieve:**

- Develop a solid understanding of abstract classes and their role in Java.
- Implement practical examples that can be applied in real-world scenarios.
- Enhance your skills in object-oriented design and polymorphism.

**Assignment Details**

In this assignment, you will create a simple media library system using abstract classes. Follow these steps:

1. Create an abstract class called `MediaItem`:
    - Include protected fields for `title` (String) and `year` (int).
    - Add a constructor that initializes these fields.
    - Declare an abstract method `play()` that returns void.
    - Implement a concrete method `getInfo()` that returns a String with the title and year.
2. Create a concrete class `Book` that extends `MediaItem`:
    - Add a private field for `author` (String).
    - Implement a constructor that takes title, year, and author as parameters.
    - Implement the `play()` method to print "Reading [title] by [author]".
    - Override the `getInfo()` method to include the author information.
3. Create a concrete class `Movie` that extends `MediaItem`:
    - Add a private field for `director` (String).
    - Implement a constructor that takes title, year, and director as parameters.
    - Implement the `play()` method to print "Playing movie [title] directed by [director]".
    - Override the `getInfo()` method to include the director information.
4. Create a Music class that extends MediaItem:
    - Add private fields for `artist` and `duration` (in seconds, int).
    - Implement a constructor that takes title, year, artist, and duration as parameters.
    - Implement the `play()` method to print "Playing [title] by [artist]".
    - Override the `getInfo()` method to include the artist and duration information.
5. In the `main` method of a `MediaLibrary` class:
    - Create an array of `MediaItem` objects containing instances of `Book`, `Movie`, and `Music`.
    - Implement a method `playMedia(MediaItem item)` that calls the `play()` method on the given item.
    - Iterate through the array, print the info for each item, and then play it.

**Example Output**

```
Media Library Contents:

1. Book: "1984" by George Orwell (1949)
   Reading 1984 by George Orwell

2. Movie: "Inception" directed by Christopher Nolan (2010)
   Playing movie Inception directed by Christopher Nolan

3. Music: "Bohemian Rhapsody" by Queen (1975) - 5:55
   Playing Bohemian Rhapsody by Queen
```

**Starter Code**

The `TransformerBattle.java` file contains the following starter code:

```java
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

```

**Hints**

- Remember that you cannot create an instance of an abstract class directly.
- Use method overriding to implement the abstract methods in each concrete class.
- When creating the array of `MediaItem` objects, you can use polymorphism to store `Book`, `Movie`, and `Music` objects
  in it.
- In the `playMedia` method, you don't need to check the type of the `MediaItem` - this demonstrates polymorphism in
  action.
- For the `Music` class, consider converting the duration from seconds to minutes and seconds for display (e.g., 5:55
  instead of 355 seconds).

**Submission Instructions**

1. Fork the repository
2. Clone your fork
3. Navigate into the repository
4. Implement the required classes and methods
5. Test your implementation with various inputs
6. Git add, commit, and push to your fork
7. Submit a pull request
    - Set the title of the pull request to your first name and last name
    - In the comment, briefly explain your implementation approach and any challenges you faced

Remember, the goal is to learn and have fun! Don't hesitate to ask for help if you get stuck.