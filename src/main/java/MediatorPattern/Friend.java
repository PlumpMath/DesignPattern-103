package MediatorPattern;

/**
 * Created by patch on 2/1/17.
 */
public abstract class Friend {
    protected Mediator mediator;
    public String name;

    public Friend(Mediator mediator) {
        this.mediator = mediator;
    }
}
