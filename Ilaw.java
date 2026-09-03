public class Ilaw { //Ilaw

	private boolean isOn;
    private int brightness;

    public Ilaw() {
        isOn = false;
        brightness = 50;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Light is ON.");
        System.out.println("Brightness: " + brightness + "%");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light is OFF.");
    }

    public void setBrightness(int level) {
        brightness = level;
        System.out.println("Light brightness is set to " + brightness + "%.");
    }
}
