package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog(null, "Are you happy?");
		if (happy.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what your doing. ");
		} else if (happy.equals("no")) {
			String smile = JOptionPane.showInputDialog("Do you want to be happy?");
			if (smile.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
			else if(smile.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing what your doing. ");
			}
		
		}
	}

}