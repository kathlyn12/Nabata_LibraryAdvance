import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ListOfBooks {

	JFrame BooksFrame;
	private JTextField RentTxtField;
	
	static int copyBook1 = 2;
	static int copyBook2 = 3;
	static int copyBook3 = 4;
	
	static JLabel copy0 = new JLabel();
	static JLabel copy1 = new JLabel();
	static JLabel copy2 = new JLabel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListOfBooks ListWindow = new ListOfBooks();
					ListWindow.BooksFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ListOfBooks() {
		BooksFrame = new JFrame("LIST OF BOOKS");
		BooksFrame.setBounds(100, 100, 844, 407);
		BooksFrame.setLocationRelativeTo(null);
		BooksFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BooksFrame.getContentPane().setLayout(null);

		JLabel lbl2 = new JLabel("PLEASE CHOOSE A BOOK YOU WANT TO RENT");
		lbl2.setBounds(196, 25, 482, 39);
		lbl2.setFont(new Font("Tahoma", Font.BOLD, 20));
		BooksFrame.getContentPane().add(lbl2);

		JLabel lbl3 = new JLabel("-----RENTAL BOOKS-----");
		lbl3.setBounds(167, 92, 214, 32);
		lbl3.setFont(new Font("Tahoma", Font.ITALIC, 20));
		BooksFrame.getContentPane().add(lbl3);

		JLabel lbl4 = new JLabel("[ 0 ] : System Analysis and Design | Author: Gary B. Shelly (1991)");
		lbl4.setBounds(34, 124, 489, 39);
		lbl4.setFont(new Font("Tahoma", Font.BOLD, 14));
		BooksFrame.getContentPane().add(lbl4);

		JLabel lbl5 = new JLabel("[ 1 ] : Android Application | Author: Carone Hoisington (2012)");
		lbl5.setBounds(34, 168, 453, 39);
		lbl5.setFont(new Font("Tahoma", Font.BOLD, 14));
		BooksFrame.getContentPane().add(lbl5);

		JLabel lbl6 = new JLabel(
				"[ 2 ] : Programming Concept and Logic Formulation | Author: Rosauro E. Manuel (2016)");
		lbl6.setBounds(33, 217, 680, 32);
		lbl6.setFont(new Font("Tahoma", Font.BOLD, 14));
		BooksFrame.getContentPane().add(lbl6);

		JLabel lbl7 = new JLabel("COPIES");
		lbl7.setBounds(713, 95, 75, 27);
		lbl7.setFont(new Font("Tahoma", Font.ITALIC, 20));
		BooksFrame.getContentPane().add(lbl7);

		JButton RentButton = new JButton("RENT");
		RentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<BookList> books = new ArrayList();

				BookList book1 = new BookList(); // Instantiate of the Book 1 and its objects
				book1.BookTitle = "System Analysis and Design";
				book1.Author = "Gary B. Shelly (1991)";

				BookList book2 = new BookList(); // Instantiate of the Book 2 and its objects
				book2.BookTitle = "Android Application";
				book2.Author = "Carone Hoisington (2012)";

				BookList book3 = new BookList(); // Instantiate of the Book 2 and its objects
				book3.BookTitle = "Programming Concept and Logic Formulation";
				book3.Author = "Rosauro E. Manuel (2015)";

				// Add method that is used to add Books in the ArrayList
				books.add(book1);
				books.add(book2);
				books.add(book3);

				try {
					int choose = Integer.parseInt(RentTxtField.getText());
					BookList book = books.get(choose);

					if (choose == 0 && copyBook1 < 1) {
						JOptionPane.showMessageDialog(null, "THERE ARE NO COPIES AVAILABLE", "",
								JOptionPane.INFORMATION_MESSAGE);
					} else if (choose == 1 && copyBook2 < 1) {
						JOptionPane.showMessageDialog(null, "THERE ARE NO COPIES AVAILABLE", "",
								JOptionPane.INFORMATION_MESSAGE);
					} else if (choose == 2 && copyBook3 < 1) {
						JOptionPane.showMessageDialog(null, "THERE ARE NO COPIES AVAILABLE", "",
								JOptionPane.INFORMATION_MESSAGE);
					}

					// BOOK 1 and Copy 0
					if (choose == 0 && copyBook1 >= 1) {
						int rentChoice = JOptionPane.showConfirmDialog(null, "You chose: "
								+ books.get(choose).getBookTitle() + " by " + books.get(choose).getAuthor(), "",
								JOptionPane.YES_NO_OPTION);

						// Decrease of copy
						copyBook1 -= 1;
						copy0.setText(Integer.toString(copyBook1));
						if (rentChoice == JOptionPane.YES_NO_OPTION) {
							int ask = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "",
									JOptionPane.YES_NO_OPTION);
							if (ask == JOptionPane.YES_OPTION) {
								BooksFrame.setVisible(true);
								RentTxtField.setText("");
							} else {
								Admin_Librarian_Login LogIn = new Admin_Librarian_Login();
								LogIn.frame.setVisible(true);
								BooksFrame.dispose();
							}
						}
					} else if (choose == 1 && copyBook2 >= 1) { // BOOK 2 and COPY 1
						int rentChoice1 = JOptionPane.showConfirmDialog(null, "You choose: "
								+ books.get(choose).getBookTitle() + " by " + books.get(choose).getAuthor(), "",
								JOptionPane.CLOSED_OPTION);

						// Decrease of copy
						copyBook2 -= 1;
						copy1.setText(Integer.toString(copyBook2));
						if (rentChoice1 == JOptionPane.YES_NO_OPTION) {
							int ask = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "",
									JOptionPane.YES_NO_OPTION);
							if (ask == JOptionPane.YES_OPTION) {
								BooksFrame.setVisible(true);
								RentTxtField.setText("");
							} else {
								Admin_Librarian_Login LogIn = new Admin_Librarian_Login();
								LogIn.frame.setVisible(true);
								BooksFrame.dispose();
							}
						}
					} else if (choose == 2 && copyBook3 >= 1) { // BOOK 3 and Copy 2
						int rentChoice2 = JOptionPane.showConfirmDialog(null, "You choose: "
								+ books.get(choose).getBookTitle() + " by " + books.get(choose).getAuthor(), "",
								JOptionPane.CLOSED_OPTION);

						// Decrease of copy
						copyBook3 -= 1;
						copy2.setText(Integer.toString(copyBook3));
						if (rentChoice2 == JOptionPane.YES_NO_OPTION) {
							int ask = JOptionPane.showConfirmDialog(null, "Do you want to rent again?", "",
									JOptionPane.YES_NO_OPTION);
							if (ask == JOptionPane.YES_OPTION) {
								BooksFrame.setVisible(true);
								RentTxtField.setText("");
							} else {
								Admin_Librarian_Login LogIn = new Admin_Librarian_Login();
								LogIn.frame.setVisible(true);
								BooksFrame.dispose();
							}
						}
					}
				} catch (NumberFormatException ex) {
					int choose = JOptionPane.showConfirmDialog(null, "Input must be in the choices.", "",
							JOptionPane.CLOSED_OPTION);
					if (choose == JOptionPane.OK_OPTION) {
						ListOfBooks list = new ListOfBooks();
						list.BooksFrame.setVisible(true);
						BooksFrame.dispose();
					}
				} catch (IndexOutOfBoundsException ex) {
					int choose = JOptionPane.showConfirmDialog(null, "Index does not exist.", "",
							JOptionPane.CLOSED_OPTION);
					if (choose == JOptionPane.OK_OPTION) {
						ListOfBooks list = new ListOfBooks();
						list.BooksFrame.setVisible(true);
						BooksFrame.dispose();
					}
				}
			}
		});
		RentButton.setBounds(540, 300, 105, 39);
		RentButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		BooksFrame.getContentPane().add(RentButton);

		RentTxtField = new JTextField();
		RentTxtField.setBounds(318, 304, 189, 32);
		BooksFrame.getContentPane().add(RentTxtField);
		RentTxtField.setColumns(10);

		JButton BackButton = new JButton("BACK");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Librarian_Login LogIn = new Admin_Librarian_Login();
				LogIn.frame.setVisible(true);
				BooksFrame.dispose();
			}
		});
		BackButton.setBounds(184, 300, 105, 39);
		BackButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		BooksFrame.getContentPane().add(BackButton);

		copy0.setText(Integer.toString(copyBook1));
		copy0.setBounds(723, 139, 45, 13);
		copy0.setFont(new Font("Tahoma", Font.BOLD, 14));
		BooksFrame.getContentPane().add(copy0);

		copy1.setText(Integer.toString(copyBook2));
		copy1.setBounds(723, 183, 45, 13);
		copy1.setFont(new Font("Tahoma", Font.BOLD, 14));
		BooksFrame.getContentPane().add(copy1);

		copy2.setText(Integer.toString(copyBook3));
		copy2.setBounds(723, 229, 45, 13);
		copy2.setFont(new Font("Tahoma", Font.BOLD, 14));
		BooksFrame.getContentPane().add(copy2);

		
		
		
	}
}
