package DecoratorPattern;

/**
 * Created by patch on 1/30/17.
 */
public class ConcreteComponent extends Component {
    @Override
    public void doJob() {
        System.out.println(" I am from Concrete Component-I am closed for modification.");
    }
}
