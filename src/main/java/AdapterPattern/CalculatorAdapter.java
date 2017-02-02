package AdapterPattern;

/**
 * Created by patch on 1/30/17.
 */
public class CalculatorAdapter {
    Calculator calculator;
    Triangle triangle;

    public double getArea(Triangle triangle) {
        calculator = new Calculator();
        this.triangle = triangle;
        Rectanlge rectanlge = new Rectanlge();
        rectanlge.length = this.triangle.base;
        rectanlge.width = 0.5 * this.triangle.height;
        return calculator.getArea(rectanlge);
    }
}
