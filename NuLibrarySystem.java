import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;

public class NuLibrarySystem {

	JFrame NUframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuLibrarySystem window = new NuLibrarySystem();
					window.NUframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NuLibrarySystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		NUframe = new JFrame();
		NUframe.setBounds(100, 100, 450, 300);
		NUframe.setLocationRelativeTo(null);
		NUframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		NUframe.getContentPane().setLayout(null);
		
		JLabel NUWelcomeLabel = new JLabel("Welcome to NU Library System");
		NUWelcomeLabel.setBounds(43, 70, 350, 59);
		NUWelcomeLabel.setFont(new Font ("Tahoma", Font.BOLD, 22));
		NUframe.getContentPane().add(NUWelcomeLabel);
		
		JButton backButton = new JButton("BACK");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Librarian_Login Nu = new Admin_Librarian_Login();
				Nu.frame.setVisible(true);
				NUframe.dispose();
			}
		});
		backButton.setBounds(144, 139, 131, 41);
		backButton.setFont(new Font ("Tahoma", Font.BOLD, 16));
		NUframe.getContentPane().add(backButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(10, 10, 416, 243);
		NUframe.getContentPane().add(panel);
	}

}
