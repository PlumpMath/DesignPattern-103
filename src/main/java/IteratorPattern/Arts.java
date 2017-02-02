package IteratorPattern;

/**
 * Created by patch on 1/30/17.
 */
public class Arts implements ISubect {
    private String[] subjects;

    public Arts() {
        subjects = new String[2];
        subjects[0] = "Bengali";
        subjects[1] = "English";
    }

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(subjects);
    }
}
