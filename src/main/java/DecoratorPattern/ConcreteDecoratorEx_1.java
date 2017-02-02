package DecoratorPattern;

/**
 * Created by patch on 1/30/17.
 */
public class ConcreteDecoratorEx_1 extends AbstractDecorator {
    @Override
    public void doJob() {
        super.doJob();
        System.out.println("I am explicitly from Ex_1");
    }
}
