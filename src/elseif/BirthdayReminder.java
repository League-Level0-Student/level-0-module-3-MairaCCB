
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
		for (int b = 0; b < 4; b++) { // 1. correct the birthdays for your family below
			String momsBirthday = "September 15th";
			String dadsBirthday = "October 16th";
			String myBirthday = "October 9th";

			// 2. Find out which birthday the user wants and and store their response in a
			// variable
			String birthday = JOptionPane.showInputDialog("Who's birthday do you want to know?");
			// 3. Print out what the user typed
			
			// 4. if user asked for "mom"
			// print mom's birthday
			if (birthday.equals("mom")) {
				JOptionPane.showMessageDialog(null, momsBirthday);
			}
			// 5. if user asked for "dad"
			// print dad's birthday
			else if (birthday.equals("dad")) {
				JOptionPane.showMessageDialog(null, dadsBirthday);
			}
			// 6. if user asked for your name
			// print myBirthday
			else if (birthday.equals("yours")) {
				JOptionPane.showMessageDialog(null, myBirthday);
			}
			// 7. otherwise print "Sorry, i don't remember that person's birthday!"
			else {
				JOptionPane.showMessageDialog(null, "Sorry I don't remember that person's birthday!");
			}
		}
	}
}