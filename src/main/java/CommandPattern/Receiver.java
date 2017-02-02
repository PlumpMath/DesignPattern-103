package CommandPattern;

/**
 * Created by patch on 1/30/17.
 */
public class Receiver {
    public void performUndo() {
        System.out.println("Executing -MyUndoCommand");
    }

    public void performRedo() {
        System.out.println("Executing -MyRedoCommand");
    }
}
