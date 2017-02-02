package TemplateMethodPattern;

/**
 * Created by patch on 1/30/17.
 */
public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        System.out.println("***Template Method Pattern Demo***\n");

        BasicEngineering basicEngineering = new ComputerScience();
        System.out.println("Computer sc Papaers:");
        basicEngineering.papers();
        System.out.println();
        basicEngineering = new Electronics();
        System.out.println("Electronics Papers:");
        basicEngineering.papers();
    }
}
