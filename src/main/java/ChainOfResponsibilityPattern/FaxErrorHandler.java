package ChainOfResponsibilityPattern;

/**
 * Created by patch on 2/1/17.
 */
public class FaxErrorHandler implements IReceiver {
    public IReceiver receiver;

    public FaxErrorHandler(IReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public Boolean processMessage(Message message) {
        if (message.text.contains("Fax")) {
            System.out.println("FaxErrorHandler processed " + message.priority + "priority issue: " + message.text);
            return true;
        } else {
            if (receiver != null) {
                receiver.processMessage(message);
            }
        }
        return false;
    }
}
