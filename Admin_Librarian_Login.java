import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin_Librarian_Login {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Librarian_Login window = new Admin_Librarian_Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin_Librarian_Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 448, 286);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel LibraryManagementLabel = new JLabel("LIBRARY MANAGEMENT");
		LibraryManagementLabel.setBounds(87, 23, 291, 37);
		LibraryManagementLabel.setFont(new Font ("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(LibraryManagementLabel);
		
		JButton AdminButton = new JButton("ADMIN LOGIN");
		AdminButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogIn LogIn = new AdminLogIn();
				LogIn.Mainframe.setVisible(true);
				frame.dispose();
			}
		});
		AdminButton.setBounds(123, 70, 200, 63);
		AdminButton.setFont(new Font ("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(AdminButton);
		
		JButton LibrarianButton = new JButton("LIBRARIAN LOGIN");
		LibrarianButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianLogIn books = new LibrarianLogIn();
				books.LibrarianFrame.setVisible(true);
				frame.dispose();
			}
		});
		LibrarianButton.setBounds(123, 140, 200, 63);
		LibrarianButton.setFont(new Font ("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(LibrarianButton);};
		
		
}
