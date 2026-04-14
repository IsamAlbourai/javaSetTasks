import java.util.Set;
import java.util.HashSet;

public class ClearSetDemo {

    public static void main(String[] args) {

        Set<String> users = new HashSet<>();

        users.add("Ali");
        users.add("Sara");
        users.add("John");
        users.add("Mona");
        users.add("David");

        System.out.println("Users before clearing:");
        System.out.println(users);

        System.out.println("Number of users before clearing: " + users.size());

        users.clear();

        System.out.println("Users after clearing:");
        System.out.println(users);

        System.out.println("Number of users after clearing: " + users.size());

        // After using clear(), all elements are removed and the set becomes empty (size = 0).
    }
}
