package IteratorPattern;

/**
 * Created by patch on 1/30/17.
 */
public class ArtsIterator implements Iterator {
    private String[] subjects;
    private int position;

    public ArtsIterator(String[] subjects) {
        this.subjects = subjects;
        position = 0;
    }

    @Override
    public void first() {
        position = 0;;
    }

    @Override
    public String next() {
        return subjects[position++];
    }

    @Override
    public Boolean isDone() {
        return position >= subjects.length;
    }

    @Override
    public String currentItem() {
        return subjects[position];
    }
}
