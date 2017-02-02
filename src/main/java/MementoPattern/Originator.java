package MementoPattern;

/**
 * Created by patch on 1/30/17.
 */
public class Originator {
    private String state;
    Memento memento;

    public void setState(String state) {
        this.state = state;
        System.out.println("State at present : " + state);
    }

    public Memento originatorMemento() {
        this.memento = new Memento(state);
        return memento;
    }

    public void revert(Memento memento) {
        System.out.println("Restoring to previous state...");
        state = memento.getState();
        System.out.println("State at present :" + state);
    }
}
