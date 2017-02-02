package StrategyPattern;

/**
 * Created by patch on 1/30/17.
 */
public class Context {
    private IChoice myChoice;

    public void setChoice(IChoice choice) {
        this.myChoice = choice;
    }

    public void showChoice(String s1, String s2) {
        myChoice.myChoice(s1, s2);
    }
}
