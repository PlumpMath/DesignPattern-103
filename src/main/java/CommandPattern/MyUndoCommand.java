package CommandPattern;

/**
 * Created by patch on 1/30/17.
 */
public class MyUndoCommand implements ICommand {
    private Receiver receiver;

    public MyUndoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void Do() {
        receiver.performUndo();
    }
}
