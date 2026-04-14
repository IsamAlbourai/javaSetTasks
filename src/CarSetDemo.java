import java.util.HashSet;
import java.util.Set;

public class CarSetDemo {

    public static void main(String[] args) {

        // Declare a Set variable and create a HashSet object
        Set<String> cars = new HashSet<>();

        // Add car names to the set
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Nissan");

        // Display initial car set
        System.out.println("Initial cars:");
        System.out.println(cars);

        // Add one more car
        cars.add("Mercedes");

        // Display set after adding a new car
        System.out.println("\nAfter adding Mercedes:");
        System.out.println(cars);

        // Try adding a duplicate car
        boolean duplicateAdded = cars.add("Toyota");

        // Display set after duplicate attempt
        System.out.println("\nAfter trying to add duplicate 'Toyota':");
        System.out.println("Was duplicate added? " + duplicateAdded);
        System.out.println(cars);

        // Explain duplicate behavior
        System.out.println("\nNote: Set does not store duplicate values.");

        // Check if a car exists
        boolean exists1 = cars.contains("BMW");

        // Display first contains check
        System.out.println("\nCheck if BMW exists: " + exists1);

        // Check for a non-existing car
        boolean exists2 = cars.contains("Tesla");

        // Display second contains check
        System.out.println("Check if Tesla exists: " + exists2);

        // Remove a car from the set
        cars.remove("Audi");

        // Display set after removal
        System.out.println("\nAfter removing Audi:");
        System.out.println(cars);

        // Optional extra removal
        cars.remove("Honda");

        // Display set after second removal
        System.out.println("\nAfter removing Honda:");
        System.out.println(cars);

        // Display current size
        System.out.println("\nCurrent number of cars: " + cars.size());

        // Add a new car
        cars.add("Kia");

        // Display updated set
        System.out.println("\nAfter adding Kia:");
        System.out.println(cars);

        // Display new size
        System.out.println("Updated size: " + cars.size());

        // Clear all cars
        cars.clear();

        // Display set after clearing
        System.out.println("\nAfter clearing all cars:");
        System.out.println(cars);

        // Confirm set is empty
        System.out.println("Final size: " + cars.size());

        // Final message
        System.out.println("The set now contains zero elements.");
    }
}
