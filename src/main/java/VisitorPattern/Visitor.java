package VisitorPattern;

/**
 * Created by patch on 2/2/17.
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(MyClass myClass) {
        System.out.println("Visitor is trying to change the integer value");
        myClass.setMyInt(100);
        System.out.println("Exiting from Visitor-visit");
    }
}
