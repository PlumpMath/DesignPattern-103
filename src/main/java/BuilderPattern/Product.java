package BuilderPattern;

import java.util.LinkedList;

/**
 * Created by patch on 1/31/17.
 */
public class Product {
    private LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<>();
    }

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("\n Product completed as below :");
        for (int i = 0; i < parts.size(); i++) {
            System.out.println(parts.get(i));
        }
    }
}
