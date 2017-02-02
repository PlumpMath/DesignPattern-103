package ChainOfResponsibilityPattern;

/**
 * Created by patch on 2/1/17.
 */
public class IssueRaiser {
    public IReceiver receiver;

    public IssueRaiser(IReceiver receiver) {
        this.receiver = receiver;
    }

    public void raiseMessage(Message message) {
        if (receiver != null) {
            receiver.processMessage(message);
        }
    }
}
