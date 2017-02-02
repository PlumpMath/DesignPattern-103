package StatePattern;

/**
 * Created by patch on 1/31/17.
 */
public class Off extends RemoteControl {
    @Override
    public void pressSwitch(TV tv) {
        System.out.println("I am off . Going to be on now");
        tv.setRemoteControl(new On());
    }
}
