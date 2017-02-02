package BuilderPattern;

/**
 * Created by patch on 1/31/17.
 */
public class Car implements IBuilder {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a car");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("2 Headlights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
