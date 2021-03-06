package SluzbenikGui;
import osnovni.Login;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.ScrollPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Pocetni extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pocetni frame = new Pocetni();
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
	public Pocetni() {
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosed(WindowEvent e) {
				osnovni.Login l=new osnovni.Login();
				l.setVisible(true);
				l.setResizable(false);
				l.setLocationRelativeTo(null);
			}
		});
		setTitle("MicroOrg - Kreditni slu\u017Ebenik ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 472, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SluzbenikGui.Pocetni.this.dispose();
			}
		});
		ImageIcon _imageIcon= new ImageIcon(getClass().getResource("/resources/logout (1).png"));
		button_5.setIcon(_imageIcon);
		button_5.setBounds(309, 302, 122, 50);
		contentPane.add(button_5);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(getClass().getResource("/resources/logo.jpg")));
		label.setBounds(231, 42, 200, 114);
		contentPane.add(label);
		
		JButton button = new JButton("Klijenti");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SluzbenikGui.Klijenti n =new SluzbenikGui.Klijenti();  //kreira klijenti gui za �efa
				n.setLocationRelativeTo(null);   // postavlja ga na sredinu
				n.setVisible(true);  // upali vidljivost
				n.setResizable(false);
				//SluzbenikGui.Pocetni.this.dispose(); // zatvara ovu formu
				SluzbenikGui.Pocetni.this.hide(); // nije dobro rje�enje jer ga skriva negdje...
			}
		});
		button.setIcon(new ImageIcon(getClass().getResource("/resources/users (1).png")));
		button.setHorizontalAlignment(SwingConstants.TRAILING);
		button.setBounds(10, 11, 153, 60);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Krediti");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SluzbenikGui.Krediti n =new SluzbenikGui.Krediti();  //kreira klijenti gui za �efa
				n.setLocationRelativeTo(null);   // postavlja ga na sredinu
				n.setVisible(true);  // upali vidljivost
				n.setResizable(false);
				//SluzbenikGui.Pocetni.this.dispose(); // zatvara ovu formu
				SluzbenikGui.Pocetni.this.hide(); // nije dobro rje�enje jer ga skriva negdje...
			}
		});
		button_1.setIcon(new ImageIcon(getClass().getResource("/resources/kredit.png")));
		button_1.setHorizontalAlignment(SwingConstants.TRAILING);
		button_1.setBackground(UIManager.getColor("Button.background"));
		button_1.setBounds(10, 150, 153, 60);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Ponude");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SluzbenikGui.Ponude n =new SluzbenikGui.Ponude();  //kreira klijenti gui za �efa
				n.setLocationRelativeTo(null);   // postavlja ga na sredinu
				n.setVisible(true);  // upali vidljivost
				n.setResizable(false);
				//SluzbenikGui.Pocetni.this.dispose(); // zatvara ovu formu
				SluzbenikGui.Pocetni.this.hide(); // nije dobro rje�enje jer ga skriva negdje...
			}
		});
		button_2.setIcon(new ImageIcon(getClass().getResource("/resources/poooonuda.png")));
		button_2.setHorizontalAlignment(SwingConstants.RIGHT);
		button_2.setBackground(UIManager.getColor("Button.background"));
		button_2.setBounds(10, 79, 153, 60);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("Transakcije");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SluzbenikGui.Transakcije n =new SluzbenikGui.Transakcije();  //kreira klijenti gui za �efa
				n.setLocationRelativeTo(null);   // postavlja ga na sredinu
				n.setVisible(true);  // upali vidljivost
				n.setResizable(false);
				//SluzbenikGui.Pocetni.this.dispose(); // zatvara ovu formu
				SluzbenikGui.Pocetni.this.hide(); // nije dobro rje�enje jer ga skriva negdje...
			}
		});
		button_3.setIcon(new ImageIcon(getClass().getResource("/resources/kredit.jpg")));
		button_3.setHorizontalAlignment(SwingConstants.RIGHT);
		button_3.setBackground(UIManager.getColor("Button.background"));
		button_3.setBounds(10, 292, 153, 60);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Izvje\u0161taji");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SluzbenikGui.Izvjestaji n =new SluzbenikGui.Izvjestaji();  //kreira klijenti gui za �efa
				n.setLocationRelativeTo(null);   // postavlja ga na sredinu
				n.setVisible(true);  // upali vidljivost
				n.setResizable(false);
				//SluzbenikGui.Pocetni.this.dispose(); // zatvara ovu formu
				SluzbenikGui.Pocetni.this.hide(); // nije dobro rje�enje jer ga skriva negdje...
			}
		});
		button_4.setIcon(new ImageIcon(getClass().getResource("/resources/report.png")));
		button_4.setHorizontalAlignment(SwingConstants.TRAILING);
		button_4.setBackground(UIManager.getColor("Button.background"));
		button_4.setBounds(10, 221, 153, 60);
		contentPane.add(button_4);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(new Color(128, 0, 0));
		panel.setBorder(new LineBorder(new Color(128, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(231, 178, 190, 114);
		contentPane.add(panel);
		
		JLabel label_1 = new JLabel("Ime:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(10, 11, 79, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Prezime:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(10, 36, 79, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Pozicija:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(10, 64, 79, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Datum:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(10, 89, 79, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("/");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setBounds(99, 11, 79, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("/");
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setBounds(99, 36, 79, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("/");
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setBounds(99, 64, 79, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("/");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setBounds(99, 89, 79, 14);
		panel.add(label_8);
	}
}
