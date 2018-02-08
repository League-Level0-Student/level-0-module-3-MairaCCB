
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot m = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
		m.miniaturize();
		m.setX(100);
		int n = 100;

		// 2. Make the robot draw a star shape. Hint: 144.
		m.penDown();
		m.setSpeed(100);
		for (int h = 0; h < 20; h++) {
			if (h % 2 == 0) {
				m.setPenColor(Color.blue);
			} else if (h % 2 == 1) {
				m.setPenColor(Color.red);
			}
			for (int s = 0; s < 5; s += 1) {
				m.move(30);
				m.turn(144);
			}
			n += 40;
			m.setX(n);
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */
	}

}
