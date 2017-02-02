package DecoratorPattern;

/**
 * Created by patch on 1/30/17.
 */
public class ConcreteDecoratorEx_2 extends AbstractDecorator {
    @Override
    public void doJob() {
        System.out.println("");
        System.out.println("***START Ex-2***");
        super.doJob();
        System.out.println("Explicitly From DecoratorEx_2");
        System.out.println("***END. Ex-2***");
    }
}
