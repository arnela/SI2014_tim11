package SluzbenikGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Transakcije extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transakcije frame = new Transakcije();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Transakcije() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				SluzbenikGui.Pocetni n =new SluzbenikGui.Pocetni();  //kreira novi po�etni gui za sluzbenika
				n.setLocationRelativeTo(null);   // postavlja ga na sredinu
				n.setVisible(true);  // upali vidljivost
				n.setResizable(false);
			}
		});
		setTitle("MicroOrg - Transakcije");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 625, 384);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 609, 342);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(165, 42, 42), 1, true));
		panel.setBackground(Color.WHITE);
		tabbedPane.addTab("Unos nove transakcije", null, panel, null);
		
		JLabel label = new JLabel("JMBG Klijenta:");
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setBounds(1, 98, 97, 14);
		panel.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(108, 95, 103, 20);
		panel.add(textField);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(174, 16, 0, 0);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Uposlenik:");
		label_2.setHorizontalAlignment(SwingConstants.TRAILING);
		label_2.setBounds(28, 16, 77, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Datum i vrijeme:");
		label_3.setHorizontalAlignment(SwingConstants.TRAILING);
		label_3.setBounds(-42, 41, 147, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("ID Transakcije:");
		label_4.setHorizontalAlignment(SwingConstants.TRAILING);
		label_4.setBounds(1, 65, 103, 14);
		panel.add(label_4);
		
		JButton button = new JButton("Provjeri");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano !");
			}
		});
		button.setBounds(234, 94, 89, 23);
		panel.add(button);
		
		JLabel label_5 = new JLabel("Kredit:");
		label_5.setHorizontalAlignment(SwingConstants.TRAILING);
		label_5.setBounds(1, 139, 97, 14);
		panel.add(label_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(108, 132, 164, 28);
		panel.add(comboBox);
		
		JLabel label_6 = new JLabel("Nov\u010Dani iznos:");
		label_6.setHorizontalAlignment(SwingConstants.TRAILING);
		label_6.setBounds(1, 186, 97, 14);
		panel.add(label_6);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(108, 183, 103, 20);
		panel.add(textField_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(128, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(83, 214, 435, 48);
		panel.add(panel_1);
		
		JRadioButton radioButton = new JRadioButton("uplatnica iz banke");
		radioButton.setBounds(260, 7, 153, 23);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("gotovina");
		radioButton_1.setBounds(6, 7, 153, 23);
		panel_1.add(radioButton_1);
		
		JButton button_1 = new JButton("PDF prikaz");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano !");
			}
		});
		button_1.setBounds(10, 280, 125, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Unesi transakciju");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano !");
			}
		});
		button_2.setBounds(145, 280, 147, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("Nazad");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SluzbenikGui.Transakcije.this.dispose();
			}
		});
		button_3.setBounds(505, 280, 89, 23);
		panel.add(button_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		tabbedPane.addTab("Pretraga transakcija", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 54, 385, 213);
		panel_2.add(panel_3);
		
		JButton button_4 = new JButton("PDF prikaz");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano !");
			}
		});
		button_4.setBounds(10, 278, 112, 23);
		panel_2.add(button_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(165, 42, 42), 1, true));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(10, 11, 385, 32);
		panel_2.add(panel_4);
		
		JLabel label_7 = new JLabel("Podaci za pretragu:");
		label_7.setBounds(6, 9, 119, 14);
		panel_4.add(label_7);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(135, 6, 246, 20);
		panel_4.add(textField_2);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(174, 16, 0, 0);
		panel_4.add(label_8);
		
		JButton button_5 = new JButton("Pretra\u017Ei po:");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano !");
			}
		});
		button_5.setBounds(405, 11, 121, 32);
		panel_2.add(button_5);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(405, 54, 189, 118);
		panel_2.add(panel_5);
		
		JRadioButton radioButton_2 = new JRadioButton("Datumu unosa");
		radioButton_2.setBounds(6, 7, 177, 23);
		panel_5.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("ID transakcije");
		radioButton_3.setBounds(6, 59, 143, 23);
		panel_5.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("Naziv tipa kredita");
		radioButton_4.setBounds(6, 85, 177, 23);
		panel_5.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("Klijent - Ime&Prezime");
		radioButton_5.setBounds(6, 33, 177, 23);
		panel_5.add(radioButton_5);
		
		JButton button_6 = new JButton("Nazad");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SluzbenikGui.Transakcije.this.dispose();
			}
		});
		button_6.setBounds(505, 278, 89, 23);
		panel_2.add(button_6);
		
		JButton button_7 = new JButton("Obri\u0161i");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano !");
			}
		});
		button_7.setBounds(283, 278, 112, 23);
		panel_2.add(button_7);
		
		JButton button_8 = new JButton("Po\u0161alji na E-mail");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano !");
			}
		});
		button_8.setBounds(132, 278, 135, 23);
		panel_2.add(button_8);
	}

}
