package DecoratorPattern;

/**
 * Created by patch on 1/30/17.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        System.out.println("***Decorator pattern Demo***");
        ConcreteComponent concreteComponent = new ConcreteComponent();

        ConcreteDecoratorEx_1 concreteDecoratorEx_1 = new ConcreteDecoratorEx_1();
        concreteDecoratorEx_1.setComponent(concreteComponent);
        concreteDecoratorEx_1.doJob();

        ConcreteDecoratorEx_2 concreteDecoratorEx_2 = new ConcreteDecoratorEx_2();
        concreteDecoratorEx_2.setComponent(concreteComponent);
        concreteDecoratorEx_2.doJob();
    }
}
