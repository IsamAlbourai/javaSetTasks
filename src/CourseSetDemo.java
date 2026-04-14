import java.util.Set;
import java.util.HashSet;

public class CourseSetDemo {

    public static void main(String[] args) {

        // Create a Set to store unique course names
        Set<String> courses = new HashSet<>();

        // Add course names to the set
        courses.add("Java Programming");
        courses.add("Python Basics");
        courses.add("Web Development");
        courses.add("Data Structures");
        courses.add("Database Systems");

        // Display all courses
        System.out.println("Courses:");
        System.out.println(courses);

        // Attempt to add a duplicate course
        courses.add("Java Programming");

        // Display set after duplicate attempt
        System.out.println("After attempting to add duplicate (Java Programming):");
        System.out.println(courses);

        // Check if a course exists in the set
        boolean exists = courses.contains("Python Basics");
        System.out.println("Is Python Basics in the set? " + exists);

        // Remove a course from the set
        courses.remove("Web Development");

        // Display set after removal
        System.out.println("After removing Web Development:");
        System.out.println(courses);

        // Display number of courses in the set
        int size = courses.size();
        System.out.println("Number of courses: " + size);

        // Clear all courses from the set
        courses.clear();

        // Display set after clearing
        System.out.println("After clearing the set:");
        System.out.println(courses);

        // Confirm the set is empty
        System.out.println("Final size: " + courses.size());

        // Explanation:
        // Set stores only unique values, so duplicates are ignored.
        // It supports add, contains, remove, size, and clear operations.
    }
}
