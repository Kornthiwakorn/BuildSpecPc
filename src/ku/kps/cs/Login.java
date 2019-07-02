package ku.kps.cs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.sql.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textUsername;
	private JPasswordField textPassword;
	private JButton btnRegister;
	private String Username;
	private String Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setType(Type.UTILITY);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 403, 359);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(-19, 13, 431, 63);
		panel.setBorder(new LineBorder(new Color(30, 144, 255), 3));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("MY COMPUTER ");
		lblNewLabel.setBounds(110, 13, 233, 43);
		lblNewLabel.setFont(new Font("Impact", Font.BOLD, 35));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new LineBorder(new Color(30, 144, 255), 3));
		panel_1.setBounds(-19, 89, 466, 199);
		contentPane.add(panel_1);
				panel_1.setLayout(null);
		
				JButton btnLogin = new JButton("LOGIN");
				btnLogin.setBounds(148, 84, 90, 23);
				btnLogin.setBackground(Color.WHITE);
				panel_1.add(btnLogin);
				
						btnRegister = new JButton("Register");
						btnRegister.setBounds(250, 84, 89, 23);
						btnRegister.setBackground(Color.WHITE);
						panel_1.add(btnRegister);
						
								textPassword = new JPasswordField();
								textPassword.setBounds(149, 51, 188, 20);
								textPassword.setForeground(Color.BLACK);
								textPassword.setBackground(Color.WHITE);
								panel_1.add(textPassword);
								
										JLabel lblPassword = new JLabel("Password");
										lblPassword.setBounds(67, 57, 76, 14);
										lblPassword.setFont(new Font("Impact", Font.PLAIN, 15));
										panel_1.add(lblPassword);
										
												JLabel lblUsername = new JLabel("Username");
												lblUsername.setBounds(67, 16, 76, 14);
												lblUsername.setFont(new Font("Impact", Font.PLAIN, 15));
												panel_1.add(lblUsername);
												
														textUsername = new JTextField();
														textUsername.setBounds(149, 13, 188, 20);
														textUsername.setForeground(Color.BLACK);
														textUsername.setBackground(Color.WHITE);
														panel_1.add(textUsername);
														textUsername.setColumns(10);
														
														JLabel lblGuest = new JLabel("Guest View");
														lblGuest.setBounds(77, 157, 89, 16);
														lblGuest.setFont(new Font("Impact", Font.PLAIN, 13));
														panel_1.add(lblGuest);
														
														JSeparator separator = new JSeparator();
														separator.setBounds(67, 124, 285, 20);
														panel_1.add(separator);
														
														JButton btnNewButton = new JButton("Click !");
														btnNewButton.setBounds(148, 154, 188, 25);
														panel_1.add(btnNewButton);
														btnNewButton.setForeground(Color.WHITE);
														btnNewButton.setBackground(new Color(255, 0, 102));
														btnNewButton.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent arg0) {
																GuestMain.main(null);
															}
														});
						btnRegister.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent arg0) {
								Register.main(null);
							}
						});
						btnRegister.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

							}
						});
				btnLogin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {

						String Username = textUsername.getText();
						String Password = textPassword.getText();
						PreparedStatement statement = null;
							try {
							
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/useraccount","root", "korn1137");
							String sql = " SELECT * FROM  userinfo " + " WHERE user_id = ? " + " AND user_password = ? ";
							statement = connection.prepareStatement(sql);
							statement.setString(1, Username);
							statement.setString(2, Password);
							ResultSet result = statement.executeQuery();
							

							if (result.next()) {
								Utility.main(null);
								JOptionPane.showMessageDialog(null, "Welcome  :   " + Username);
								setVisible(false);
								
							} else {
								JOptionPane.showMessageDialog(null, "Username or Password Invalid");
								textUsername.requestFocusInWindow();
								textUsername.setText("");
								textPassword.setText("");
							}
							statement.close();
							connection.close();

						} catch (Exception e) {

							e.printStackTrace();
						}

					}
				});

		

	}
}
