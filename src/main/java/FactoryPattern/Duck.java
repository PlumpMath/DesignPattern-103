package FactoryPattern;

/**
 * Created by patch on 1/30/17.
 */
public class Duck implements IAnimal {
    @Override
    public void speak() {
        System.out.println("Duck says Pack-pack");
    }
}
