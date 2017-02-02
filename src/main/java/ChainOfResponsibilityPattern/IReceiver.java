package ChainOfResponsibilityPattern;

/**
 * Created by patch on 2/1/17.
 */
public interface IReceiver {
    Boolean processMessage(Message message);
}
