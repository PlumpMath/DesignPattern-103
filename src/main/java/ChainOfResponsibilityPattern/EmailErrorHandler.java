package ChainOfResponsibilityPattern;

/**
 * Created by patch on 2/1/17.
 */
public class EmailErrorHandler implements IReceiver {
    public IReceiver receiver;

    public EmailErrorHandler(IReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public Boolean processMessage(Message message) {
        if (message.text.contains("Email")) {
            System.out.println("EmailErrorHandler processed " + message.priority + "priority issue: " + message.text);
            return true;
        } else {
            if (receiver != null) {
                receiver.processMessage(message);
            }
        }
        return false;
    }
}
