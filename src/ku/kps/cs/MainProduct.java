package ku.kps.cs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Window;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Window.Type;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ku.kps.cs.product.Case;
import ku.kps.cs.product.Cpu;
import ku.kps.cs.product.Hdd;
import ku.kps.cs.product.Mainboard;
import ku.kps.cs.product.Monitor;
import ku.kps.cs.product.Psu;
import ku.kps.cs.product.Ram;
import ku.kps.cs.product.Vga;

import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class MainProduct extends javax.swing.JFrame {
	private JFrame frame;
	public static String path;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainProduct window = new MainProduct();
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
	public MainProduct() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 204, 255));
		frame.setType(Type.UTILITY);
		frame.setResizable(false);
		frame.setBounds(100, 100, 979, 675);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setBounds(12, 107, 949, 520);
		tabbedPane.setBorder(new LineBorder(new Color(0, 153, 204), 4));
		tabbedPane.setFont(new Font("Impact", Font.PLAIN, 25));
		frame.getContentPane().add(tabbedPane);

		JPanel panelCpu = new JPanel();
		panelCpu.setForeground(new Color(30, 144, 255));
		panelCpu.setBackground(new Color(255, 255, 255));
		panelCpu.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("CPU", null, panelCpu, null);

		JLabel imgI3 = new JLabel("111");
		imgI3.setBounds(71, 25, 164, 164);
		ImageIcon cpui3 = new ImageIcon("img/i3.jpg");
		panelCpu.setLayout(null);
		imgI3.setIcon(new ImageIcon("img\\i3.jpg"));

		panelCpu.add(imgI3);

		JLabel imgI5 = new JLabel("222");
		imgI5.setBounds(309, 25, 164, 164);
		imgI5.setIcon(new ImageIcon("img\\i5.jpg"));
		panelCpu.add(imgI5);

		JLabel imgI7 = new JLabel("New label");
		imgI7.setBounds(577, 25, 164, 164);
		imgI7.setIcon(new ImageIcon("img\\i7.jpg"));
		panelCpu.add(imgI7);

		JLabel lblpricei9 = new JLabel("New label");
		lblpricei9.setBounds(71, 265, 164, 164);
		lblpricei9.setIcon(new ImageIcon("img\\i9.jpg"));
		panelCpu.add(lblpricei9);

		JButton btnAddCpu1 = new JButton("Buy");
		btnAddCpu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cpu cpu1 = new Cpu();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = cpu1.getPriceCpu1()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+cpu1.getPriceCpu1()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		btnAddCpu1.setBounds(76, 227, 76, 25);
		panelCpu.add(btnAddCpu1);

		JButton btnAddCpu2 = new JButton("Buy");
		btnAddCpu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cpu cpu2 = new Cpu();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = cpu2.getPriceCpu2()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+cpu2.getPriceCpu2()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		btnAddCpu2.setBounds(309, 227, 76, 25);
		panelCpu.add(btnAddCpu2);

		JButton btnAddCpu3 = new JButton("Buy");
		btnAddCpu3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cpu cpu3 = new Cpu();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = cpu3.getPriceCpu3()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+cpu3.getPriceCpu3()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		btnAddCpu3.setBounds(577, 227, 81, 25);
		panelCpu.add(btnAddCpu3);

		JButton btnAddCpu4 = new JButton("Buy");
		btnAddCpu4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cpu cpu4 = new Cpu();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = cpu4.getPriceCpu4()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+cpu4.getPriceCpu4()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		btnAddCpu4.setBounds(71, 458, 81, 25);
		panelCpu.add(btnAddCpu4);

		JButton btnDeCpu1 = new JButton("Detail");
		btnDeCpu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showMessageDialog(null, "INTEL CORE I3\nClock : 3.6 Ghz\nPrice : 5000 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnDeCpu1.setBounds(159, 227, 76, 25);
		panelCpu.add(btnDeCpu1);

		JButton btnDeCpu2 = new JButton("Detail");
		btnDeCpu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "INTEL CORE I5\nClock : 4.0 Ghz\nPrice : 7000 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnDeCpu2.setBounds(397, 227, 76, 25);
		panelCpu.add(btnDeCpu2);

		JButton btnDeCpu3 = new JButton("Detail");
		btnDeCpu3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "INTEL CORE I7\nClock : 4.6 Ghz\nPrice : 12000 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnDeCpu3.setBounds(670, 227, 76, 25);
		panelCpu.add(btnDeCpu3);

		JButton btnDeCpu4 = new JButton("Detail");
		btnDeCpu4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "INTEL CORE I9\nClock : 5.0 Ghz\nPrice : 20000 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnDeCpu4.setBounds(159, 458, 76, 25);
		panelCpu.add(btnDeCpu4);

		JLabel lblpricei3 = new JLabel("5,000.0  THB");
		lblpricei3.setForeground(new Color(30, 144, 255));
		lblpricei3.setFont(new Font("Impact", Font.PLAIN, 14));
		lblpricei3.setBounds(71, 198, 104, 16);
		panelCpu.add(lblpricei3);

		JLabel lblpricei5 = new JLabel("7,000.0 THB");
		lblpricei5.setFont(new Font("Impact", Font.PLAIN, 14));
		lblpricei5.setForeground(new Color(30, 144, 255));
		lblpricei5.setBounds(309, 202, 104, 16);
		panelCpu.add(lblpricei5);

		JLabel lblpricei7 = new JLabel("12000.0 THB");
		lblpricei7.setFont(new Font("Impact", Font.PLAIN, 14));
		lblpricei7.setForeground(new Color(30, 144, 255));
		lblpricei7.setBounds(577, 202, 81, 16);
		panelCpu.add(lblpricei7);

		JLabel lblNewLabel_7 = new JLabel("20,000.0 THB");
		lblNewLabel_7.setFont(new Font("Impact", Font.PLAIN, 14));
		lblNewLabel_7.setForeground(new Color(30, 144, 255));
		lblNewLabel_7.setBounds(71, 429, 87, 16);
		panelCpu.add(lblNewLabel_7);

		JPanel panelMb = new JPanel();
		panelMb.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelMb.setBackground(Color.WHITE);
		tabbedPane.addTab("MAINBOARD", null, panelMb, null);
		panelMb.setLayout(null);

		JLabel lblNewMB1 = new JLabel("");
		lblNewMB1.setBounds(71, 25, 164, 164);
		lblNewMB1.setIcon(new ImageIcon("img\\mb.jpg"));
		panelMb.add(lblNewMB1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(323, 25, 170, 164);
		lblNewLabel_2.setIcon(new ImageIcon("img\\mb1.jpg"));
		panelMb.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(577, 25, 164, 164);
		lblNewLabel_3.setIcon(new ImageIcon("img\\mb3.jpg"));
		panelMb.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(71, 265, 164, 164);
		lblNewLabel_4.setIcon(new ImageIcon("img\\mb2.jpg"));
		panelMb.add(lblNewLabel_4);

		JButton btnNewButton = new JButton("Buy");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainboard mb1 = new Mainboard();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = mb1.getPriceMb1()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+mb1.getPriceMb1()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		btnNewButton.setBounds(51, 231, 89, 23);
		panelMb.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Detail");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Asus Z370\nPrice : 12000 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnNewButton_1.setBounds(146, 231, 89, 23);
		panelMb.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Buy");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainboard mb2 = new Mainboard();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = mb2.getPriceMb2()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+mb2.getPriceMb2()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		btnNewButton_2.setBounds(311, 231, 89, 23);
		panelMb.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Detail");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Gigabyte Z370\nPrice : 10000 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnNewButton_3.setBounds(404, 231, 89, 23);
		panelMb.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Buy");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainboard mb3 = new Mainboard();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = mb3.getPriceMb3()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+mb3.getPriceMb3()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		btnNewButton_4.setBounds(556, 231, 89, 23);
		panelMb.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("Detail");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Msi Z370\nPrice : 8000 THB", "Detail", JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnNewButton_5.setBounds(655, 231, 89, 23);
		panelMb.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("Buy");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainboard mb4 = new Mainboard();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = mb4.getPriceMb4()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+mb4.getPriceMb4()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		btnNewButton_6.setBounds(51, 459, 89, 23);
		panelMb.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("Detail");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Asrock Z370\nPrice : 6000 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnNewButton_7.setBounds(146, 459, 89, 23);
		panelMb.add(btnNewButton_7);

		JLabel lblNewLabel_29 = new JLabel("12,000.0 THB");
		lblNewLabel_29.setForeground(new Color(30, 144, 255));
		lblNewLabel_29.setFont(new Font("Impact", Font.PLAIN, 14));
		lblNewLabel_29.setBounds(51, 206, 89, 14);
		panelMb.add(lblNewLabel_29);

		JLabel lblNewLabel_30 = new JLabel("10,000.0 THB");
		lblNewLabel_30.setForeground(new Color(30, 144, 255));
		lblNewLabel_30.setFont(new Font("Impact", Font.PLAIN, 14));
		lblNewLabel_30.setBounds(311, 206, 89, 14);
		panelMb.add(lblNewLabel_30);

		JLabel lblNewLabel_31 = new JLabel("80,00.0 THB");
		lblNewLabel_31.setForeground(new Color(30, 144, 255));
		lblNewLabel_31.setFont(new Font("Impact", Font.PLAIN, 14));
		lblNewLabel_31.setBounds(556, 206, 89, 14);
		panelMb.add(lblNewLabel_31);

		JLabel lblNewLabel_32 = new JLabel("6,000.0 THB");
		lblNewLabel_32.setForeground(new Color(30, 144, 255));
		lblNewLabel_32.setFont(new Font("Impact", Font.PLAIN, 14));
		lblNewLabel_32.setBounds(51, 434, 105, 14);
		panelMb.add(lblNewLabel_32);

		JPanel panelRam = new JPanel();
		panelRam.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelRam.setBackground(Color.WHITE);
		tabbedPane.addTab("RAM", null, panelRam, null);
		panelRam.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("img\\r1.jpg"));
		lblNewLabel_1.setBounds(71, 25, 164, 164);
		panelRam.add(lblNewLabel_1);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("img\\r2.jpg"));
		lblNewLabel_5.setBounds(309, 25, 164, 164);
		panelRam.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("img\\r1.jpg"));
		lblNewLabel_6.setBounds(577, 25, 164, 164);
		panelRam.add(lblNewLabel_6);

		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("img\\r2.jpg"));
		lblNewLabel_8.setBounds(71, 265, 164, 164);
		panelRam.add(lblNewLabel_8);

		JButton btnNewButton_8 = new JButton("Buy");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ram ram1 = new Ram();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = ram1.getPriceRam1()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ram1.getPriceRam1()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_8.setBounds(52, 231, 89, 23);
		panelRam.add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("Detail");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : Corsair\nMemmory : 16GB\nBus : 2400 MHz\nPrice : 8000 THB",
						"Detail", JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnNewButton_9.setBounds(151, 231, 89, 23);
		panelRam.add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("Buy");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ram ram2 = new Ram();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = ram2.getPriceRam2()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ram2.getPriceRam2()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_10.setBounds(286, 231, 89, 23);
		panelRam.add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton("Detail");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton_11.setBounds(385, 231, 89, 23);
		panelRam.add(btnNewButton_11);

		JButton btnNewButton_12 = new JButton("Buy");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ram ram3 = new Ram();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = ram3.getPriceRam3()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ram3.getPriceRam3()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_12.setBounds(556, 231, 89, 23);
		panelRam.add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("Detail");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Name : Corsair\nMemmory : 16GB\nBus : 3600 MHz\nPrice : 9500 THB",
						"Detail", JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnNewButton_13.setBounds(652, 231, 89, 23);
		panelRam.add(btnNewButton_13);

		JButton btnNewButton_14 = new JButton("Buy");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ram ram4 = new Ram();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = ram4.getPriceRam4()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ram4.getPriceRam4()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_14.setBounds(52, 456, 89, 23);
		panelRam.add(btnNewButton_14);

		JButton btnNewButton_15 = new JButton("Detail");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : Corsair\nMemmory : 16GB\nBus : 3600 MHz\nPrice : 9500 THB",
						"Detail", JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnNewButton_15.setBounds(151, 456, 89, 23);
		panelRam.add(btnNewButton_15);

		JLabel lblNewLabel_33 = new JLabel("8,0000.0 THB");
		lblNewLabel_33.setForeground(new Color(30, 144, 255));
		lblNewLabel_33.setFont(new Font("Impact", Font.PLAIN, 14));
		lblNewLabel_33.setBounds(52, 211, 104, 14);
		panelRam.add(lblNewLabel_33);

		JLabel lblNewLabel_34 = new JLabel("8,500.0 THB");
		lblNewLabel_34.setForeground(new Color(30, 144, 255));
		lblNewLabel_34.setFont(new Font("Impact", Font.PLAIN, 14));
		lblNewLabel_34.setBounds(286, 211, 89, 14);
		panelRam.add(lblNewLabel_34);

		JLabel lblNewLabel_35 = new JLabel("9,000.0 THB");
		lblNewLabel_35.setForeground(new Color(30, 144, 255));
		lblNewLabel_35.setFont(new Font("Impact", Font.PLAIN, 14));
		lblNewLabel_35.setBounds(556, 211, 104, 14);
		panelRam.add(lblNewLabel_35);

		JLabel lblNewLabel_36 = new JLabel("9,500.0 THB");
		lblNewLabel_36.setForeground(new Color(30, 144, 255));
		lblNewLabel_36.setFont(new Font("Impact", Font.PLAIN, 14));
		lblNewLabel_36.setBounds(52, 431, 104, 14);
		panelRam.add(lblNewLabel_36);

		JPanel panelVga = new JPanel();
		panelVga.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelVga.setBackground(Color.WHITE);
		tabbedPane.addTab("VGA CARD", null, panelVga, null);
		panelVga.setLayout(null);

		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("img\\vga1.jpg"));
		lblNewLabel_9.setBounds(71, 25, 164, 164);
		panelVga.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("img\\vga2.jpg"));
		lblNewLabel_10.setBounds(309, 25, 164, 164);
		panelVga.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("img\\vga3.jpg"));
		lblNewLabel_11.setBounds(577, 25, 164, 164);
		panelVga.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("img\\vga4.jpg"));
		lblNewLabel_12.setBounds(71, 265, 164, 164);
		panelVga.add(lblNewLabel_12);

		JLabel lblThb_16 = new JLabel("45,0000.0 THB");
		lblThb_16.setForeground(new Color(30, 144, 255));
		lblThb_16.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb_16.setBounds(36, 200, 104, 14);
		panelVga.add(lblThb_16);

		JLabel lblThb_19 = new JLabel("20,000.0 THB");
		lblThb_19.setForeground(new Color(30, 144, 255));
		lblThb_19.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb_19.setBounds(46, 434, 104, 14);
		panelVga.add(lblThb_19);

		JLabel lblThb_17 = new JLabel("42,00.0 THB");
		lblThb_17.setForeground(new Color(30, 144, 255));
		lblThb_17.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb_17.setBounds(309, 200, 89, 14);
		panelVga.add(lblThb_17);

		JLabel lblThb_18 = new JLabel("27,000.0 THB");
		lblThb_18.setForeground(new Color(30, 144, 255));
		lblThb_18.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb_18.setBounds(577, 200, 104, 14);
		panelVga.add(lblThb_18);

		JButton button = new JButton("Buy");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vga vga1 = new Vga();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = vga1.getPriceVga1()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+vga1.getPriceVga1()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
				
			}
		});
		button.setBounds(36, 233, 89, 23);
		panelVga.add(button);

		JButton button_1 = new JButton("Detail");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : RTX2080Ti\nMemmory : Gddr6 6GB\nPrice : 45000 THB",
						"Detail", JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_1.setBounds(135, 233, 89, 23);
		panelVga.add(button_1);

		JButton button_2 = new JButton("Buy");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vga vga4 = new Vga();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = vga4.getPriceVga4()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+vga4.getPriceVga4()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		button_2.setBounds(36, 458, 89, 23);
		panelVga.add(button_2);

		JButton button_3 = new JButton("Detail");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : GTX1080Ti\nMemmory : Gddr6 6GB\nPrice : 20000 THB",
						"Detail", JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_3.setBounds(135, 458, 89, 23);
		panelVga.add(button_3);

		JButton button_4 = new JButton("Buy");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vga vga2 = new Vga();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = vga2.getPriceVga2()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+vga2.getPriceVga2()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		button_4.setBounds(270, 233, 89, 23);
		panelVga.add(button_4);

		JButton button_5 = new JButton("Detail");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : RTX2080\nMemmory : Gddr6 6GB\nPrice : 42000 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_5.setBounds(369, 233, 89, 23);
		panelVga.add(button_5);

		JButton button_6 = new JButton("Buy");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vga vga3 = new Vga();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = vga3.getPriceVga3()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+vga3.getPriceVga3()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		button_6.setBounds(540, 233, 89, 23);
		panelVga.add(button_6);

		JButton button_7 = new JButton("Detail");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : RTX2070\nMemmory : Gddr6 6GB\nPrice : 27000 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_7.setBounds(639, 233, 89, 23);
		panelVga.add(button_7);

		JPanel panelHdd = new JPanel();
		panelHdd.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelHdd.setBackground(Color.WHITE);
		tabbedPane.addTab("HDD/SSD", null, panelHdd, null);
		panelHdd.setLayout(null);

		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon("img\\hd1.jpg"));
		lblNewLabel_13.setBounds(71, 25, 164, 164);
		panelHdd.add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setIcon(new ImageIcon("img\\hd4.jpg"));
		lblNewLabel_14.setBounds(71, 265, 164, 164);
		panelHdd.add(lblNewLabel_14);

		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon("img\\hd2.jpg"));
		lblNewLabel_15.setBounds(309, 25, 164, 164);
		panelHdd.add(lblNewLabel_15);

		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setIcon(new ImageIcon("img\\hd3.jpg"));
		lblNewLabel_16.setBounds(577, 25, 164, 164);
		panelHdd.add(lblNewLabel_16);

		JLabel lblThb = new JLabel("2,0000.0 THB");
		lblThb.setForeground(new Color(30, 144, 255));
		lblThb.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb.setBounds(49, 216, 104, 14);
		panelHdd.add(lblThb);

		JLabel lblThb_3 = new JLabel("30,0000.0 THB");
		lblThb_3.setForeground(new Color(30, 144, 255));
		lblThb_3.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb_3.setBounds(49, 436, 104, 14);
		panelHdd.add(lblThb_3);

		JLabel lblThb_1 = new JLabel("2,500.0 THB");
		lblThb_1.setForeground(new Color(30, 144, 255));
		lblThb_1.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb_1.setBounds(293, 216, 89, 14);
		panelHdd.add(lblThb_1);

		JLabel lblThb_2 = new JLabel("15,000.0 THB");
		lblThb_2.setForeground(new Color(30, 144, 255));
		lblThb_2.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb_2.setBounds(553, 216, 104, 14);
		panelHdd.add(lblThb_2);

		JButton button_8 = new JButton("Buy");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hdd hdd1 = new Hdd();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = hdd1.getPriceHdd1()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ hdd1.getPriceHdd1()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		button_8.setBounds(49, 241, 89, 23);
		panelHdd.add(button_8);

		JButton button_9 = new JButton("Detail");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : WD Black\nMemmory : 1TB\nPrice : 2000 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_9.setBounds(148, 241, 89, 23);
		panelHdd.add(button_9);

		JButton button_10 = new JButton("Buy");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hdd hdd4 = new Hdd();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = hdd4.getPriceHdd4()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ hdd4.getPriceHdd4()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		button_10.setBounds(49, 466, 89, 23);
		panelHdd.add(button_10);

		JButton button_11 = new JButton("Detail");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : SSD Samsung 970EVO\nMemmory : 2TB\nPrice : 30000 THB",
						"Detail", JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_11.setBounds(148, 466, 89, 23);
		panelHdd.add(button_11);

		JButton button_12 = new JButton("Detail");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : WD Black\nMemmory : 2TB\nPrice : 2500 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_12.setBounds(382, 241, 89, 23);
		panelHdd.add(button_12);

		JButton button_13 = new JButton("Buy");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hdd hdd2 = new Hdd();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = hdd2.getPriceHdd2()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ hdd2.getPriceHdd2()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		button_13.setBounds(283, 241, 89, 23);
		panelHdd.add(button_13);

		JButton button_14 = new JButton("Buy");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hdd hdd3 = new Hdd();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = hdd3.getPriceHdd3()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ hdd3.getPriceHdd3()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		button_14.setBounds(553, 241, 89, 23);
		panelHdd.add(button_14);

		JButton button_15 = new JButton("Detail");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : SSD Samsung 970EVO\nMemmory : 1TB\nPrice : 15000 THB",
						"Detail", JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_15.setBounds(652, 241, 89, 23);
		panelHdd.add(button_15);

		JPanel panelPsu = new JPanel();
		panelPsu.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelPsu.setBackground(Color.WHITE);
		tabbedPane.addTab("PSU", null, panelPsu, null);
		panelPsu.setLayout(null);

		JLabel lblNewLabel_17 = new JLabel("New label");
		lblNewLabel_17.setIcon(new ImageIcon("img\\psu500.jpg"));
		lblNewLabel_17.setBounds(71, 25, 164, 164);
		panelPsu.add(lblNewLabel_17);

		JLabel lblNewLabel_18 = new JLabel("New label");
		lblNewLabel_18.setIcon(new ImageIcon("img\\psu600.jpg"));
		lblNewLabel_18.setBounds(309, 25, 164, 164);
		panelPsu.add(lblNewLabel_18);

		JLabel lblNewLabel_19 = new JLabel("New label");
		lblNewLabel_19.setIcon(new ImageIcon("img\\psu750.jpg"));
		lblNewLabel_19.setBounds(553, 18, 214, 179);
		panelPsu.add(lblNewLabel_19);

		JLabel lblNewLabel_20 = new JLabel("New label");
		lblNewLabel_20.setIcon(new ImageIcon("img\\psu1000.jpg"));
		lblNewLabel_20.setBounds(49, 274, 164, 164);
		panelPsu.add(lblNewLabel_20);

		JLabel lblThb_4 = new JLabel("2,500.0 THB");
		lblThb_4.setForeground(new Color(30, 144, 255));
		lblThb_4.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb_4.setBounds(49, 215, 104, 14);
		panelPsu.add(lblThb_4);

		JButton button_16 = new JButton("Buy");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Psu psu1 = new Psu();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = psu1.getPricePsu1()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ psu1.getPricePsu1()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		button_16.setBounds(49, 248, 89, 23);
		panelPsu.add(button_16);

		JLabel lblThb_7 = new JLabel("5,500.0 THB");
		lblThb_7.setForeground(new Color(30, 144, 255));
		lblThb_7.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb_7.setBounds(59, 449, 104, 14);
		panelPsu.add(lblThb_7);

		JButton button_17 = new JButton("Buy");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Psu psu4 = new Psu();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = psu4.getPricePsu4()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ psu4.getPricePsu4()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		button_17.setBounds(49, 473, 89, 23);
		panelPsu.add(button_17);

		JButton button_18 = new JButton("Detail");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : CM\nWatt : 1000 watt\nPrice : 5500 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_18.setBounds(148, 473, 89, 23);
		panelPsu.add(button_18);

		JButton button_19 = new JButton("Detail");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : CM\nWatt : 500 watt\nPrice : 2500 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_19.setBounds(148, 248, 89, 23);
		panelPsu.add(button_19);

		JLabel lblThb_5 = new JLabel("3,500.0 THB");
		lblThb_5.setForeground(new Color(30, 144, 255));
		lblThb_5.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb_5.setBounds(283, 215, 89, 14);
		panelPsu.add(lblThb_5);

		JButton button_20 = new JButton("Buy");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Psu psu2 = new Psu();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = psu2.getPricePsu2()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ psu2.getPricePsu2()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		button_20.setBounds(283, 248, 89, 23);
		panelPsu.add(button_20);

		JButton button_21 = new JButton("Detail");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : CM\nWatt : 600 watt\nPrice : 3500 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_21.setBounds(382, 248, 89, 23);
		panelPsu.add(button_21);

		JLabel lblThb_6 = new JLabel("4,500.0 THB");
		lblThb_6.setForeground(new Color(30, 144, 255));
		lblThb_6.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb_6.setBounds(553, 215, 104, 14);
		panelPsu.add(lblThb_6);

		JButton button_22 = new JButton("Buy");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Psu psu3 = new Psu();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = psu3.getPricePsu3()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ psu3.getPricePsu3()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		button_22.setBounds(553, 248, 89, 23);
		panelPsu.add(button_22);

		JButton button_23 = new JButton("Detail");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : CM\nWatt : 700 watt\nPrice : 4500 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_23.setBounds(652, 248, 89, 23);
		panelPsu.add(button_23);

		JPanel panelCase = new JPanel();
		panelCase.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelCase.setBackground(Color.WHITE);
		tabbedPane.addTab("CASE", null, panelCase, null);
		panelCase.setLayout(null);

		JLabel lblNewLabel_21 = new JLabel("New label");
		lblNewLabel_21.setIcon(new ImageIcon("img\\caseP3.jpg"));
		lblNewLabel_21.setBounds(71, 25, 164, 164);
		panelCase.add(lblNewLabel_21);

		JLabel lblNewLabel_22 = new JLabel("New label");
		lblNewLabel_22.setIcon(new ImageIcon("img\\caseP5.jpg"));
		lblNewLabel_22.setBounds(309, 25, 164, 164);
		panelCase.add(lblNewLabel_22);

		JLabel lblNewLabel_23 = new JLabel("New label");
		lblNewLabel_23.setIcon(new ImageIcon("img\\case21.jpg"));
		lblNewLabel_23.setBounds(577, 25, 164, 164);
		panelCase.add(lblNewLabel_23);

		JLabel lblNewLabel_24 = new JLabel("New label");
		lblNewLabel_24.setIcon(new ImageIcon("img\\case22.jpg"));
		lblNewLabel_24.setBounds(49, 282, 164, 164);
		panelCase.add(lblNewLabel_24);

		JLabel lblThb_8 = new JLabel("3,000.0 THB");
		lblThb_8.setForeground(new Color(30, 144, 255));
		lblThb_8.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb_8.setBounds(49, 215, 104, 14);
		panelCase.add(lblThb_8);

		JButton btnBuy = new JButton("Buy");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Case case1 = new Case();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = case1.getPriceCase1()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ case1.getPriceCase1()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		btnBuy.setBounds(49, 248, 89, 23);
		panelCase.add(btnBuy);

		JLabel lblThb_11 = new JLabel("4,000.0 THB");
		lblThb_11.setForeground(new Color(30, 144, 255));
		lblThb_11.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb_11.setBounds(59, 449, 104, 14);
		panelCase.add(lblThb_11);

		JButton btnBuy_3 = new JButton("Buy");
		btnBuy_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Case case4 = new Case();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = case4.getPriceCase4()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ case4.getPriceCase4()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		btnBuy_3.setBounds(49, 473, 89, 23);
		panelCase.add(btnBuy_3);

		JButton button_26 = new JButton("Detail");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : Thermaltake view22\nPrice : 4000 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_26.setBounds(148, 473, 89, 23);
		panelCase.add(button_26);

		JButton button_27 = new JButton("Detail");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : Thermaltake core P3\nPrice : 3000 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_27.setBounds(148, 248, 89, 23);
		panelCase.add(button_27);

		JLabel lblThb_9 = new JLabel("5,000.0 THB");
		lblThb_9.setForeground(new Color(30, 144, 255));
		lblThb_9.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb_9.setBounds(283, 215, 89, 14);
		panelCase.add(lblThb_9);

		JButton btnBuy_1 = new JButton("Buy");
		btnBuy_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Case case2 = new Case();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = case2.getPriceCase2()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ case2.getPriceCase2()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		btnBuy_1.setBounds(283, 248, 89, 23);
		panelCase.add(btnBuy_1);

		JButton button_29 = new JButton("Detail");
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : Thermaltake core P3\nPrice : 5000 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_29.setBounds(382, 248, 89, 23);
		panelCase.add(button_29);

		JLabel lblThb_10 = new JLabel("2,500.0 THB");
		lblThb_10.setForeground(new Color(30, 144, 255));
		lblThb_10.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb_10.setBounds(553, 215, 104, 14);
		panelCase.add(lblThb_10);

		JButton btnBuy_2 = new JButton("Buy");
		btnBuy_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Case case3 = new Case();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = case3.getPriceCase3()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ case3.getPriceCase3()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		btnBuy_2.setBounds(553, 248, 89, 23);
		panelCase.add(btnBuy_2);

		JButton button_31 = new JButton("Detail");
		button_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : Thermaltake view21\nPrice : 2500 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_31.setBounds(652, 248, 89, 23);
		panelCase.add(button_31);

		JPanel panelMonitor = new JPanel();
		panelMonitor.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelMonitor.setBackground(Color.WHITE);
		tabbedPane.addTab("MONITOR", null, panelMonitor, null);
		panelMonitor.setLayout(null);

		JLabel lblNewLabel_25 = new JLabel("New label");
		lblNewLabel_25.setIcon(new ImageIcon("img\\Asus.jpg"));
		lblNewLabel_25.setBounds(71, 25, 164, 164);
		panelMonitor.add(lblNewLabel_25);

		JLabel lblNewLabel_26 = new JLabel("New label");
		lblNewLabel_26.setIcon(new ImageIcon("img\\dell.jpg"));
		lblNewLabel_26.setBounds(309, 25, 164, 164);
		panelMonitor.add(lblNewLabel_26);

		JLabel lblNewLabel_27 = new JLabel("");
		lblNewLabel_27.setIcon(new ImageIcon("img\\lg.jpg"));
		lblNewLabel_27.setBounds(557, 25, 199, 164);
		panelMonitor.add(lblNewLabel_27);

		JLabel lblNewLabel_28 = new JLabel("New label");
		lblNewLabel_28.setIcon(new ImageIcon("img\\zowie.jpg"));
		lblNewLabel_28.setBounds(50, 274, 164, 164);
		panelMonitor.add(lblNewLabel_28);

		JLabel lblThb_12 = new JLabel("12,0000.0 THB");
		lblThb_12.setForeground(new Color(30, 144, 255));
		lblThb_12.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb_12.setBounds(53, 215, 104, 14);
		panelMonitor.add(lblThb_12);

		JButton btnBuy_4 = new JButton("Buy");
		btnBuy_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Monitor monitor1 = new Monitor();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = monitor1.getPriceMonitor1()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ monitor1.getPriceMonitor1()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		btnBuy_4.setBounds(53, 248, 89, 23);
		panelMonitor.add(btnBuy_4);

		JLabel lblThb_15 = new JLabel("20,000.0 THB");
		lblThb_15.setForeground(new Color(30, 144, 255));
		lblThb_15.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb_15.setBounds(63, 449, 104, 14);
		panelMonitor.add(lblThb_15);

		JButton btnBuy_7 = new JButton("Buy");
		btnBuy_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Monitor monitor4 = new Monitor();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = monitor4.getPriceMonitor4()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ monitor4.getPriceMonitor4()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		btnBuy_7.setBounds(53, 473, 89, 23);
		panelMonitor.add(btnBuy_7);

		JButton button_34 = new JButton("Detail");
		button_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : Zowie\nRefresh rate 144Hz\nPrice : 2500 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_34.setBounds(152, 473, 89, 23);
		panelMonitor.add(button_34);

		JButton button_35 = new JButton("Detail");
		button_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : Asus\nRefresh rate 144Hz\nPrice : 2500 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_35.setBounds(152, 248, 89, 23);
		panelMonitor.add(button_35);

		JLabel lblThb_13 = new JLabel("15,000.0 THB");
		lblThb_13.setForeground(new Color(30, 144, 255));
		lblThb_13.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb_13.setBounds(287, 215, 89, 14);
		panelMonitor.add(lblThb_13);

		JButton btnBuy_5 = new JButton("Buy");
		btnBuy_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Monitor monitor2 = new Monitor();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = monitor2.getPriceMonitor2()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ monitor2.getPriceMonitor2()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		btnBuy_5.setBounds(287, 248, 89, 23);
		panelMonitor.add(btnBuy_5);

		JButton button_37 = new JButton("Detail");
		button_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : Dell\nRefresh rate 144Hz\nPrice : 2500 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_37.setBounds(386, 248, 89, 23);
		panelMonitor.add(button_37);

		JLabel lblThb_14 = new JLabel("17,000.0 THB");
		lblThb_14.setForeground(new Color(30, 144, 255));
		lblThb_14.setFont(new Font("Impact", Font.PLAIN, 14));
		lblThb_14.setBounds(557, 215, 104, 14);
		panelMonitor.add(lblThb_14);

		JButton btnBuy_6 = new JButton("Buy");
		btnBuy_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Monitor monitor3 = new Monitor();
				String Inputqty  = JOptionPane.showInputDialog("Input qty");
			    int qty = Integer.parseInt(Inputqty);
			    double total = monitor3.getPriceMonitor3()*qty;
			    JOptionPane.showMessageDialog( null,"Price is   "+ monitor3.getPriceMonitor3()+"\nQty    is    "+qty+"\nTotal is    "+total+"THB"  , "Product", JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		btnBuy_6.setBounds(557, 248, 89, 23);
		panelMonitor.add(btnBuy_6);

		JButton button_39 = new JButton("Detail");
		button_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name : Lg\nRefresh rate 144Hz\nPrice : 2500 THB", "Detail",
						JOptionPane.PLAIN_MESSAGE);
			}
		});
		button_39.setBounds(656, 248, 89, 23);
		panelMonitor.add(button_39);

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 0), null));
		panel_8.setBounds(12, 13, 949, 81);
		panel_8.setBackground(new Color(0, 102, 204));
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(null);

		JLabel lblNewLabel = new JLabel("MY COMPUTER");
		lblNewLabel.setForeground(new Color(204, 204, 204));
		lblNewLabel.setBounds(312, 11, 361, 62);
		lblNewLabel.setFont(new Font("Impact", Font.BOLD, 50));
		panel_8.add(lblNewLabel);
		
			
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
