import java.util.Set;
import java.util.HashSet;

public class BookSetDemo {

    public static void main(String[] args) {

        // Create a Set to store unique book titles
        Set<String> books = new HashSet<>();

        // Add book titles to the set
        books.add("The Alchemist");
        books.add("To Kill a Mockingbird");
        books.add("1984");
        books.add("Harry Potter");
        books.add("The Hobbit");

        // Display all book titles
        System.out.println("Books:");
        System.out.println(books);

        // Attempt to add a duplicate book title
        books.add("1984");

        // Display set after duplicate attempt
        System.out.println("After attempting to add duplicate (1984):");
        System.out.println(books);

        // Check if a book exists in the set
        boolean exists = books.contains("The Hobbit");
        System.out.println("Is 'The Hobbit' in the set? " + exists);

        // Remove a book from the set
        books.remove("Harry Potter");

        // Display set after removal
        System.out.println("After removing 'Harry Potter':");
        System.out.println(books);

        // Display number of books in the set
        int size = books.size();
        System.out.println("Number of books: " + size);

        // Clear all book titles from the set
        books.clear();

        // Display set after clearing
        System.out.println("After clearing the set:");
        System.out.println(books);

        // Confirm the set is empty
        System.out.println("Final size: " + books.size());

        // Explanation:
        // Set stores only unique book titles, so duplicates are ignored.
        // It supports add, contains, remove, size, and clear operations.
    }
}
