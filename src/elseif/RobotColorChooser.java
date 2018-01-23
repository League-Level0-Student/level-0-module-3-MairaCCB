
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot m = new Robot();
		m.miniaturize();	
		m.setSpeed(20);
		for(int x = 1; x<= 100; x++) {
		//3. ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw a square in?");
		//4. use an if/else statement to set the pen color that the user requested
		if(color.equals("blue")) {
			m.setPenColor(Color.BLUE);
		}
		else if(color.equals("red")) {
			m.setPenColor(Color.RED);
		}
		else if(color.equals("green")) {
			
			m.setPenColor(Color.GREEN);
		}
		else if(color.equals("orange")) {
			
			m.setPenColor(Color.ORANGE);
		}
		else if(color.equals("yellow")) {
			
			m.setPenColor(Color.YELLOW);
		}
		else if(color.equals("green")) {
			
			m.setPenColor(Color.GREEN);
		}
        //5. if the user doesn’t enter anything, choose a random color
		if(color.equals(" ")) {
			m.setPenColor(Color.MAGENTA);
		}
        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		m.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code) 
		m.penDown();
		m.move(100);
		m.turn(90);
		m.move(100);
		m.turn(90);
		m.move(100);
		m.turn(90);
		m.move(100);
		}
	}
}
