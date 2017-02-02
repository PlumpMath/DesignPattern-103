package TemplateMethodPattern;

/**
 * Created by patch on 1/30/17.
 */
public abstract class BasicEngineering {
    public void papers() {
        math();
        softSkills();
        specialPaper();
    }

    private void math() {
        System.out.println("Mathematics");
    }

    private void softSkills() {
        System.out.println("SoftSkills");
    }

    public abstract void specialPaper();
}
