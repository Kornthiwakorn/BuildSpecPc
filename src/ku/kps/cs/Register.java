package ku.kps.cs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Register {

	private JFrame frame;
	private JTextField textRegisUser;
	private JTextField textRegisFirstName;
	private JTextField textRegisSurName;
	private JTextField textRegisEmail;
	private JPasswordField textRegisPass;
	private JLabel lblRegisFirstName;
	private JLabel lblRegisSurName;
	private JLabel lblRegisEmail;
	private JButton btnRegis;
	private JButton btnClear;
	private JPanel panel;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
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
	public Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 502, 366);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 35));
		lblNewLabel.setBounds(176, 13, 198, 83);
		frame.getContentPane().add(lblNewLabel);

		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new LineBorder(new Color(30, 144, 255), 3));
		panel.setBounds(-35, 27, 608, 53);
		frame.getContentPane().add(panel);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new LineBorder(new Color(30, 144, 255), 3));
		panel_1.setBounds(-52, 93, 608, 202);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		textRegisUser = new JTextField();
		textRegisUser.setBounds(225, 13, 192, 20);
		panel_1.add(textRegisUser);
		textRegisUser.setColumns(10);

		JLabel lblRegisUser = new JLabel("UserName");
		lblRegisUser.setBounds(142, 16, 90, 14);
		panel_1.add(lblRegisUser);
		lblRegisUser.setFont(new Font("Impact", Font.PLAIN, 15));

		JLabel lblRegisPass = new JLabel("Password");
		lblRegisPass.setBounds(142, 47, 90, 14);
		panel_1.add(lblRegisPass);
		lblRegisPass.setFont(new Font("Impact", Font.PLAIN, 15));

		textRegisPass = new JPasswordField();
		textRegisPass.setBounds(225, 44, 192, 20);
		panel_1.add(textRegisPass);

		textRegisFirstName = new JTextField();
		textRegisFirstName.setBounds(225, 75, 192, 20);
		panel_1.add(textRegisFirstName);
		textRegisFirstName.setColumns(10);

		lblRegisFirstName = new JLabel("First name");
		lblRegisFirstName.setBounds(142, 78, 72, 14);
		panel_1.add(lblRegisFirstName);
		lblRegisFirstName.setFont(new Font("Impact", Font.PLAIN, 15));

		lblRegisSurName = new JLabel("Surname");
		lblRegisSurName.setBounds(142, 109, 90, 14);
		panel_1.add(lblRegisSurName);
		lblRegisSurName.setFont(new Font("Impact", Font.PLAIN, 15));

		lblRegisEmail = new JLabel("E-mail");
		lblRegisEmail.setBounds(142, 140, 46, 14);
		panel_1.add(lblRegisEmail);
		lblRegisEmail.setFont(new Font("Impact", Font.PLAIN, 15));

		textRegisSurName = new JTextField();
		textRegisSurName.setBounds(225, 106, 192, 20);
		panel_1.add(textRegisSurName);
		textRegisSurName.setColumns(10);

		textRegisEmail = new JTextField();
		textRegisEmail.setBounds(225, 137, 192, 20);
		panel_1.add(textRegisEmail);
		textRegisEmail.setColumns(10);

		btnRegis = new JButton("Register");
		btnRegis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (RegisterData()) {

					JOptionPane.showMessageDialog(null, "Success");

				}
			}
		});
		btnRegis.setBounds(225, 168, 90, 23);
		panel_1.add(btnRegis);

		btnClear = new JButton("Clear");
		btnClear.setBounds(327, 168, 90, 23);
		panel_1.add(btnClear);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textRegisUser.setText(null);
				textRegisPass.setText(null);
				textRegisFirstName.setText(null);
				textRegisSurName.setText(null);
				textRegisEmail.setText(null);
			}
		});

	}

	private Boolean RegisterData() {

		String Username = textRegisUser.getText();
		String Password = new String(textRegisPass.getPassword());
		String Email = textRegisEmail.getText();
		String Firstname = textRegisFirstName.getText();
		String Surname = textRegisFirstName.getText();

		if (Username.equals("")) {
			JOptionPane.showMessageDialog(null, "Please Input Username");
			textRegisUser.requestFocusInWindow();
			return false;
		}
		if (Password.equals("")) {
			JOptionPane.showMessageDialog(null, "Please Input Password");
			textRegisPass.requestFocusInWindow();
			return false;
		}

		if (Email.equals("")) {
			JOptionPane.showMessageDialog(null, "Please Input Email");
			textRegisEmail.requestFocusInWindow();
			return false;
		}
		if (Firstname.equals("")) {
			JOptionPane.showMessageDialog(null, "Please Input Firstname");
			textRegisFirstName.requestFocusInWindow();
			return false;
		}
		if (Surname.equals("")) {
			JOptionPane.showMessageDialog(null, "Please Input Surname");
			textRegisSurName.requestFocusInWindow();
			return false;
		}

		Connection connect = null;
		Statement s = null;
		Boolean status = false;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/useraccount", "root", "korn1137");

			s = connect.createStatement();

			String sql = "INSERT INTO userinfo " + "(user_id,user_password,user_email,user_firstname,user_surname) "
					+ "VALUES ('" + Username + "','" + Password + "','" + Email + "'" + ",'" + Firstname + "','"
					+ Surname + "') ";
			s.execute(sql);

			textRegisUser.setText("");
			textRegisPass.setText("");
			textRegisFirstName.setText("");
			textRegisSurName.setText("");
			textRegisEmail.setText("");

			status = true;

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}

		try {
			if (s != null) {
				s.close();
				connect.close();
			}
		} catch (SQLException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		return status;

	}

}
