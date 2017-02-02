package ProxyPattern.OriginalClasses;

/**
 * Created by patch on 1/30/17.
 */
public class ConcreteSubject extends Subject {
    @Override
    public void doSomeWork() {
        System.out.println("I am from concrete subject");
    }
}
