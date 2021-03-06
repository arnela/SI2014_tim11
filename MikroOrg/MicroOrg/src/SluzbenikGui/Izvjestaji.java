package SluzbenikGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Izvjestaji extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Izvjestaji frame = new Izvjestaji();
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
	public Izvjestaji() {
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosed(WindowEvent e) {
				SluzbenikGui.Pocetni n =new SluzbenikGui.Pocetni();  //kreira novi po�etni gui za sluzbenika
				n.setLocationRelativeTo(null);   // postavlja ga na sredinu
				n.setVisible(true);  // upali vidljivost
				n.setResizable(false);
			}
		});
		setBackground(Color.WHITE);
		setTitle("MicroOrg - Izvje\u0161taji");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 574, 385);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setBounds(0, 0, 559, 347);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		tabbedPane.addTab("Novi izvje\u0161taj", null, panel, null);
		
		JLabel label = new JLabel("Radni sati:");
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setBounds(10, 75, 141, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Lista transakcija:");
		label_1.setBounds(307, 39, 231, 14);
		panel.add(label_1);
		
		JList list = new JList();
		list.setBorder(new LineBorder(new Color(0, 0, 0)));
		list.setBounds(307, 59, 242, 214);
		panel.add(list);
		
		JLabel label_2 = new JLabel("Prihodi:");
		label_2.setHorizontalAlignment(SwingConstants.TRAILING);
		label_2.setBounds(10, 100, 141, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Rashodi:");
		label_3.setHorizontalAlignment(SwingConstants.TRAILING);
		label_3.setBounds(10, 125, 141, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Izvr\u0161ene transakcije:");
		label_4.setHorizontalAlignment(SwingConstants.TRAILING);
		label_4.setBounds(10, 150, 141, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Dodijeljeni krediti:");
		label_5.setHorizontalAlignment(SwingConstants.TRAILING);
		label_5.setBounds(10, 175, 141, 14);
		panel.add(label_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(188, 8, 176, 20);
		panel.add(comboBox);
		
		JLabel label_6 = new JLabel("Za protekli vremenski period:");
		label_6.setHorizontalAlignment(SwingConstants.TRAILING);
		label_6.setBounds(10, 11, 176, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Kreirano tipova kredita:");
		label_7.setHorizontalAlignment(SwingConstants.TRAILING);
		label_7.setBounds(10, 200, 141, 14);
		panel.add(label_7);
		
		JButton button = new JButton("PDF prikaz");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano !");
			}
		});
		button.setBounds(10, 285, 110, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Unesi izvje\u0161taj");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano !");
			}
		});
		button_1.setBounds(142, 285, 163, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Nazad");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SluzbenikGui.Izvjestaji.this.dispose();
			}
		});
		button_2.setBounds(460, 285, 89, 23);
		panel.add(button_2);
		
		JLabel label_8 = new JLabel("Datum i vrijeme:");
		label_8.setHorizontalAlignment(SwingConstants.TRAILING);
		label_8.setBounds(10, 225, 141, 14);
		panel.add(label_8);
	}

}
