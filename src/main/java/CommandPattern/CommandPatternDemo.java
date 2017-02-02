package CommandPattern;

/**
 * Created by patch on 1/30/17.
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        System.out.println("***Command Pattern Demo****\n");
        Receiver receiver = new Receiver();
        Invoke invoke = new Invoke();
        MyUndoCommand undoCommand = new MyUndoCommand(receiver);
        MyRedoCommand redoCommand = new MyRedoCommand(receiver);
        invoke.executeCommand(undoCommand);
        invoke.executeCommand(redoCommand);
    }
}
