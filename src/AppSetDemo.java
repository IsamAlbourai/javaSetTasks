import java.util.Set;
import java.util.HashSet;

public class AppSetDemo {

    public static void main(String[] args) {

        // Create a Set to store unique mobile app names
        Set<String> apps = new HashSet<>();

        // Add mobile app names to the set
        apps.add("WhatsApp");
        apps.add("Instagram");
        apps.add("YouTube");
        apps.add("Snapchat");
        apps.add("Telegram");

        // Display all app names
        System.out.println("Apps:");
        System.out.println(apps);

        // Try to add a duplicate app name
        apps.add("YouTube");

        // Display set after duplicate attempt
        System.out.println("After attempting to add duplicate (YouTube):");
        System.out.println(apps);

        // Check if an app exists in the set
        boolean exists = apps.contains("Instagram");
        System.out.println("Is Instagram in the set? " + exists);

        // Remove an app from the set
        apps.remove("Snapchat");

        // Display set after removal
        System.out.println("After removing Snapchat:");
        System.out.println(apps);

        // Display number of apps in the set
        int size = apps.size();
        System.out.println("Number of apps: " + size);

        // Clear all apps from the set
        apps.clear();

        // Display set after clearing
        System.out.println("After clearing the set:");
        System.out.println(apps);

        // Confirm the set is empty
        System.out.println("Final size: " + apps.size());

        // Explanation:
        // Set stores only unique app names, so duplicates are ignored.
        // It supports add, contains, remove, size, and clear operations.
    }
}