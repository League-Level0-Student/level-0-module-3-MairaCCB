package modulo;

import org.jointheleague.graphical.robot.Robot;

public class ModuloRing {
	// 1. Create a new Robot
	Robot m = new Robot();

	void go() {
		// 2. Move robot to 200, 300 (you may need to adjust this)
		// Hint: use moveTo or setX, setY
		m.setX(50);
		m.setY(300);
		// 3. Hide your robot (optional)
		m.hide();
		// 7. Do the following steps (8, 5, 6) 72 times
for(int a = 0; a<72; a++) {
		// 8. Use MODULO to set a new random pen color every 6 shapes
if(a % 6 == 0) {
	m.setRandomPenColor();
}

		// 5. Call the drawShape method; choose the # sides for your shape
		drawShape(1);
		// 6. Move the robot 20 pixels, then turn 5 degrees
		m.move(20);
		m.turn(5);
	}
	}
	void drawShape(int numSides) {
		// 4. Write a for loop that will draw a shape with 'numSides' sides
		// Hint: turn 360/numSides
		m.setSpeed(100);
		for (int i = 0; i < numSides; i++) {
			m.penDown();
			m.move(100);
			m.turn(360 / numSides);
		}
	}

	public static void main(String[] args) {
		new ModuloRing().go();
	}
}
