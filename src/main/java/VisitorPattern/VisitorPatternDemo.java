package VisitorPattern;

/**
 * Created by patch on 2/2/17.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        System.out.println("***Visitor Pattern Demo***\n");
        IVisitor visitor = new Visitor();
        MyClass myClass = new MyClass();
        myClass.accept(visitor);
    }
}
