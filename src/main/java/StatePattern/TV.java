package StatePattern;

/**
 * Created by patch on 1/31/17.
 */
public class TV {
    RemoteControl remoteControl;

    public RemoteControl getRemoteControl() {
        return this.remoteControl;
    }

    public void setRemoteControl(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    public TV(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    public void pressButton() {
        remoteControl.pressSwitch(this);
    }
}
