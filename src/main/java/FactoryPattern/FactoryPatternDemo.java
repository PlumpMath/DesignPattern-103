package FactoryPattern;

/**
 * Created by patch on 1/30/17.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("***Factory Pattern Demo***\n");
        IAnimalFactory animalFactory = new ConcreteFactory();
        IAnimal duckType = animalFactory.getAnimalType("Duck");
        duckType.speak();

        IAnimal tigerType = animalFactory.getAnimalType("Tiger");
        tigerType.speak();

        IAnimal lionType = animalFactory.getAnimalType("Lion");
        lionType.speak();
    }
}
