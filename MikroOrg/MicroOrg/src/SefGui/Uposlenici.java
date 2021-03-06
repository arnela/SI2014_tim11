package SefGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Uposlenici extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uposlenici frame = new Uposlenici();
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
	public Uposlenici() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				SefGui.Pocetni n =new SefGui.Pocetni();  //kreira novi po�etni gui za �efa
				n.setLocationRelativeTo(null);   // postavlja ga na sredinu
				n.setVisible(true);  // upali vidljivost
				n.setResizable(false);
			}
		});
		setTitle("MicroOrg - Uposlenici");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 427);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 534, 386);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		tabbedPane.addTab("Zapo\u0161ljavanje", null, panel, null);
		
		JButton btnNazad = new JButton("Nazad");
		btnNazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SefGui.Uposlenici.this.dispose();
			}
		});
		btnNazad.setBounds(421, 324, 98, 23);
		panel.add(btnNazad);
		
		JButton button_1 = new JButton("Unesi zaposlenika");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano !");
			}
		});
		button_1.setBounds(10, 324, 142, 23);
		panel.add(button_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(165, 42, 42), 1, true));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 11, 509, 302);
		panel.add(panel_1);
		
		JLabel label = new JLabel("Adresa:");
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setBounds(272, 160, 62, 14);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("Telefon:");
		label_1.setHorizontalAlignment(SwingConstants.TRAILING);
		label_1.setBounds(280, 204, 54, 14);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("Email:");
		label_2.setHorizontalAlignment(SwingConstants.TRAILING);
		label_2.setBounds(19, 160, 70, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("JMBG:");
		label_3.setHorizontalAlignment(SwingConstants.TRAILING);
		label_3.setBounds(25, 251, 64, 14);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Datum ro\u0111enja:");
		label_4.setHorizontalAlignment(SwingConstants.TRAILING);
		label_4.setBounds(-13, 112, 102, 14);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("Ime:");
		label_5.setHorizontalAlignment(SwingConstants.TRAILING);
		label_5.setBounds(28, 62, 61, 14);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("Prezime:");
		label_6.setHorizontalAlignment(SwingConstants.TRAILING);
		label_6.setBounds(270, 62, 64, 14);
		panel_1.add(label_6);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(341, 154, 155, 20);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(92, 56, 155, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(341, 56, 155, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(92, 106, 155, 20);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(92, 245, 155, 20);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(92, 154, 155, 20);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(341, 198, 155, 20);
		panel_1.add(textField_6);
		
		JLabel label_7 = new JLabel("\u0160ifra:");
		label_7.setHorizontalAlignment(SwingConstants.TRAILING);
		label_7.setBounds(288, 246, 46, 19);
		panel_1.add(label_7);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(341, 244, 86, 22);
		panel_1.add(textField_7);
		
		JLabel label_8 = new JLabel("Plata:");
		label_8.setHorizontalAlignment(SwingConstants.TRAILING);
		label_8.setBounds(19, 204, 70, 14);
		panel_1.add(label_8);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(92, 198, 155, 20);
		panel_1.add(textField_8);
		
		JLabel label_9 = new JLabel("Mjesto ro\u0111enja:");
		label_9.setHorizontalAlignment(SwingConstants.TRAILING);
		label_9.setBounds(232, 112, 102, 14);
		panel_1.add(label_9);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(341, 106, 155, 20);
		panel_1.add(textField_9);
		
		JLabel lblPodaciONovom = new JLabel("Podaci o novom uposlenik-u:");
		lblPodaciONovom.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPodaciONovom.setBounds(162, 0, 208, 33);
		panel_1.add(lblPodaciONovom);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		tabbedPane.addTab("Pretraga i prikaz uposlenika", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 54, 503, 261);
		panel_2.add(panel_3);
		
		JButton button = new JButton("PDF prikaz");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano !");
			}
		});
		button.setBounds(10, 326, 101, 23);
		panel_2.add(button);
		
		JButton button_2 = new JButton("Promijeni informacije");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano !");
			}
		});
		button_2.setBounds(121, 326, 202, 23);
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("Izbri\u0161i ");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano !");
			}
		});
		button_3.setBounds(333, 326, 79, 23);
		panel_2.add(button_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(165, 42, 42), 1, true));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(10, 11, 380, 32);
		panel_2.add(panel_4);
		
		JLabel label_10 = new JLabel("Unesi ime i prezime:");
		label_10.setBounds(6, 9, 131, 14);
		panel_4.add(label_10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(125, 6, 245, 20);
		panel_4.add(textField_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setBounds(196, 16, 0, 0);
		panel_4.add(label_11);
		
		JButton button_4 = new JButton("Pretraga");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano !");
			}
		});
		button_4.setBounds(400, 11, 112, 32);
		panel_2.add(button_4);
		
		JButton button_5 = new JButton("Nazad");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SefGui.Uposlenici.this.dispose();
			}
		});
		button_5.setBounds(424, 326, 89, 23);
		panel_2.add(button_5);
	}

}
