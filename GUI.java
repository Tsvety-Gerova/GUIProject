import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class GUI {

		public GUI () {
	
			JFrame frame = new JFrame ();
			
			JLabel greetingText = new JLabel("Welcome to our library! We'll help you choose your next great book");			
			JLabel genreChoice = new JLabel("Choose the genre:");
			JLabel recommendations = new JLabel ("Here are some recommendations:");
			JButton thanksButton = new JButton("Thank you!");
			JTextField recommendedBooks = new JTextField ();
			String[] genres = {"Fiction", "Drama", "Romance", "Action", "Science"};
			JComboBox genreMenu = new JComboBox(genres);
			
			JPanel panel = new JPanel ();
			panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // arranges the elements verticaly
				
			panel.add(greetingText);
			panel.add(genreChoice);
			panel.add(genreMenu);
			panel.add(recommendations);
			panel.add(recommendedBooks);
			panel.add(thanksButton);
			
			frame.add(panel, BorderLayout.CENTER); // add panel to the frame
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("My Library");
			frame.pack(); // set the window to match a certain size
			frame.setVisible(true); // set the window to be visible
			 // regular set-up stuff
}
	public static void main(String[] args) {
		new GUI();
		
	}

}
