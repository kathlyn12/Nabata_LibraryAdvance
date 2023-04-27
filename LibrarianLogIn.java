import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LibrarianLogIn {

	JFrame LibrarianFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianLogIn LibrarianWindow = new LibrarianLogIn();
					LibrarianWindow.LibrarianFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibrarianLogIn() {
		LibrarianFrame = new JFrame("Librarian Login");
		LibrarianFrame.setBounds(100, 100, 471, 326);
		LibrarianFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LibrarianFrame.setLocationRelativeTo(null);
		LibrarianFrame.getContentPane().setLayout(null);
		
		JLabel LibrarianLogin = new JLabel("Librarian Login Form");
		LibrarianLogin.setBounds(132, 10, 193, 30);
		LibrarianLogin.setFont(new Font ("Tahoma", Font.BOLD, 18));
		LibrarianFrame.getContentPane().add(LibrarianLogin);
		
		JLabel LibrarianUsername = new JLabel("Username: ");
		LibrarianUsername.setBounds(55, 53, 140, 41);
		LibrarianUsername.setFont(new Font ("Tahoma", Font.BOLD, 18));
		LibrarianFrame.getContentPane().add(LibrarianUsername);
		
		JLabel AdminPassword = new JLabel("Password: ");
		AdminPassword.setBounds(55, 104, 140, 44);
		AdminPassword.setFont(new Font ("Tahoma", Font.BOLD, 18));
		LibrarianFrame.getContentPane().add(AdminPassword);
		
		JTextField UsernameTextField = new JTextField();
		UsernameTextField.setBounds(180, 50, 218, 44);
		LibrarianFrame.getContentPane().add(UsernameTextField);
		UsernameTextField.setColumns(10);
		
		JPasswordField PasswordField = new JPasswordField();
		PasswordField.setBounds(180, 104, 218, 44);
		LibrarianFrame.getContentPane().add(PasswordField);
		
		JCheckBox ShowPassCheckBox = new JCheckBox("Show Password");
		ShowPassCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ShowPassCheckBox.isSelected()) 
					PasswordField.setEchoChar((char)0);
				else
					PasswordField.setEchoChar('*');
			}
		});
		ShowPassCheckBox.setBounds(180, 154, 128, 21);
		ShowPassCheckBox.setFont(new Font ("Tahoma", Font.BOLD, 12));
		LibrarianFrame.getContentPane().add(ShowPassCheckBox);
		
		JButton BackButton = new JButton("BACK");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Librarian_Login LogIn = new Admin_Librarian_Login();
				LogIn.frame.setVisible(true);
				LibrarianFrame.dispose();
			}
		});
		BackButton.setBounds(237, 242, 103, 41);
		BackButton.setFont(new Font ("Tahoma", Font.CENTER_BASELINE, 16));
		LibrarianFrame.getContentPane().add(BackButton);
		
		
		JButton LogInButton = new JButton("LOGIN");
		LogInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String LibrarianUsername = UsernameTextField.getText();
				String LibrarianPassword = PasswordField.getText();
				
				if(LibrarianUsername.equals("Librarian01") && LibrarianPassword.equals("LibrarianOne") ||
				LibrarianUsername.equals("Librarian02") && LibrarianPassword.equals("LibrarianTwo") || 
				LibrarianUsername.equals("Librarian03") && LibrarianPassword.equals("LibrarianThree")) {
					int dialogResult = JOptionPane.showConfirmDialog(null,"SUCCESSFULLY LOGIN! WELCOME THE LIST OF BOOKS!","", JOptionPane.OK_CANCEL_OPTION);
					if(dialogResult == JOptionPane.OK_OPTION) {
						ListOfBooks List = new ListOfBooks();
						List.BooksFrame.setVisible(true);
						LibrarianFrame.dispose();
					}
				}
				else if(LibrarianUsername != LibrarianPassword) {
					JOptionPane.showMessageDialog(null, "PLEASE INPUT A VALID USERNAME AND PASSWORD",null,JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
		});
		LogInButton.setBounds(180, 193, 103, 41);
		LogInButton.setFont(new Font ("Tahoma", Font.CENTER_BASELINE, 16));
		LibrarianFrame.getContentPane().add(LogInButton);
		
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsernameTextField.setText(null);
				PasswordField.setText(null);
			}
		});
		ResetButton.setBounds(293, 195, 105, 41);
		ResetButton.setFont(new Font ("Tahoma", Font.CENTER_BASELINE, 16));
		LibrarianFrame.getContentPane().add(ResetButton);
		
		
		
		
		
		
		
	}

}
