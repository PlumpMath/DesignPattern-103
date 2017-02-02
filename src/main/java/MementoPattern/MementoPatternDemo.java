package MementoPattern;

/**
 * Created by patch on 1/30/17.
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        System.out.println("***Memento Pattern Demo***\n");
        Originator originator = new Originator();
        originator.setState("First state");

        Caretaker caretaker = new Caretaker();
        caretaker.saveMemento(originator.originatorMemento());

        originator.setState("Second state");

        originator.revert(caretaker.retrieveMemento());
    }
}
