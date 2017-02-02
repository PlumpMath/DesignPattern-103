package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by patch on 1/28/17.
 */
public class Subject1 implements ISubject {
    private int myValue;

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
        notifyObservers(myValue);
    }

    List<IObserver> observerList = new ArrayList<IObserver>();

    @Override
    public void notifyObservers(int updatedValue) {
        for(int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update(this.getClass().getSimpleName(), updatedValue);
        }
    }

    @Override
    public void register(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void unRegister(IObserver observer) {
        observerList.remove(observer);
    }
}
