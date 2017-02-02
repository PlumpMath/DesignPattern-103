package IteratorPattern;

import java.util.LinkedList;

/**
 * Created by patch on 1/30/17.
 */
public class Science implements ISubect {
    private LinkedList<String> subjects;

    public Science() {
        subjects = new LinkedList<>();
        subjects.addLast("Maths");
        subjects.addLast("Comp. Sc.");
        subjects.addLast("Physics");
    }

    @Override
    public Iterator createIterator() {
        return new ScienceIterator(subjects);
    }
}
