package MementoPattern;

/**
 * Created by patch on 1/30/17.
 */
public class Caretaker {
    private Memento memento;

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento retrieveMemento() {
        return memento;
    }
}
