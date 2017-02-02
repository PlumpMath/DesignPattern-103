package FactoryPattern;

/**
 * Created by patch on 1/30/17.
 */
public abstract class IAnimalFactory {
    public abstract IAnimal getAnimalType(String type) throws Exception;
}
