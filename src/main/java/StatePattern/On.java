package StatePattern;

/**
 * Created by patch on 1/31/17.
 */
public class On extends RemoteControl {
    @Override
    public void pressSwitch(TV tv) {
        System.out.println("I am already on . Going to be off now");
        tv.setRemoteControl(new Off());
    }
}
