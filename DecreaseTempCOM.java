public class DecreaseTempCOM implements COMmand{ //DecreaseTemperatureCommand

    private Init_Lamig thermostat;

    public DecreaseTempCOM(Init_Lamig thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.decreaseTemperature();
    }

}