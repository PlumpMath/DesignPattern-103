package AdapterPattern;

/**
 * Created by patch on 1/30/17.
 */
public class Calculator {
    Rectanlge rectanlge;

    public double getArea(Rectanlge rectanlge) {
        this.rectanlge = rectanlge;
        return this.rectanlge.length * this.rectanlge.width;
    }
}
