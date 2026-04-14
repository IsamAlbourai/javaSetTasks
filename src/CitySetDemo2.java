import java.util.HashSet;
import java.util.Set;

public class CitySetDemo2 {

    public static void main(String[] args) {

        // Declare a Set variable and create a HashSet object
        Set<String> cities = new HashSet<>();

        // Add city names to the set
        cities.add("Muscat");
        cities.add("Salalah");
        cities.add("Sohar");
        cities.add("Nizwa");
        cities.add("Sur");

        // Display initial set of cities
        System.out.println("Initial cities:");
        System.out.println(cities);

        // Add one more city
        cities.add("Ibri");

        // Display set after adding a new city
        System.out.println("After adding Ibri:");
        System.out.println(cities);

        // Try adding a duplicate city
        boolean duplicateAdded = cities.add("Muscat");

        // Display set after duplicate attempt
        System.out.println("After trying to add duplicate 'Muscat':");
        System.out.println("Was duplicate added? " + duplicateAdded);
        System.out.println(cities);

        // Explain duplicate behavior
        System.out.println("Note: Set does not allow duplicate values.");

        // Check if a city exists
        boolean exists1 = cities.contains("Salalah");

        // Display first contains check
        System.out.println("Check if Salalah exists: " + exists1);

        // Check for a non-existing city
        boolean exists2 = cities.contains("Dubai");

        // Display second contains check
        System.out.println("Check if Dubai exists: " + exists2);

        // Remove a city from the set
        cities.remove("Sohar");

        // Display set after removal
        System.out.println("After removing Sohar:");
        System.out.println(cities);

        // Optional extra removal
        cities.remove("Nizwa");

        // Display set after second removal
        System.out.println("After removing Nizwa:");
        System.out.println(cities);

        // Display current size
        System.out.println("Current number of cities: " + cities.size());

        // Add a new city
        cities.add("Barka");

        // Display updated set
        System.out.println("\nAfter adding Barka:");
        System.out.println(cities);

        // Display new size
        System.out.println("Updated size: " + cities.size());

        // Clear all cities from the set
        cities.clear();

        // Display set after clearing
        System.out.println("After clearing all cities:");
        System.out.println(cities);

        // Confirm set is empty
        System.out.println("Final size: " + cities.size());

        // Final message
        System.out.println("The set now contains zero elements.");
    }
}
