import java.util.Set;
import java.util.HashSet;

public class CitySetDemo {

    public static void main(String[] args) {

        // Create a Set to store unique city names
        Set<String> cities = new HashSet<>();

        // Add city names to the set
        cities.add("Muscat");
        cities.add("Dubai");
        cities.add("Doha");
        cities.add("Riyadh");
        cities.add("Kuwait City");

        // Display all cities
        System.out.println("Cities:");
        System.out.println(cities);

        // Try adding a duplicate city
        cities.add("Dubai");

        // Display set after duplicate attempt
        System.out.println("After attempting to add duplicate (Dubai):");
        System.out.println(cities);

        // Check if a city exists in the set
        boolean exists = cities.contains("Doha");
        System.out.println("Is Doha in the set? " + exists);

        // Remove a city from the set
        cities.remove("Riyadh");

        // Display set after removal
        System.out.println("After removing Riyadh:");
        System.out.println(cities);

        // Display number of cities in the set
        int size = cities.size();
        System.out.println("Number of cities: " + size);

        // Clear all cities from the set
        cities.clear();

        // Display set after clearing
        System.out.println("After clearing the set:");
        System.out.println(cities);

        // Confirm the set is empty
        System.out.println("Final size: " + cities.size());

        // Explanation:
        // Set stores only unique city names, ignores duplicates,
        // supports checking, removal, counting, and clearing operations.
    }
}