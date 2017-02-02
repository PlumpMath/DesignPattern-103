package IteratorPattern;

/**
 * Created by patch on 1/30/17.
 */
public interface Iterator {
    void first();
    String next();
    Boolean isDone();
    String currentItem();
}
