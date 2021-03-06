package SefGui;

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
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollBar;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ponude extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ponude frame = new Ponude();
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
	public Ponude() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				SefGui.Pocetni n =new SefGui.Pocetni();  //kreira novi po�etni gui za �efa
				n.setLocationRelativeTo(null);   // postavlja ga na sredinu
				n.setVisible(true);  // upali vidljivost
				n.setResizable(false);
			}
		});
		setTitle("MicroOrg - Ponude");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 602, 468);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 586, 430);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		tabbedPane.addTab("Prikaz i pretraga", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(165, 42, 42), 1, true));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(23, 11, 416, 32);
		panel.add(panel_1);
		
		JLabel label = new JLabel("Unesi podatke:");
		label.setBounds(6, 9, 95, 14);
		panel_1.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(98, 6, 293, 20);
		panel_1.add(textField);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(174, 16, 0, 0);
		panel_1.add(label_1);
		
		JButton button = new JButton("Pretra\u017Ei po:");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano !");
			}
		});
		button.setBounds(449, 11, 121, 23);
		panel.add(button);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(449, 64, 121, 61);
		panel.add(panel_2);
		
		JRadioButton radioButton = new JRadioButton("Ime klijenta");
		radioButton.setBounds(6, 7, 109, 23);
		panel_2.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Datum upisa");
		radioButton_1.setBounds(6, 33, 109, 23);
		panel_2.add(radioButton_1);
		
		JButton btnNazad = new JButton("Nazad");
		btnNazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SefGui.Ponude.this.dispose();
			}
		});
		btnNazad.setBounds(478, 373, 93, 23);
		panel.add(btnNazad);
		
		JButton button_2 = new JButton("PDF prikaz");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano !");
			}
		});
		button_2.setBounds(23, 373, 171, 23);
		panel.add(button_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(128, 0, 0), 1, true));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(23, 64, 416, 298);
		panel.add(panel_3);
		
		JScrollBar scrollBar = new JScrollBar();
		
		JButton button_3 = new JButton("Pretrazi po:");
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		
		JRadioButton radioButton_2 = new JRadioButton("Ime i Prezime");
		radioButton_2.setBounds(6, 7, 109, 23);
		panel_4.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("Kredit");
		radioButton_3.setBounds(6, 33, 109, 23);
		panel_4.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("Uposlenik");
		radioButton_4.setBounds(6, 59, 109, 23);
		panel_4.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("ID");
		radioButton_5.setBounds(6, 85, 109, 23);
		panel_4.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("Datum upisa");
		radioButton_6.setBounds(6, 111, 109, 23);
		panel_4.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("E-mail");
		radioButton_7.setBounds(6, 137, 109, 23);
		panel_4.add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("Adresa");
		radioButton_8.setBounds(6, 163, 109, 23);
		panel_4.add(radioButton_8);
		
		JButton button_4 = new JButton("Pretrazi po:");
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		
		JRadioButton radioButton_9 = new JRadioButton("Ime i Prezime");
		radioButton_9.setBounds(6, 7, 109, 23);
		panel_5.add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("Kredit");
		radioButton_10.setBounds(6, 33, 109, 23);
		panel_5.add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("Uposlenik");
		radioButton_11.setBounds(6, 59, 109, 23);
		panel_5.add(radioButton_11);
		
		JRadioButton radioButton_12 = new JRadioButton("ID");
		radioButton_12.setBounds(6, 85, 109, 23);
		panel_5.add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("Datum upisa");
		radioButton_13.setBounds(6, 111, 109, 23);
		panel_5.add(radioButton_13);
		
		JRadioButton radioButton_14 = new JRadioButton("E-mail");
		radioButton_14.setBounds(6, 137, 109, 23);
		panel_5.add(radioButton_14);
		
		JRadioButton radioButton_15 = new JRadioButton("Adresa");
		radioButton_15.setBounds(6, 163, 109, 23);
		panel_5.add(radioButton_15);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 404, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap(709, Short.MAX_VALUE)
					.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(472)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 283, Short.MAX_VALUE)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(button_4)
							.addGap(20)
							.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(button_3)
							.addGap(20)
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
	}

}
