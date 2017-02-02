package DecoratorPattern;

/**
 * Created by patch on 1/30/17.
 */
public abstract class AbstractDecorator extends Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void doJob() {
        if (component != null) {
            component.doJob();
        }
    }
}
