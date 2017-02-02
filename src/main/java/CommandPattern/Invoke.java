package CommandPattern;

/**
 * Created by patch on 1/30/17.
 */
public class Invoke {
    public void executeCommand(ICommand command) {
        command.Do();
    }
}
