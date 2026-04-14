import java.util.HashSet;
import java.util.Set;

public class CourseSetDemo2 {

    public static void main(String[] args) {

        // Declare a Set variable and create a HashSet object
        Set<String> courses = new HashSet<>();

        // Add initial course names to the set
        courses.add("Java");
        courses.add("Python");
        courses.add("Database");
        courses.add("Networking");
        courses.add("Web Design");

        // Display initial set of courses
        System.out.println("Initial courses:");
        System.out.println(courses);

        // Add one more unique course
        courses.add("Cyber Security");

        // Display set after adding a new course
        System.out.println("After adding Cyber Security:");
        System.out.println(courses);

        // Try adding a duplicate course
        boolean duplicateAdded = courses.add("Java");

        // Display set after attempting duplicate addition
        System.out.println("After trying to add duplicate 'Java':");
        System.out.println("Was duplicate added? " + duplicateAdded);
        System.out.println(courses);

        // Explain duplicate behavior
        System.out.println("Note: Duplicate values are not stored in a Set.");

        // Check if a course exists
        boolean exists1 = courses.contains("Python");

        // Display first contains check
        System.out.println("Check if Python exists: " + exists1);

        // Check for a non-existing course
        boolean exists2 = courses.contains("Artificial Intelligence");

        // Display second contains check
        System.out.println("Check if AI exists: " + exists2);

        // Remove a course from the set
        courses.remove("Database");

        // Display set after removal
        System.out.println("After removing Database:");
        System.out.println(courses);

        // Optional extra removal
        courses.remove("Networking");

        // Display set after second removal
        System.out.println("After removing Networking:");
        System.out.println(courses);

        // Display current size of set
        System.out.println("Current number of courses: " + courses.size());

        // Add another unique course
        courses.add("Machine Learning");

        // Display updated set
        System.out.println("After adding Machine Learning:");
        System.out.println(courses);

        // Display new size
        System.out.println("Updated size: " + courses.size());

        // Clear all courses
        courses.clear();

        // Display set after clearing
        System.out.println("After clearing all courses:");
        System.out.println(courses);

        // Confirm set is empty
        System.out.println("Final size: " + courses.size());

        // Final message
        System.out.println("The set now contains zero elements.");
    }
}
