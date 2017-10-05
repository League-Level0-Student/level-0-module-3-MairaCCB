import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String h = JOptionPane.showInputDialog("Are you happy? Yes or no?");
		if (h.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");

		}
		if (h.equals("no")) {
			String w = JOptionPane.showInputDialog("Do you want to be happy? Yes or no?");

			if (w.equals("yes")|| w.equals("Yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
			if (w.equals("no")|| w.equals("No")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
			}

		}
	}
}