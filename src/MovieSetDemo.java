import java.util.Set;
import java.util.HashSet;

public class MovieSetDemo {

    public static void main(String[] args) {

        // Create a Set to store unique movie names
        Set<String> movies = new HashSet<>();

        // Add movie names to the set
        movies.add("Inception");
        movies.add("Interstellar");
        movies.add("The Dark Knight");
        movies.add("Titanic");
        movies.add("Avatar");

        // Display all movie names
        System.out.println("Movies:");
        System.out.println(movies);

        // Try to add a duplicate movie name
        movies.add("Inception");

        // Display set after duplicate attempt
        System.out.println("\nAfter attempting to add duplicate (Inception):");
        System.out.println(movies);

        // Check if a movie exists in the set
        boolean exists = movies.contains("Titanic");
        System.out.println("\nIs Titanic in the set? " + exists);

        // Remove a movie from the set
        movies.remove("Avatar");

        // Display set after removal
        System.out.println("\nAfter removing Avatar:");
        System.out.println(movies);

        // Display number of movies in the set
        int size = movies.size();
        System.out.println("\nNumber of movies: " + size);

        // Clear all movies from the set
        movies.clear();

        // Display set after clearing
        System.out.println("\nAfter clearing the set:");
        System.out.println(movies);

        // Confirm the set is empty
        System.out.println("Final size: " + movies.size());

        // Explanation:
        // Set stores only unique movie names, so duplicates are ignored.
        // It supports add, contains, remove, size, and clear operations.
    }
}