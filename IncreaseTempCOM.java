public class IncreaseTempCOM implements COMmand { //IncreaseTemperatureCommand

    private Init_Lamig thermostat;

    public IncreaseTempCOM(Init_Lamig thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.increaseTemperature();
    }

}