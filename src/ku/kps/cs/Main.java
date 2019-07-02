package ku.kps.cs;

import java.awt.Button;
import java.awt.EventQueue;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import ku.kps.cs.product.Case;
import ku.kps.cs.product.Cpu;
import ku.kps.cs.product.Hdd;
import ku.kps.cs.product.Mainboard;
import ku.kps.cs.product.Monitor;
import ku.kps.cs.product.Psu;
import ku.kps.cs.product.Ram;
import ku.kps.cs.product.Vga;

import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.TextArea;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import java.awt.Window.Type;

public class Main extends javax.swing.JFrame {

	private JFrame frame;
	private JTextField textPriceCpu;
	private JTextField textPriceMb;
	private JTextField textPriceRam;
	private JTextField textPriceVga;
	private JTextField textPriceHdd;
	private JTextField textPricePsu;
	private JTextField textPriceCase;
	private JTextField textPriceMonitor;
	private JTextField textQtyCpu;
	private JTextField textQtyMb;
	private JTextField textQtyRam;
	private JTextField textQtyVga;
	private JTextField textQtyHdd;
	private JTextField textQtyPsu;
	private JTextField textQtyCase;
	private JTextField textQtyMonitor;
	private JTextField textTotal;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initialize();

		textQtyCpu = new JTextField();
		textQtyCpu.setBounds(310, 165, 32, 20);
		textQtyCpu.setText("0");
		textQtyCpu.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(textQtyCpu);
		textQtyCpu.setColumns(10);

		textQtyMb = new JTextField();
		textQtyMb.setBounds(310, 200, 32, 20);
		textQtyMb.setText("0");
		textQtyMb.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(textQtyMb);
		textQtyMb.setColumns(10);

		textQtyRam = new JTextField();
		textQtyRam.setBounds(310, 241, 32, 20);
		textQtyRam.setText("0");
		textQtyRam.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(textQtyRam);
		textQtyRam.setColumns(10);

		textQtyVga = new JTextField();
		textQtyVga.setBounds(310, 282, 32, 20);
		textQtyVga.setText("0");
		textQtyVga.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(textQtyVga);
		textQtyVga.setColumns(10);

		textQtyHdd = new JTextField();
		textQtyHdd.setBounds(310, 324, 32, 20);
		textQtyHdd.setText("0");
		textQtyHdd.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(textQtyHdd);
		textQtyHdd.setColumns(10);

		textQtyPsu = new JTextField();
		textQtyPsu.setBounds(310, 369, 32, 20);
		textQtyPsu.setText("0");
		textQtyPsu.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(textQtyPsu);
		textQtyPsu.setColumns(10);

		textQtyCase = new JTextField();
		textQtyCase.setBounds(310, 422, 32, 20);
		textQtyCase.setText("0");
		textQtyCase.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(textQtyCase);
		textQtyCase.setColumns(10);

		textQtyMonitor = new JTextField();
		textQtyMonitor.setBounds(310, 474, 32, 20);
		textQtyMonitor.setText("0");
		textQtyMonitor.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(textQtyMonitor);
		textQtyMonitor.setColumns(10);

		textTotal = new JTextField();
		textTotal.setEditable(false);
		textTotal.setBounds(310, 525, 128, 20);
		textTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(textTotal);
		textTotal.setColumns(10);

		JLabel lblNewLabel = new JLabel("Product");
		lblNewLabel.setBounds(159, 130, 102, 33);
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 19));
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Qty");
		lblNewLabel_1.setBounds(310, 131, 32, 31);
		lblNewLabel_1.setFont(new Font("Impact", Font.PLAIN, 19));
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Price");
		lblNewLabel_2.setBounds(391, 131, 71, 31);
		lblNewLabel_2.setFont(new Font("Impact", Font.PLAIN, 19));
		frame.getContentPane().add(lblNewLabel_2);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 204));
		panel.setBounds(0, 11, 937, 89);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("MY COMPUTER");
		lblNewLabel_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_3.setFont(new Font("Impact", Font.BOLD, 50));
		lblNewLabel_3.setBounds(315, 13, 392, 71);
		panel.add(lblNewLabel_3);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 250, 205));
		panel_1.setBounds(10, 128, 494, 466);
		frame.getContentPane().add(panel_1);

	}

	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.POPUP);
		frame.getContentPane().setBackground(new Color(153, 204, 255));
		frame.setBounds(100, 100, 941, 701);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblCpu = new JLabel("CPU");
		lblCpu.setBounds(44, 168, 46, 14);
		lblCpu.setFont(new Font("Impact", Font.PLAIN, 15));
		frame.getContentPane().add(lblCpu);

		JLabel lblMB = new JLabel("Mainboard");
		lblMB.setBounds(44, 203, 93, 14);
		lblMB.setFont(new Font("Impact", Font.PLAIN, 15));
		frame.getContentPane().add(lblMB);

		JLabel lblRam = new JLabel("Ram");
		lblRam.setBounds(44, 244, 46, 14);
		lblRam.setFont(new Font("Impact", Font.PLAIN, 15));
		frame.getContentPane().add(lblRam);

		JLabel lblVGA = new JLabel("VGA");
		lblVGA.setBounds(44, 285, 46, 14);
		lblVGA.setFont(new Font("Impact", Font.PLAIN, 15));
		frame.getContentPane().add(lblVGA);

		JLabel lblHdd = new JLabel("HDD/SSD");
		lblHdd.setBounds(44, 327, 93, 14);
		lblHdd.setFont(new Font("Impact", Font.PLAIN, 15));
		frame.getContentPane().add(lblHdd);

		JLabel lblPSU = new JLabel("PSU");
		lblPSU.setBounds(44, 372, 46, 14);
		lblPSU.setFont(new Font("Impact", Font.PLAIN, 15));
		frame.getContentPane().add(lblPSU);

		JLabel lblMonitor = new JLabel("Monitor");
		lblMonitor.setBounds(44, 477, 77, 14);
		lblMonitor.setFont(new Font("Impact", Font.PLAIN, 15));
		frame.getContentPane().add(lblMonitor);

		JLabel lblCase = new JLabel("Case");
		lblCase.setBounds(44, 425, 46, 14);
		lblCase.setFont(new Font("Impact", Font.PLAIN, 15));
		frame.getContentPane().add(lblCase);

		JComboBox cbCpu = new JComboBox();
		cbCpu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				

				if (cbCpu.getSelectedItem().equals("INTEL CORE i3  3.6 Ghz")
						|| cbCpu.getSelectedItem().equals("INTEL CORE i5  4.0 Ghz")
						|| cbCpu.getSelectedItem().equals("INTEL CORE i7  4.6 Ghz")
						|| cbCpu.getSelectedItem().equals("INTEL CORE i9  5.0 Ghz")) {

					textQtyCpu.setText("1");
				} else if (cbCpu.getSelectedItem().equals("Choose Cpu")) {
					textQtyCpu.setText("0");
				}
				
				
			}
		});
		cbCpu.setBounds(131, 168, 149, 20);
		cbCpu.setModel(new DefaultComboBoxModel(new String[] { "Choose Cpu", "INTEL CORE i3  3.6 Ghz",
				"INTEL CORE i5  4.0 Ghz", "INTEL CORE i7  4.6 Ghz", "INTEL CORE i9  5.0 Ghz" }));
		frame.getContentPane().add(cbCpu);

		JComboBox cbMb = new JComboBox();
		cbMb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbMb.getSelectedItem().equals("Asus Z370") || cbMb.getSelectedItem().equals("Gigabyte Z370")
						|| cbMb.getSelectedItem().equals("Msi Z370") || cbMb.getSelectedItem().equals("Asrock Z370")) {

					textQtyMb.setText("1");
				} else if (cbMb.getSelectedItem().equals("Choose Mainboard")) {
					textQtyMb.setText("0");
				}

			}
		});
		cbMb.setBounds(131, 203, 149, 20);
		cbMb.setModel(new DefaultComboBoxModel(
				new String[] { "Choose Mainboard", "Asus Z370", "Gigabyte Z370", "Msi Z370", "Asrock Z370" }));
		frame.getContentPane().add(cbMb);

		JComboBox cbRam = new JComboBox();
		cbRam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cbRam.getSelectedItem().equals("DDR4/2400 16GB") || cbRam.getSelectedItem().equals("DDR4/3000 16GB")
						|| cbRam.getSelectedItem().equals("DDR4/3200 16GB")
						|| cbRam.getSelectedItem().equals("DDR4/3600 16GB")) {
					textQtyRam.setText("1");
				} else if (cbRam.getSelectedItem().equals("Choose Ram")) {
					textQtyRam.setText("0");
				}
			}
		});
		cbRam.setBounds(131, 244, 149, 20);
		cbRam.setModel(new DefaultComboBoxModel(
				new String[] { "Choose Ram", "DDR4/2400 16GB", "DDR4/3000 16GB", "DDR4/3200 16GB", "DDR4/3600 16GB" }));
		frame.getContentPane().add(cbRam);

		JComboBox cbVga = new JComboBox();
		cbVga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbVga.getSelectedItem().equals("RTX2080TI") || cbVga.getSelectedItem().equals("RTX2080")
						|| cbVga.getSelectedItem().equals("RTX2070") || cbVga.getSelectedItem().equals("GTX1080TI")) {
					textQtyVga.setText("1");
				} else if (cbVga.getSelectedItem().equals("Choose Vga Card")) {
					textQtyVga.setText("0");
				}
			}
		});
		cbVga.setBounds(131, 285, 149, 20);
		cbVga.setModel(new DefaultComboBoxModel(
				new String[] { "Choose Vga Card", "RTX2080TI", "RTX2080", "RTX2070", "GTX1080TI" }));
		frame.getContentPane().add(cbVga);

		JComboBox cbHdd = new JComboBox();
		cbHdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbHdd.getSelectedItem().equals("HDD WD Black 1TB")
						|| cbHdd.getSelectedItem().equals("HDD WD Black 2TB")
						|| cbHdd.getSelectedItem().equals("1TB SSD SAMSUNG 970EVO")
						|| cbHdd.getSelectedItem().equals("2TB SSD SAMSUNG 970EVO")) {
					textQtyHdd.setText("1");
				} else if (cbHdd.getSelectedItem().equals("Choose Hdd/Ssd")) {
					textQtyHdd.setText("0");
				}
			}

		});
		cbHdd.setBounds(131, 327, 149, 20);
		cbHdd.setModel(new DefaultComboBoxModel(new String[] { "Choose Hdd/Ssd", "HDD WD Black 1TB", "HDD WD Black 2TB",
				"1TB SSD SAMSUNG 970EVO", "2TB SSD SAMSUNG 970EVO" }));
		frame.getContentPane().add(cbHdd);

		JComboBox cbPsu = new JComboBox();
		cbPsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbPsu.getSelectedItem().equals("CM 500 Watt") || cbPsu.getSelectedItem().equals("CM 600 Watt")
						|| cbPsu.getSelectedItem().equals("CM 700 Watt")
						|| cbPsu.getSelectedItem().equals("CM 1000 Watt")) {
					textQtyPsu.setText("1");
				} else if (cbPsu.getSelectedItem().equals("Choose Psu")) {
					textQtyPsu.setText("0");
				}
			}
		});
		cbPsu.setBounds(131, 372, 149, 20);
		cbPsu.setModel(new DefaultComboBoxModel(
				new String[] { "Choose Psu", "CM 500 Watt", "CM 600 Watt", "CM 700 Watt", "CM 1000 Watt" }));
		frame.getContentPane().add(cbPsu);

		JComboBox cbCase = new JComboBox();
		cbCase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbCase.getSelectedItem().equals("Thermaltake core P3")
						|| cbCase.getSelectedItem().equals("Thermaltake core P5")
						|| cbCase.getSelectedItem().equals("Thermaltake view21")
						|| cbCase.getSelectedItem().equals("Thermaltake view22")) {
					textQtyCase.setText("1");
				} else if (cbCase.getSelectedItem().equals("Choose Case")) {
					textQtyCase.setText("0");
				}
			}
		});
		cbCase.setBounds(131, 425, 149, 20);
		cbCase.setModel(new DefaultComboBoxModel(new String[] { "Choose Case", "Thermaltake core P3",
				"Thermaltake core P5", "Thermaltake view21", "Thermaltake view22" }));
		frame.getContentPane().add(cbCase);

		JComboBox cbMonitor = new JComboBox();
		cbMonitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbMonitor.getSelectedItem().equals("Asus 144Hz") || cbMonitor.getSelectedItem().equals("Dell 144Hz")
						|| cbMonitor.getSelectedItem().equals("LG 144Hz")
						|| cbMonitor.getSelectedItem().equals("Zowie 144Hz")) {
					textQtyMonitor.setText("1");
				} else if (cbMonitor.getSelectedItem().equals("Choose Monitor")) {
					textQtyMonitor.setText("0");
				}
			}
		});
		cbMonitor.setBounds(131, 477, 149, 20);
		cbMonitor.setModel(new DefaultComboBoxModel(
				new String[] { "Choose Monitor", "Asus 144Hz", "Dell 144Hz", "LG 144Hz", "Zowie 144Hz" }));
		frame.getContentPane().add(cbMonitor);

		textPriceCpu = new JTextField();
		textPriceCpu.setBounds(352, 165, 86, 20);
		textPriceCpu.setHorizontalAlignment(SwingConstants.RIGHT);
		textPriceCpu.setEditable(false);
		frame.getContentPane().add(textPriceCpu);
		textPriceCpu.setColumns(10);
		textPriceCpu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionPerformed(evt);
			}
		});

		textPriceMb = new JTextField();
		textPriceMb.setBounds(352, 200, 86, 20);
		textPriceMb.setHorizontalAlignment(SwingConstants.RIGHT);
		textPriceMb.setEditable(false);
		frame.getContentPane().add(textPriceMb);
		textPriceMb.setColumns(10);
		textPriceMb.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				actionPerformed(evt);
			}
		});

		textPriceRam = new JTextField();
		textPriceRam.setBounds(352, 241, 86, 20);
		textPriceRam.setHorizontalAlignment(SwingConstants.RIGHT);
		textPriceRam.setEditable(false);
		frame.getContentPane().add(textPriceRam);
		textPriceRam.setColumns(10);

		textPriceVga = new JTextField();
		textPriceVga.setBounds(352, 282, 86, 20);
		textPriceVga.setHorizontalAlignment(SwingConstants.RIGHT);
		textPriceVga.setEditable(false);
		frame.getContentPane().add(textPriceVga);
		textPriceVga.setColumns(10);

		textPriceHdd = new JTextField();
		textPriceHdd.setBounds(352, 324, 86, 20);
		textPriceHdd.setHorizontalAlignment(SwingConstants.RIGHT);
		textPriceHdd.setEditable(false);
		frame.getContentPane().add(textPriceHdd);
		textPriceHdd.setColumns(10);

		textPricePsu = new JTextField();
		textPricePsu.setBounds(352, 369, 86, 20);
		textPricePsu.setHorizontalAlignment(SwingConstants.RIGHT);
		textPricePsu.setEditable(false);
		frame.getContentPane().add(textPricePsu);
		textPricePsu.setColumns(10);

		textPriceCase = new JTextField();
		textPriceCase.setBounds(352, 422, 86, 20);
		textPriceCase.setHorizontalAlignment(SwingConstants.RIGHT);
		textPriceCase.setEditable(false);
		frame.getContentPane().add(textPriceCase);
		textPriceCase.setColumns(10);

		textPriceMonitor = new JTextField();
		textPriceMonitor.setBounds(352, 474, 86, 20);
		textPriceMonitor.setHorizontalAlignment(SwingConstants.RIGHT);
		textPriceMonitor.setEditable(false);
		frame.getContentPane().add(textPriceMonitor);
		textPriceMonitor.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(535, 126, 376, 466);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JTextArea textBill = new JTextArea();
		textBill.setFont(new Font("Arial Narrow", Font.PLAIN, 15));
		textBill.setBounds(10, 11, 354, 444);
		panel.add(textBill);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textBill.setText(null);
			}
		});
		btnClear.setBounds(814, 604, 97, 23);
		frame.getContentPane().add(btnClear);

		JButton btnBuild = new JButton("Build");
		btnBuild.setBounds(131, 524, 70, 23);
		btnBuild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// ComboBoxCPU
				if (cbCpu.getSelectedItem().equals("Choose Cpu")) {

					Double noCpu = 0 * Double.parseDouble(textQtyCpu.getText());
					textPriceCpu.setText("" + noCpu);
				}
				if (cbCpu.getSelectedItem().equals("INTEL CORE i3  3.6 Ghz")) {

					Cpu cpu1 = new Cpu();
					Double i3 = cpu1.getPriceCpu1() * Double.parseDouble(textQtyCpu.getText());
					textPriceCpu.setText("" + i3);
				}
				if (cbCpu.getSelectedItem().equals("INTEL CORE i5  4.0 Ghz")) {

					Cpu cpu2 = new Cpu();
					Double i5 = cpu2.getPriceCpu2() * Double.parseDouble(textQtyCpu.getText());
					textPriceCpu.setText("" + i5);
				}
				if (cbCpu.getSelectedItem().equals("INTEL CORE i7  4.6 Ghz")) {

					Cpu cpu3 = new Cpu();
					Double i7 = cpu3.getPriceCpu3() * Double.parseDouble(textQtyCpu.getText());
					textPriceCpu.setText("" + i7);
				}
				if (cbCpu.getSelectedItem().equals("INTEL CORE i9  5.0 Ghz")) {

					Cpu cpu4 = new Cpu();
					Double i9 = cpu4.getPriceCpu4() * Double.parseDouble(textQtyCpu.getText());
					textPriceCpu.setText("" + i9);
				}

				// ComboBoxMB
				if (cbMb.getSelectedItem().equals("Choose Mainboard")) {

					Double noMb = 0 * Double.parseDouble(textQtyMb.getText());
					textPriceMb.setText("" + noMb);
				}
				if (cbMb.getSelectedItem().equals("Asus Z370")) {
					;
					Mainboard MB1 = new Mainboard();
					Double mb1 = MB1.getPriceMb1() * Double.parseDouble(textQtyMb.getText());
					textPriceMb.setText("" + mb1);
				}
				if (cbMb.getSelectedItem().equals("Gigabyte Z370")) {

					Mainboard MB2 = new Mainboard();
					Double mb2 = MB2.getPriceMb2() * Double.parseDouble(textQtyMb.getText());
					textPriceMb.setText("" + mb2);
				}
				if (cbMb.getSelectedItem().equals("Msi Z370")) {

					Mainboard MB3 = new Mainboard();
					Double mb3 = MB3.getPriceMb3() * Double.parseDouble(textQtyMb.getText());
					textPriceMb.setText("" + mb3);
				}
				if (cbMb.getSelectedItem().equals("Asrock Z370")) {

					Mainboard MB4 = new Mainboard();
					Double mb4 = MB4.getPriceMb4() * Double.parseDouble(textQtyMb.getText());
					textPriceMb.setText("" + mb4);
				}
				// ComboBoxRam
				if (cbRam.getSelectedItem().equals("Choose Ram")) {

					Double noRam = 0 * Double.parseDouble(textQtyRam.getText());
					textPriceRam.setText("" + noRam);
				}
				if (cbRam.getSelectedItem().equals("DDR4/2400 16GB")) {

					Ram RAM1 = new Ram();
					Double ram1 = RAM1.getPriceRam1() * Double.parseDouble(textQtyRam.getText());
					textPriceRam.setText("" + ram1);
				}
				if (cbRam.getSelectedItem().equals("DDR4/3000 16GB")) {

					Ram RAM2 = new Ram();
					Double ram2 = RAM2.getPriceRam1() * Double.parseDouble(textQtyRam.getText());
					textPriceRam.setText("" + ram2);
				}
				if (cbRam.getSelectedItem().equals("DDR4/3200 16GB")) {

					Ram RAM3 = new Ram();
					Double ram3 = RAM3.getPriceRam1() * Double.parseDouble(textQtyRam.getText());
					textPriceRam.setText("" + ram3);
				}
				if (cbRam.getSelectedItem().equals("DDR4/3600 16GB")) {

					Ram RAM4 = new Ram();
					Double ram4 = RAM4.getPriceRam1() * Double.parseDouble(textQtyRam.getText());
					textPriceRam.setText("" + ram4);
				}
				// ComboBoxVga

				if (cbVga.getSelectedItem().equals("Choose Vga Card")) {

					Double noVga = 0 * Double.parseDouble(textQtyVga.getText());
					textPriceVga.setText("" + noVga);
				}
				if (cbVga.getSelectedItem().equals("RTX2080TI")) {

					Vga VGA1 = new Vga();
					Double vga1 = VGA1.getPriceVga1() * Double.parseDouble(textQtyVga.getText());
					textPriceVga.setText("" + vga1);
				}
				if (cbVga.getSelectedItem().equals("RTX2080")) {

					Vga VGA2 = new Vga();
					Double vga2 = VGA2.getPriceVga2() * Double.parseDouble(textQtyVga.getText());
					textPriceVga.setText("" + vga2);
				}
				if (cbVga.getSelectedItem().equals("RTX2070")) {

					Vga VGA3 = new Vga();
					Double vga3 = VGA3.getPriceVga3() * Double.parseDouble(textQtyVga.getText());
					textPriceVga.setText("" + vga3);
				}
				if (cbVga.getSelectedItem().equals("GTX1080TI")) {

					Vga VGA4 = new Vga();
					Double vga4 = VGA4.getPriceVga4() * Double.parseDouble(textQtyVga.getText());
					textPriceVga.setText("" + vga4);
				}
				// ComboBoxHdd
				if (cbHdd.getSelectedItem().equals("Choose Hdd/Ssd")) {

					Double noHdd = 0 * Double.parseDouble(textQtyHdd.getText());
					textPriceHdd.setText("" + noHdd);
				}
				if (cbHdd.getSelectedItem().equals("HDD WD Black 1TB")) {

					Hdd HDD1 = new Hdd();
					Double hdd1 = HDD1.getPriceHdd1() * Double.parseDouble(textQtyHdd.getText());
					textPriceHdd.setText("" + hdd1);
				}
				if (cbHdd.getSelectedItem().equals("HDD WD Black 2TB")) {

					Hdd HDD2 = new Hdd();
					Double hdd2 = HDD2.getPriceHdd2() * Double.parseDouble(textQtyHdd.getText());
					textPriceHdd.setText("" + hdd2);
				}
				if (cbHdd.getSelectedItem().equals("1TB SSD SAMSUNG 970EVO")) {

					Hdd HDD3 = new Hdd();
					Double hdd3 = HDD3.getPriceHdd3() * Double.parseDouble(textQtyHdd.getText());
					textPriceHdd.setText("" + hdd3);
				}
				if (cbHdd.getSelectedItem().equals("2TB SSD SAMSUNG 970EVO")) {

					Hdd HDD4 = new Hdd();
					Double hdd4 = HDD4.getPriceHdd4() * Double.parseDouble(textQtyHdd.getText());
					textPriceHdd.setText("" + hdd4);
				}
				// ComboBoxPsu
				if (cbPsu.getSelectedItem().equals("Choose Psu")) {

					Double noPsu = 0 * Double.parseDouble(textQtyPsu.getText());
					textPricePsu.setText("" + noPsu);
				}

				if (cbPsu.getSelectedItem().equals("CM 500 Watt")) {

					Psu PSU1 = new Psu();
					Double psu1 = PSU1.getPricePsu1() * Double.parseDouble(textQtyPsu.getText());
					textPricePsu.setText("" + psu1);
				}
				if (cbPsu.getSelectedItem().equals("CM 600 Watt")) {

					Psu PSU2 = new Psu();
					Double psu2 = PSU2.getPricePsu2() * Double.parseDouble(textQtyPsu.getText());
					textPricePsu.setText("" + psu2);
				}
				if (cbPsu.getSelectedItem().equals("CM 700 Watt")) {

					Psu PSU3 = new Psu();
					Double psu3 = PSU3.getPricePsu3() * Double.parseDouble(textQtyPsu.getText());
					textPricePsu.setText("" + psu3);
				}
				if (cbPsu.getSelectedItem().equals("CM 1000 Watt")) {

					Psu PSU4 = new Psu();
					Double psu4 = PSU4.getPricePsu4() * Double.parseDouble(textQtyPsu.getText());
					textPricePsu.setText("" + psu4);
				}
				// ComboBoxCase
				if (cbCase.getSelectedItem().equals("Choose Case")) {

					Double noCase = 0 * Double.parseDouble(textQtyCase.getText());
					textPriceCase.setText("" + noCase);
				}
				if (cbCase.getSelectedItem().equals("Thermaltake core P3")) {

					Case CASE1 = new Case();
					Double case1 = CASE1.getPriceCase1() * Double.parseDouble(textQtyCase.getText());
					textPriceCase.setText("" + case1);
				}
				if (cbCase.getSelectedItem().equals("Thermaltake core P5")) {

					Case CASE2 = new Case();
					Double case2 = CASE2.getPriceCase2() * Double.parseDouble(textQtyCase.getText());
					textPriceCase.setText("" + case2);
				}
				if (cbCase.getSelectedItem().equals("Thermaltake view21")) {

					Case CASE3 = new Case();
					Double case3 = CASE3.getPriceCase3() * Double.parseDouble(textQtyCase.getText());
					textPriceCase.setText("" + case3);
				}
				if (cbCase.getSelectedItem().equals("Thermaltake view22")) {

					Case CASE4 = new Case();
					Double case4 = CASE4.getPriceCase4() * Double.parseDouble(textQtyCase.getText());
					textPriceCase.setText("" + case4);
				}
				// ComboBoxMonitor
				if (cbMonitor.getSelectedItem().equals("Choose Monitor")) {

					Double noMonitor = 0 * Double.parseDouble(textQtyMonitor.getText());
					textPriceMonitor.setText("" + noMonitor);
				}

				if (cbMonitor.getSelectedItem().equals("Asus 144Hz")) {

					Monitor MONITOR1 = new Monitor();
					Double monitor1 = MONITOR1.getPriceMonitor1() * Double.parseDouble(textQtyMonitor.getText());
					textPriceMonitor.setText("" + monitor1);
				}
				if (cbMonitor.getSelectedItem().equals("Dell 144Hz")) {

					Monitor MONITOR2 = new Monitor();
					Double monitor2 = MONITOR2.getPriceMonitor2() * Double.parseDouble(textQtyMonitor.getText());
					textPriceMonitor.setText("" + monitor2);
				}
				if (cbMonitor.getSelectedItem().equals("LG 144Hz")) {

					Monitor MONITOR3 = new Monitor();
					Double monitor3 = MONITOR3.getPriceMonitor3() * Double.parseDouble(textQtyMonitor.getText());
					textPriceMonitor.setText("" + monitor3);
				}

				if (cbMonitor.getSelectedItem().equals("Zowie 144Hz")) {
					Monitor MONITOR4 = new Monitor();
					Double monitor4 = MONITOR4.getPriceMonitor4() * Double.parseDouble(textQtyMonitor.getText());
					textPriceMonitor.setText("" + monitor4);
				}

				double total = Double.parseDouble(textPriceCpu.getText()) + Double.parseDouble(textPriceMb.getText())
						+ Double.parseDouble(textPriceRam.getText()) + Double.parseDouble(textPriceVga.getText())
						+ Double.parseDouble(textPriceHdd.getText()) + Double.parseDouble(textPricePsu.getText())
						+ Double.parseDouble(textPriceCase.getText()) + Double.parseDouble(textPriceMonitor.getText());
				textTotal.setText("" + total + "  THB");

			}
		});
		frame.getContentPane().add(btnBuild);

		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(209, 524, 71, 23);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbCpu.setSelectedItem("Choose Cpu");
				cbMb.setSelectedItem("Choose Mainboard");
				cbRam.setSelectedItem("Choose Ram");
				cbVga.setSelectedItem("Choose Vga Card");
				cbHdd.setSelectedItem("Choose Hdd/Ssd");
				cbPsu.setSelectedItem("Choose Psu");
				cbMonitor.setSelectedItem("Choose Monitor");
				cbCase.setSelectedItem("Choose Case");
				textQtyCpu.setText("0");
				textQtyMb.setText("0");
				textQtyRam.setText("0");
				textQtyVga.setText("0");
				textQtyHdd.setText("0");
				textQtyCase.setText("0");
				textQtyPsu.setText("0");
				textQtyMonitor.setText("0");
				textPriceCpu.setText(null);
				textPriceMb.setText(null);
				textPriceRam.setText(null);
				textPriceVga.setText(null);
				textPriceHdd.setText(null);
				textPriceCase.setText(null);
				textPricePsu.setText(null);
				textPriceMonitor.setText(null);
				textTotal.setText(null);
			}
		});

		JButton btnBill = new JButton("Check Bill");
		btnBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Calendar timer = Calendar.getInstance();
				timer.getTime();

				SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
				String TIME = String.format(time.format(timer.getTime()));

				SimpleDateFormat date = new SimpleDateFormat("dd/M/yyyy");
				String DATE = String.format(date.format(timer.getTime()));

				String cpu = String.format(cbCpu.getSelectedItem().toString());
				String mb = String.format(cbMb.getSelectedItem().toString());
				String ram = String.format(cbRam.getSelectedItem().toString());
				String vga = String.format(cbVga.getSelectedItem().toString());
				String hdd = String.format(cbHdd.getSelectedItem().toString());
				String psu = String.format(cbPsu.getSelectedItem().toString());
				String Case = String.format(cbCase.getSelectedItem().toString());
				String monitor = String.format(cbMonitor.getSelectedItem().toString());

				String qtycpu = String.format(textQtyCpu.getText());
				String qtymb = String.format(textQtyMb.getText());
				String qtyram = String.format(textQtyRam.getText());
				String qtyvga = String.format(textQtyVga.getText());
				String qtyhdd = String.format(textQtyHdd.getText());
				String qtypsu = String.format(textQtyPsu.getText());
				String qtyCase = String.format(textQtyCase.getText());
				String qtymonitor = String.format(textQtyMonitor.getText());
				String total = String.format(textTotal.getText());

				String pricecpu = String.format(textPriceCpu.getText());
				String pricemb = String.format(textPriceMb.getText());
				String priceram = String.format(textPriceRam.getText());
				String pricevga = String.format(textPriceVga.getText());
				String pricehdd = String.format(textPriceHdd.getText());
				String pricepsu = String.format(textPricePsu.getText());
				String priceCase = String.format(textPriceCase.getText());
				String pricemonitor = String.format(textPriceMonitor.getText());

				textBill.append("\n\tMY COMPUTER\n====================================================\n"
						+ "Product\t\t" + "Qty\t" + "Price\t\n"
						+ "======================================================\n" + "" + cpu + "\t" + qtycpu + "\t"
						+ pricecpu + "\n" + "" + mb + "\t\t" + qtymb + "\t" + pricemb + "\n" + "" + ram + "\t" + qtyram
						+ "\t" + priceram + "\n" + "" + vga + "\t\t" + qtyvga + "\t" + pricevga + "\n" + "" + hdd + "\t"
						+ qtyhdd + "\t" + pricehdd + "\n" + "" + psu + "\t\t" + qtypsu + "\t" + pricepsu + "\n" + ""
						+ Case + "\t" + qtyCase + "\t" + priceCase + "\n" + "" + monitor + "\t\t" + qtymonitor + "\t"
						+ pricemonitor + "\n" + "=====================================================\n"
						+ "Total\t\t\t" + total + "\n=====================================================\n" + "Date\t"
						+ DATE + "\nTime\t" + TIME);

			}
		});
		btnBill.setBounds(705, 605, 97, 25);
		frame.getContentPane().add(btnBill);

		frame.getContentPane().add(btnReset);

	}
}
