import java.util.Set;
import java.util.HashSet;

public class RemoveSetDemo {

    public static void main(String[] args) {

        Set<String> products = new HashSet<>();

        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Monitor");
        products.add("Printer");

        System.out.println("Products before removal:");
        System.out.println(products);

        products.remove("Keyboard");

        System.out.println("Products after removal:");
        System.out.println(products);

    }
}
