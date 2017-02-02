package ProxyPattern;

import ProxyPattern.ProxyClasses.Proxy;

/**
 * Created by patch on 1/30/17.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        System.out.println("***Proxy Pattern Demo***\n");
        Proxy proxy = new Proxy();
        proxy.doSomeWork();
    }
}
