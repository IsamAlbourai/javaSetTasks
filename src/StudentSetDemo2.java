import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo2 {

    public static void main(String[] args) {

        // Create a Set using HashSet
        Set<String> students = new HashSet<>();

        // Add student names to the set
        students.add("Ali");
        students.add("Sara");
        students.add("Omar");
        students.add("Noor");
        students.add("Aisha");

        // Display all students
        System.out.println("Initial student set:");
        System.out.println(students);

        // Try adding a duplicate student
        boolean added = students.add("Ali");

        // Display set after duplicate attempt
        System.out.println("After trying to add duplicate:");
        System.out.println("Duplicate added? " + added);
        System.out.println(students);

        // Check if a student exists in the set
        boolean exists = students.contains("Sara");

        // Display contains result
        System.out.println("Check if Sara exists: " + exists);

        // Remove a student from the set
        students.remove("Omar");

        // Display set after removal
        System.out.println("After removing a student:");
        System.out.println(students);

        // Display number of students
        System.out.println("Size of student set: " + students.size());

        // Clear all students from the set
        students.clear();

        // Display set after clearing
        System.out.println("After clearing:");
        System.out.println(students);

        // Confirm set is empty
        System.out.println("Final size: " + students.size());
    }
}