import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot m = new Robot();

	public static void main(String[] args) {
		m.miniaturize();
		m.setSpeed(10);
		m.penDown();
		JOptionPane.showInputDialog("What shape do you want? (Square, Triangle or Circle)");
	}

	static void drawSquare() {
		for (int s = 1; s < 5; s++) {
			m.move(50);
			m.turn(90);
		}
	}

	static void drawTriangle() {
		for (int t = 1; t < 4; t++) {
			m.turn(120);
			m.move(50);
		}
	}

	static void drawCircle() {
		for(int c = 1;c<361;c++){
			m.move(1);
			m.turn(1);
		}
	}
}