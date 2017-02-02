package ChainOfResponsibilityPattern;

/**
 * Created by patch on 2/1/17.
 */
public class Message {
    public String text;
    public MessagePriority priority;

    public Message(String message, MessagePriority messagePriority) {
        this.text = message;
        this.priority = messagePriority;
    }
}
