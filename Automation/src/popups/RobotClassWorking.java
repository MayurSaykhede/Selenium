package popups;

import java.awt.AWTException; // AWT -> Abstract Window Toolkit 
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotClassWorking {
	
	public static void main(String[] args) throws AWTException {
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_A);
		
	}

}
