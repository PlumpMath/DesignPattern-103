package ProxyPattern.ProxyClasses;

import ProxyPattern.OriginalClasses.ConcreteSubject;
import ProxyPattern.OriginalClasses.Subject;

/**
 * Created by patch on 1/30/17.
 */
public class Proxy extends Subject {
    ConcreteSubject cs;
    @Override
    public void doSomeWork() {
        System.out.println("Proxy call happening now");
        if (cs == null) {
            cs = new ConcreteSubject();
        }
        cs.doSomeWork();
    }
}
