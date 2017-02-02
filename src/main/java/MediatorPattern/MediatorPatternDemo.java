package MediatorPattern;

/**
 * Created by patch on 2/1/17.
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        System.out.println("***Mediator Pattern Demo***\n");
        ConcreteMediator concreteMediator = new ConcreteMediator();

        Friend1 Amit = new Friend1(concreteMediator, "Amit");
        Friend2 Sohel = new Friend2(concreteMediator, "Sohel");
        Boss Raghu = new Boss(concreteMediator, "Raghu");

        concreteMediator.setFriend1(Amit);
        concreteMediator.setFriend2(Sohel);
        concreteMediator.setBoss(Raghu);

        Amit.send("[Amit here]Good Morrning. Can we discuss the mediator pattern?");
        Sohel.send("[Sohel here]Good Morrning. Yes, we can discuss now.");
        Raghu.send("\n[Raghu here]: Please get back to work quickly");
    }
}
