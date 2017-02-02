package MediatorPattern;

/**
 * Created by patch on 2/1/17.
 */
public class Friend2 extends Friend {
    public Friend2(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    public void send(String message) {
        mediator.send(this, message);
    }

    public void notify(String message) {
        System.out.println("Sohel gets message: " + message);
    }
}
