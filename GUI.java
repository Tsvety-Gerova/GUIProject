import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class GUI extends JFrame implements ActionListener {
    
	
	ArrayList<String> bookList = new ArrayList<String>(); // creates an array list of chosen books
	String[] genres = {"Fantasy", "Drama", "Romance", "Action/Adventure", "Sci-fi"};
			JComboBox genreMenu = new JComboBox(genres); // drop down menu with the genre choices 
			JLabel recommendedBooks = new JLabel(); // prints the books of the desired genre
			String chosenBook; // saves the book that the person has chosen and written down
		
	public GUI () {
	        
			JFrame frame = new JFrame ();
			
			JLabel greetingText = new JLabel("Welcome to our library! We'll help you choose your next great book");	
			greetingText.setFont(new Font("Courier new", Font.BOLD, 14));
			JLabel genreChoice = new JLabel("Choose the genre:");
			genreChoice.setFont(new Font("Courier new", Font.BOLD, 14));
			JLabel recommendations = new JLabel ("Here are some recommendations:");
			recommendations.setFont(new Font("Courier new", Font.BOLD, 14));
			JLabel whichBook = new JLabel("Which book did you choose? Write it down and add it to your list:");
			whichBook.setFont(new Font("Courier new", Font.BOLD, 14));
			JTextField chosen = new JTextField(); // the field where the person writes down the wanted book
			JTextField myList = new JTextField(); // text field that shows the list with the saved books 
            		
			JButton addToList = new JButton("Add to my list");
			addToList.setFont(new Font("Courier new", Font.BOLD, 14));
			// adds function to the button addToList
			addToList.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent c) {
					chosenBook = chosen.getText(); // the one that the person has written down in the text field 'chosen'
					bookList.add(chosenBook); // adding the chosen book to the array
					myList.setText(bookList.toString()); // the field myList prints the array bookList
				}
			} );
			
						            
			genreMenu.setSelectedIndex(0); // nachalna stoinost
			genreMenu.addActionListener(this); // this => refers to the selected option
			add(genreMenu);
			add(recommendedBooks);
			
			JPanel panel = new JPanel ();
			panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
			panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // arranges the elements vertically
			
			// adding all elements to the panel	
			panel.add(greetingText);
			panel.add(genreChoice);
			panel.add(genreMenu);
			panel.add(recommendations);
			panel.add(recommendedBooks);
			panel.add(whichBook);
			panel.add(chosen);
			panel.add(addToList);
			panel.add(myList);
			
			 // regular set-up stuff
			frame.add(panel, BorderLayout.CENTER); // add panel to the frame
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("My Library");
			frame.pack(); // set the window to match a certain size
			frame.setVisible(true); // set the window to be visible
			
}
	public static void main(String[] args) {
		new GUI();
		
	}
	@Override
	public void actionPerformed (ActionEvent choice) { 

		if (choice.getSource() == genreMenu) { // if the source of any event is the combobox genreMenu
			JComboBox copy = (JComboBox)choice.getSource(); // creating a copy of genreMenu
			String selectedItem = (String)copy.getSelectedItem(); // checking which item is selected;
			switch (selectedItem) {
			case "Fantasy" : recommendedBooks.setText("<html>The Hunger Games<br/>"
					+ "A Game of Thrones<br/>"
					+ "The Hobbit<br/>"
					+ "The Lion, the Witch and the Wardrobe, The Chronicles of Narnia<br/>"
					+ "Eragon<br/>"
					+ "Harry Potter</html>");
				break;
			case "Drama" : recommendedBooks.setText("<html>Where the Crawdads sing<br/>"
					+ "Pride and Prejudice<br/>"
					+ "The Tragical Historie of Hamlet, Prince of Denmarke<br/>"
					+ "To Kill a Mockingbird<br/>"
					+ "The tragedy of Macbeth<br/>"
					+ "The book Thief</html>");
				break;
			case "Romance" : recommendedBooks.setText("<html>Romeo and Juliet<br/>"
					+ "Jane Eyre<br/>"
					+ "The Fault in Our Stars<br/>"
					+ "The notebook<br/>"
					+ "A Walk to Remember<br/>"
					+ "Me before You</html>");
				break;
			case "Action/Adventure" : recommendedBooks.setText("<html>The Maze Runner<br/>"
					+ "Jason Bourne<br/>"
					+ "Divergent<br/>"
					+ "The fifth wave<br/>"
					+ "Star Wars<br/>"
					+ "Legend</html>");
				break;
			case "Sci-fi" : recommendedBooks.setText("<html>Ender's Game<br/>"
					+ "World War Z<br/>"
					+ "1984<br/>"
					+ "The War of The Worlds<br/>"
					+ "The Stand<br/>"
					+ "The Day of The Triffids</html>");
				break;
			}		
		} 		
	
		//bookList.add(chosenBook); 
		//myBookList.setText(bookList.toString());

	}

	
	
	
	
}
