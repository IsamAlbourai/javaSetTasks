import java.util.HashSet;
import java.util.Set;

public class SubjectSetDemo {

    public static void main(String[] args) {

        // Declare a Set variable and create a HashSet object
        Set<String> subjects = new HashSet<>();

        // Add subject names to the set
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("English");
        subjects.add("History");
        subjects.add("Computer");

        // Display initial subjects
        System.out.println("Initial subjects:");
        System.out.println(subjects);

        // Add one more subject
        subjects.add("Physics");

        // Display set after adding a new subject
        System.out.println("\nAfter adding Physics:");
        System.out.println(subjects);

        // Try adding a duplicate subject
        boolean duplicateAdded = subjects.add("Math");

        // Display set after duplicate attempt
        System.out.println("\nAfter trying to add duplicate 'Math':");
        System.out.println("Was duplicate added? " + duplicateAdded);
        System.out.println(subjects);

        // Explain duplicate behavior
        System.out.println("\nNote: Set allows only unique subject names.");

        // Check if a subject exists
        boolean exists1 = subjects.contains("Science");

        // Display first contains check
        System.out.println("\nCheck if Science exists: " + exists1);

        // Check for a non-existing subject
        boolean exists2 = subjects.contains("Biology");

        // Display second contains check
        System.out.println("Check if Biology exists: " + exists2);

        // Remove a subject
        subjects.remove("History");

        // Display set after removal
        System.out.println("\nAfter removing History:");
        System.out.println(subjects);

        // Optional extra removal
        subjects.remove("English");

        // Display set after second removal
        System.out.println("\nAfter removing English:");
        System.out.println(subjects);

        // Display current size
        System.out.println("\nCurrent number of subjects: " + subjects.size());

        // Add a new subject
        subjects.add("Art");

        // Display updated set
        System.out.println("\nAfter adding Art:");
        System.out.println(subjects);

        // Display new size
        System.out.println("Updated size: " + subjects.size());

        // Clear all subjects
        subjects.clear();

        // Display set after clearing
        System.out.println("\nAfter clearing all subjects:");
        System.out.println(subjects);

        // Confirm set is empty
        System.out.println("Final size: " + subjects.size());

        // Final message
        System.out.println("The set now contains zero elements.");
    }
}
