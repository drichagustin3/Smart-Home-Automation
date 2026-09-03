public class TurnOnIlawCOM implements COMmand { //TurnOnLightCommand

    private Ilaw light;

    public TurnOnIlawCOM(Ilaw light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}