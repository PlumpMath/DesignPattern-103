package ChainOfResponsibilityPattern;

/**
 * Created by patch on 2/1/17.
 */
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        System.out.println("***Chain of Responsibility Pattern Demo***\n");
        IReceiver faxHandler, emailHandler;
        emailHandler = new EmailErrorHandler(null);
        faxHandler = new FaxErrorHandler(emailHandler);

        IssueRaiser raiser = new IssueRaiser(faxHandler);

        Message message1 = new Message("Fax is reaching late to the destination", MessagePriority.Normal);
        Message message2 = new Message("Email is not going", MessagePriority.High);
        Message message3 = new Message("In Email, BCC field is disabled occasionally", MessagePriority.Normal);
        Message message4 = new Message("Fax is not reaching destination", MessagePriority.High);

        raiser.raiseMessage(message1);
        raiser.raiseMessage(message2);
        raiser.raiseMessage(message3);
        raiser.raiseMessage(message4);
    }
}
