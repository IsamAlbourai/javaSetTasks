import java.util.HashSet;
import java.util.Set;

public class AnimalSetDemo {

    public static void main(String[] args) {

        // Declare a Set variable and create a HashSet object
        Set<String> animals = new HashSet<>();

        System.out.println("Adding initial animal names...");

        // Add animal names to the set
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Giraffe");
        animals.add("Zebra");

        // Display initial set
        System.out.println("Initial animals:");
        System.out.println(animals);

        System.out.println("\nAdding one more animal (Panda)...");
        animals.add("Panda");

        // Display after adding new animal
        System.out.println("After adding Panda:");
        System.out.println(animals);

        System.out.println("\nTrying to add duplicate animal (Lion)...");
        boolean duplicateAdded = animals.add("Lion");

        // Display after duplicate attempt
        System.out.println("Was duplicate added? " + duplicateAdded);
        System.out.println(animals);

        // Explain duplicate behavior
        System.out.println("\nNote: Set stores only unique animal names.");

        System.out.println("\nChecking if Tiger exists in the set...");
        boolean exists1 = animals.contains("Tiger");

        // Display successful contains check
        System.out.println("Tiger exists? " + exists1);

        System.out.println("\nChecking if Wolf exists in the set...");
        boolean exists2 = animals.contains("Wolf");

        // Display unsuccessful contains check
        System.out.println("Wolf exists? " + exists2);

        System.out.println("\nRemoving Elephant from the set...");
        animals.remove("Elephant");

        // Display after removal
        System.out.println("After removing Elephant:");
        System.out.println(animals);

        System.out.println("\nTrying to remove another animal (Zebra)...");
        animals.remove("Zebra");

        // Display after second removal
        System.out.println("After removing Zebra:");
        System.out.println(animals);

        // Display current size
        System.out.println("\nCurrent number of animals: " + animals.size());

        System.out.println("\nAdding new animal (Bear)...");
        animals.add("Bear");

        // Display updated set
        System.out.println("After adding Bear:");
        System.out.println(animals);

        // Display updated size
        System.out.println("Updated size: " + animals.size());

        System.out.println("\nClearing all animals from the set...");
        animals.clear();

        // Display after clearing
        System.out.println("After clearing:");
        System.out.println(animals);

        // Confirm final size
        System.out.println("Final size: " + animals.size());

        // Final message
        System.out.println("The set now contains zero elements.");
    }
}