package ku.kps.cs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Utility {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Utility window = new Utility();
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
	public Utility() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(105, 105, 105));
		frame.getContentPane().setForeground(new Color(238, 232, 170));
		frame.setBounds(100, 100, 399, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("SHOP CLICK!");
		btnNewButton.setForeground(new Color(230, 230, 250));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainProduct.main(null);
			}
		});
		btnNewButton.setFont(new Font("Impact", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(199, 21, 133));
		btnNewButton.setBounds(199, 195, 194, 176);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("BUILD YOUR PC");
		btnNewButton_1.setForeground(new Color(230, 230, 250));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Impact", Font.PLAIN, 20));
		btnNewButton_1.setBackground(new Color(100, 149, 237));
		btnNewButton_1.setBounds(0, 195, 200, 176);
		frame.getContentPane().add(btnNewButton_1);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 215, 0)));
		panel.setBounds(-14, 31, 422, 134);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 42));
		lblNewLabel.setBounds(127, 28, 192, 71);
		panel.add(lblNewLabel);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, -2, 393, 21);
		frame.getContentPane().add(menuBar);
		JMenu open = new JMenu("Open");
		menuBar.add(open);
		JMenuItem logout = new JMenuItem("Log out");
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.main(null);
				frame.setVisible(false);

			}
		});
		open.add(logout);

	}
}
