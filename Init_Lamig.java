public class Init_Lamig { //Thermostat

	private int temperature;

    public Init_Lamig() {
        temperature = 24;
    }

    public void increaseTemperature() {
        temperature++;
        System.out.println("Temperature increased to " + temperature + "°C.");
    }

    public void decreaseTemperature() {
        temperature--;
        System.out.println("Temperature decreased to " + temperature + "°C.");
    }

    public int getTemperature() {
        return temperature;
    }
}
