package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot robot = new Robot();
		
		robot.setSpeed(100);
		robot.penDown();
		
		for (int i = 0; i < 4; i++) {
			robot.move(200);
			robot.turn(90);
		}
		

		
	}
}
