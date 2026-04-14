import java.util.HashSet;
import java.util.Set;

public class WebsiteSetDemo {

    public static void main(String[] args) {

        // Create a Set using HashSet
        Set<String> websites = new HashSet<>();

        // Add website names to the set
        websites.add("google.com");
        websites.add("youtube.com");
        websites.add("github.com");
        websites.add("stackoverflow.com");
        websites.add("wikipedia.org");

        // Display all websites
        System.out.println("Initial websites set:");
        System.out.println(websites);

        // Try adding a duplicate website
        boolean added = websites.add("google.com");

        // Display set after attempting duplicate add
        System.out.println("After trying to add duplicate:");
        System.out.println("Duplicate added? " + added);
        System.out.println(websites);

        // Check if a website exists in the set
        boolean exists = websites.contains("github.com");

        // Display contains result
        System.out.println("Check if github.com exists: " + exists);

        // Remove a website from the set
        websites.remove("stackoverflow.com");

        // Display set after removal
        System.out.println("After removing a website:");
        System.out.println(websites);

        // Display number of websites
        System.out.println("Size of set: " + websites.size());

        // Clear all websites from the set
        websites.clear();

        // Display set after clearing
        System.out.println("After clearing:");
        System.out.println(websites);

        // Confirm set is empty
        System.out.println("Final size: " + websites.size());
    }
}