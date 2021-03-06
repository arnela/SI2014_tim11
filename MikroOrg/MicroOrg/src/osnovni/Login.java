package osnovni;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

import java.awt.Canvas;

import javax.swing.ImageIcon;

import SefGui.Pocetni;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login novi = new Login();
					novi.setVisible(true); //za svaki slucaj ako bude pozvan iz neke druge forme...
					novi.setResizable(false);
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
		setTitle("MicroOrg");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 320);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(204, 186, 86, 20);
		contentPane.add(textField);
		
		JLabel label = new JLabel("Korisni\u010Dko ime:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(29, 189, 158, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0160ifra:");
		label_1.setBounds(161, 220, 33, 14);
		contentPane.add(label_1);
		
		JButton button = new JButton("Prijavi se!");
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		//	JOptionPane.showMessageDialog(null, textField.getText()," ", JOptionPane.INFORMATION_MESSAGE); //ovo je message box za provjeru
		//	JOptionPane.showMessageDialog(null, textField_1.getText()," ", JOptionPane.INFORMATION_MESSAGE); //ovo je message box za provjeru
				String a="�ef";
				if(textField.getText().equals(a) && passwordField.getText().equals(a)) //ispituje polja za unos usernamea i �ifre
					{
					SefGui.Pocetni n =new SefGui.Pocetni();  //kreira novi po�etni gui za �efa
					n.setLocationRelativeTo(null);   // postavlja ga na sredinu
					n.setVisible(true);  // upali vidljivost
					n.setResizable(false);
					Login.this.dispose(); //zatvara ovu login formu
					}
				String b="sluzbenik";
				if(textField.getText().equals(b) && passwordField.getText().equals(b)) //ispituje polja za unos usernamea i �ifre
					{
					SluzbenikGui.Pocetni n =new SluzbenikGui.Pocetni();  //kreira novi po�etni gui za �efa
					n.setLocationRelativeTo(null);   // postavlja ga na sredinu
					n.setVisible(true);  // upali vidljivost
					n.setResizable(false);
					Login.this.dispose(); //zatvara ovu login formu
					}
			}
			
		});
		button.setBounds(204, 248, 89, 23);
		contentPane.add(button);
		
		JLabel label_2 = new JLabel("");
		//label_2.setIcon(new ImageIcon("slike\\logo.jpg"));
		ImageIcon _imageIcon= new ImageIcon(getClass().getResource("/resources/logo.jpg"));
		label_2.setIcon(_imageIcon);
		
		label_2.setBounds(93, 37, 200, 114);
		contentPane.add(label_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(204, 217, 86, 20);
		contentPane.add(passwordField);
		
		
	}
}

