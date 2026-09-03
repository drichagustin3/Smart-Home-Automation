public class Main {

	public static void main(String[] args) {
		
		// Create the smart home devices
        Ilaw light = new Ilaw();
        Init_Lamig thermostat = new Init_Lamig();
        Spotify musicPlayer = new Spotify();

        
        
        // Create the central hub
        SmartHomeApp hub = new SmartHomeApp();

        System.out.println("=== SMART HOME AUTOMATION ===");

        
        
        // Turn ON the light
        COMmand turnOnLight = new TurnOnIlawCOM(light);
        hub.setCommand(turnOnLight);
        hub.pressButton();

        System.out.println();

        
        
        // Turn OFF the light
        COMmand turnOffLight = new TurnOffIlawCOM(light);
        hub.setCommand(turnOffLight);
        hub.pressButton();

        System.out.println();

        
        
        // Increase temperature
        COMmand increaseTemp = new IncreaseTempCOM(thermostat);
        hub.setCommand(increaseTemp);
        hub.pressButton();

        System.out.println();

        
        
        // Decrease temperature
        COMmand decreaseTemp = new DecreaseTempCOM(thermostat);
        hub.setCommand(decreaseTemp);
        hub.pressButton();

        System.out.println();

        
        
        // Play music
        COMmand playMusic = new PlaySpotify(
                musicPlayer,
                "My Favorite Playlist"
        );
        hub.setCommand(playMusic);
        hub.pressButton();

        System.out.println();

        
        
        // Stop music
        COMmand stopMusic = new StopSpotify(musicPlayer);
        hub.setCommand(stopMusic);
        hub.pressButton();

	}

}
