package SefGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.acl.Owner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Klijenti extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Klijenti frame = new Klijenti();
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
	public Klijenti() {
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosed(WindowEvent e) {
				SefGui.Pocetni n =new SefGui.Pocetni();  //kreira novi po�etni gui za �efa
				n.setLocationRelativeTo(null);   // postavlja ga na sredinu
				n.setVisible(true);  // upali vidljivost
				n.setResizable(false);
			}
		});
		setTitle("MicroOrg - Klijenti");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 613, 418);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setBounds(0, 0, 592, 380);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		tabbedPane.addTab("Prikaz i pretraga klijenata", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 54, 435, 250);
		panel.add(panel_1);
		
		JButton button = new JButton("PDF prikaz");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano !");
			}
		});
		button.setBounds(10, 315, 112, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Po\u0161alji na E-mail");
		button_1.setEnabled(false);
		button_1.setBounds(132, 315, 150, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Izbri\u0161i ");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano !");
			}
		});
		button_2.setBounds(294, 315, 79, 23);
		panel.add(button_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(165, 42, 42), 1, true));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 11, 429, 32);
		panel.add(panel_2);
		
		JLabel label = new JLabel("Unesi podatke:");
		label.setBounds(6, 9, 95, 14);
		panel_2.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(98, 6, 321, 20);
		panel_2.add(textField);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(174, 16, 0, 0);
		panel_2.add(label_1);
		
		JButton btnPretraiPo = new JButton("Pretra\u017Ei po:");
		btnPretraiPo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano !");
			}
		});
		btnPretraiPo.setBounds(455, 11, 121, 23);
		panel.add(btnPretraiPo);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(455, 54, 121, 148);
		panel.add(panel_3);
		
		JRadioButton radioButton = new JRadioButton("Ime i Prezime");
		radioButton.setBounds(6, 7, 109, 23);
		panel_3.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Kredit");
		radioButton_1.setBounds(6, 33, 109, 23);
		panel_3.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Datum upisa");
		radioButton_2.setBounds(6, 59, 109, 23);
		panel_3.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("E-mail");
		radioButton_3.setBounds(6, 85, 109, 23);
		panel_3.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("Adresa");
		radioButton_4.setBounds(6, 111, 109, 23);
		panel_3.add(radioButton_4);
		
		JButton button_4 = new JButton("Nazad");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SefGui.Klijenti.this.dispose();
			}
		});
		button_4.setBounds(487, 315, 89, 23);
		panel.add(button_4);
	}

}
