package IteratorPattern;

/**
 * Created by patch on 1/30/17.
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        System.out.println("***Iterator Pattern Demo***\n");
        ISubect sc_subject = new Science();
        ISubect ar_subject = new Arts();

        Iterator sc_iterator = sc_subject.createIterator();
        Iterator ar_iterator = ar_subject.createIterator();

        System.out.println("\nScience subjects :");
        print(sc_iterator);

        System.out.println("\nArts subjects :");
        print(ar_iterator);
    }

    public static void print(Iterator iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}
