public class TurnOffIlawCOM implements COMmand { //TurnOffLightCommand

    private Ilaw light;

    public TurnOffIlawCOM(Ilaw light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

}