package FactoryPattern;

/**
 * Created by patch on 1/30/17.
 */
public class ConcreteFactory extends IAnimalFactory {
    @Override
    public IAnimal getAnimalType(String type) throws Exception {
        switch (type) {
            case "Duck":
                return new Duck();
            case "Tiger":
                return new Tiger();
            default:
                throw new Exception("Animal type : " + type + " cannot be instantiated");
        }
    }
}
