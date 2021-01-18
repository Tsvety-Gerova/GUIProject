import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class GUI extends JFrame implements ActionListener {

	String[] genres = {"Fantasy", "Drama", "Romance", "Action/Adventure", "Sci-fi"};
			JComboBox genreMenu = new JComboBox(genres);
			JLabel recommendedBooks = new JLabel();
		
	public GUI () {
	
			JFrame frame = new JFrame ();
			
			JLabel greetingText = new JLabel("Welcome to our library! We'll help you choose your next great book");			
			JLabel genreChoice = new JLabel("Choose the genre:");
			JLabel recommendations = new JLabel ("Here are some recommendations:");
			JButton thanksButton = new JButton("Thank you!");	
			
			genreMenu.setSelectedIndex(0); // nachalna stoinost
			genreMenu.addActionListener(this); // refers to the selected option
			add(genreMenu);
			add(recommendedBooks);
			
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
	@Override
	public void actionPerformed(ActionEvent choice) {

		if (choice.getSource() == genreMenu) { // if the source of any event is the combobox genreMenu
			JComboBox copy = (JComboBox)choice.getSource(); // creating a copy of genreMenu
			String selectedItem = (String)copy.getSelectedItem(); // checking which item is selected;
			switch (selectedItem) {
			case "Fantasy" : recommendedBooks.setText("The Hunger Games,\n"
					+ "A Game of Thrones,\n"
					+ "The Hobbit,\n"
					+ "The Lion, the Witch and the Wardrobe, The Chronicles of Narnia,\n"
					+ "Eragon,\n"
					+ "Harry Potter,\n");
				break;
			case "Drama" : recommendedBooks.setText("Where the Crawdads sing,"
					+ "Pride and Prejudice,"
					+ "The Tragical Historie of Hamlet, Prince of Denmarke,"
					+ "To Kill a Mockingbird,"
					+ "The tragedy of Macbeth,"
					+ "The book Thief");
				break;
			case "Romance" : recommendedBooks.setText("Romeo and Juliet,"
					+ "Jane Eyre,"
					+ "The Fault in Our Stars,"
					+ "The notebook,"
					+ "A Walk to Remember,"
					+ "Me befoe You");
				break;
			case "Action/Adventure" : recommendedBooks.setText("The Maze Runner,"
					+ "Jason Bourne,"
					+ "Divergent,"
					+ "The fifth wave,"
					+ "Star Wars,"
					+ "Legend");
				break;
			case "Sci-fi" : recommendedBooks.setText("Ender's Game,"
					+ "World War Z,"
					+ "1984,"
					+ "The War of The Worlds,"
					+ "The Stand,"
					+ "The Day of The Triffids");
				break;
			}
			} 		
		
	}

	
	
	
	
	
}
