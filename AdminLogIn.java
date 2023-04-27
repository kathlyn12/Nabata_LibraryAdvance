import java.awt.EventQueue;
import java.awt.Font;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class AdminLogIn {

	JFrame Mainframe;
	private JCheckBox ShowPassCheckBox;
	private JLabel AdminLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogIn adminFrame = new AdminLogIn();
					adminFrame.Mainframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminLogIn() { 
		
		Mainframe = new JFrame("ADMIN LOGIN");
		Mainframe.setBounds(100, 100, 471, 326);
		Mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Mainframe.setLocationRelativeTo(null);
		Mainframe.getContentPane().setLayout(null);
		
		AdminLogin = new JLabel("Admin Login Form");
		AdminLogin.setBounds(150, 10, 168, 30);
		AdminLogin.setFont(new Font ("Tahoma", Font.BOLD, 18));
		Mainframe.getContentPane().add(AdminLogin);
		
		JLabel AdminUsername = new JLabel("Username: ");
		AdminUsername.setBounds(55, 53, 140, 41);
		AdminUsername.setFont(new Font ("Tahoma", Font.BOLD, 18));
		Mainframe.getContentPane().add(AdminUsername);
		
		JLabel AdminPassword = new JLabel("Password: ");
		AdminPassword.setBounds(55, 104, 140, 44);
		AdminPassword.setFont(new Font ("Tahoma", Font.BOLD, 18));
		Mainframe.getContentPane().add(AdminPassword);
		
		JTextField UsernameTextField = new JTextField();
		UsernameTextField.setBounds(180, 50, 218, 44);
		Mainframe.getContentPane().add(UsernameTextField);
		UsernameTextField.setColumns(10);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(180, 104, 218, 44);
		Mainframe.getContentPane().add(passwordField);
		
		ShowPassCheckBox = new JCheckBox("Show Password");
		ShowPassCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ShowPassCheckBox.isSelected()) 
					passwordField.setEchoChar((char)0);
				else
					passwordField.setEchoChar('*');
			}
		});
		ShowPassCheckBox.setBounds(180, 154, 128, 21);
		ShowPassCheckBox.setFont(new Font ("Tahoma", Font.BOLD, 12));
		Mainframe.getContentPane().add(ShowPassCheckBox);
		
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsernameTextField.setText(null);
				passwordField.setText(null);
			}
		});
		ResetButton.setBounds(295, 191, 103, 41);
		ResetButton.setFont(new Font ("Tahoma", Font.CENTER_BASELINE, 16));
		Mainframe.getContentPane().add(ResetButton);
		
		JButton LoginButton = new JButton("ENTER");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String AdminUsername = UsernameTextField.getText();
				String AdminPassword = passwordField.getText();
				
				if(AdminUsername.equals("Admin01") && AdminPassword.equals("AdminOne") ||
				AdminUsername.equals("Admin02") && AdminPassword.equals("AdminTwo") || 
				AdminUsername.equals("Admin03") && AdminPassword.equals("AdminThree")) {
					int dialogResult = JOptionPane.showConfirmDialog(null,"SUCCESSFULLY LOGIN","", JOptionPane.OK_CANCEL_OPTION);
					if(dialogResult == JOptionPane.OK_OPTION) {
						NuLibrarySystem NuLib = new NuLibrarySystem();
						NuLib.NUframe.setVisible(true);
						Mainframe.dispose();
					}
				}
				else if(AdminUsername != AdminPassword) {
					JOptionPane.showMessageDialog(null, "PLEASE INPUT A VALID USERNAME AND PASSWORD",null,JOptionPane.ERROR_MESSAGE);
					return;
				}
				
			}
		});
		LoginButton.setBounds(182, 191, 103, 41);
		LoginButton.setFont(new Font ("Tahoma", Font.CENTER_BASELINE, 16));
		Mainframe.getContentPane().add(LoginButton);
		
		JButton BackButton = new JButton("BACK");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Librarian_Login ALogin = new Admin_Librarian_Login();
				ALogin.frame.setVisible(true);
				Mainframe.dispose();
			}
		});
		BackButton.setBounds(239, 242, 103, 37);
		BackButton.setFont(new Font ("Tahoma", Font.BOLD, 16));
		Mainframe.getContentPane().add(BackButton);
		

	}
}
