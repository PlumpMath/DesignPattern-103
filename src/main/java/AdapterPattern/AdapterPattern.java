package AdapterPattern;

/**
 * Created by patch on 1/30/17.
 */
public class AdapterPattern {
    public static void main(String[] args) {
        System.out.println("***Adapter Pattern Demo***");
        CalculatorAdapter calculatorAdapter = new CalculatorAdapter();
        Triangle triangle = new Triangle(20, 10);
        System.out.println("\nAdapter Pattern Example\n");
        System.out.println("Area of Triangle is :" + calculatorAdapter.getArea(triangle));
    }
}
