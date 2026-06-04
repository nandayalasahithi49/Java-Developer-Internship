
import java.util.*;

public class RecommendationSystem {

    public static void main(String[] args) {

        Map<String, Integer> products = new HashMap<>();

        products.put("Laptop", 5);
        products.put("Mobile", 4);
        products.put("Headphones", 3);
        products.put("Smart Watch", 5);
        products.put("Keyboard", 2);

        System.out.println("Recommended Products:");

        products.entrySet()
                .stream()
                .filter(product -> product.getValue() >= 4)
                .sorted((a, b) -> b.getValue() - a.getValue())
                .forEach(product ->
                        System.out.println(product.getKey()
                                + " Rating: "
                                + product.getValue()));
    }
}
