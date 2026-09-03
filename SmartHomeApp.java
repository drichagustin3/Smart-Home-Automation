public class SmartHomeApp {

	 private COMmand command;

	    public void setCommand(COMmand command) {
	        this.command = command;
	    }

	    public void pressButton() {
	        if (command != null) {
	            command.execute();
	        } else {
	            System.out.println("No command assigned.");
	        }
	    }
}