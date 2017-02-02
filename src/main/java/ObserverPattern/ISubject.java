package ObserverPattern;

/**
 * Created by patch on 1/28/17.
 */
public interface ISubject {
    void notifyObservers(int updatedValue);
    void register(IObserver observer);
    void unRegister(IObserver observer);
}
