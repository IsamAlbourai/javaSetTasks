import java.util.HashSet;
import java.util.Set;

public class CountrySetDemo {

    public static void main(String[] args) {

        // Declare a Set variable and create a HashSet object
        Set<String> countries = new HashSet<>();

        // Add country names to the set
        countries.add("Oman");
        countries.add("UAE");
        countries.add("Saudi Arabia");
        countries.add("Qatar");
        countries.add("Bahrain");

        // Display initial countries
        System.out.println("Initial countries:");
        System.out.println(countries);

        // Add one more country
        countries.add("Kuwait");

        // Display set after adding a new country
        System.out.println("\nAfter adding Kuwait:");
        System.out.println(countries);

        // Try adding a duplicate country
        boolean duplicateAdded = countries.add("Oman");

        // Display set after duplicate attempt
        System.out.println("\nAfter trying to add duplicate 'Oman':");
        System.out.println("Was duplicate added? " + duplicateAdded);
        System.out.println(countries);

        // Explain duplicate behavior
        System.out.println("\nNote: Set allows only unique country names.");

        // Check if a country exists
        boolean exists1 = countries.contains("UAE");

        // Display first contains check
        System.out.println("\nCheck if UAE exists: " + exists1);

        // Check for a non-existing country
        boolean exists2 = countries.contains("Egypt");

        // Display second contains check
        System.out.println("Check if Egypt exists: " + exists2);

        // Remove a country from the set
        countries.remove("Qatar");

        // Display set after removal
        System.out.println("\nAfter removing Qatar:");
        System.out.println(countries);

        // Optional extra removal
        countries.remove("Bahrain");

        // Display set after second removal
        System.out.println("\nAfter removing Bahrain:");
        System.out.println(countries);

        // Display current size
        System.out.println("\nCurrent number of countries: " + countries.size());

        // Add a new country
        countries.add("Jordan");

        // Display updated set
        System.out.println("\nAfter adding Jordan:");
        System.out.println(countries);

        // Display new size
        System.out.println("Updated size: " + countries.size());

        // Clear all countries
        countries.clear();

        // Display set after clearing
        System.out.println("\nAfter clearing all countries:");
        System.out.println(countries);

        // Confirm set is empty
        System.out.println("Final size: " + countries.size());

        // Final message
        System.out.println("The set now contains zero elements.");
    }
}
