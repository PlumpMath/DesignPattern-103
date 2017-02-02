package CommandPattern;

/**
 * Created by patch on 1/30/17.
 */
public class MyRedoCommand implements ICommand {
    private Receiver receiver;

    public MyRedoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void Do() {
        receiver.performRedo();
    }
}
