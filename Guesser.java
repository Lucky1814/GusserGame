package guessergame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Guesser extends JFrame {

	private JPanel contentPane;
	private JTextField db;
	private JTextField gp1;
	private JTextField gp2;
	private JTextField comm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guesser frame = new Guesser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Guesser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("GUESSER GAME");
		lblNewLabel.setBounds(127, 11, 223, 34);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		contentPane.add(lblNewLabel);

		JLabel p1 = new JLabel("PLAYER1");
		p1.setBounds(127, 121, 89, 19);
		p1.setForeground(new Color(255, 0, 255));
		p1.setBackground(new Color(128, 128, 128));
		p1.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(p1);

		JLabel p2 = new JLabel("PLAYER2");
		p2.setBounds(127, 209, 89, 19);
		p2.setForeground(Color.MAGENTA);
		p2.setFont(new Font("Tahoma", Font.BOLD, 15));
		p2.setBackground(Color.GRAY);
		contentPane.add(p2);

		JLabel comp = new JLabel("COMPUTER");
		comp.setBounds(127, 299, 89, 19);
		comp.setForeground(Color.MAGENTA);
		comp.setFont(new Font("Tahoma", Font.BOLD, 15));
		comp.setBackground(Color.GRAY);
		contentPane.add(comp);

		JButton compbut = new JButton("GENERATE");
		compbut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// code

				int i = Integer.valueOf(gp1.getText());
				int j = Integer.valueOf(gp2.getText());
                 String v = "";
				Random r = new Random();
				int a = r.nextInt(10);
				comm.setText(String.valueOf(a));
				if (a == i) {
					db.setText("Player-1 won Game");
				}
				else if(String.valueOf(i) == v) {
					JOptionPane.showMessageDialog(contentPane,"Plz Enter Valid input");
				}
				else if (a == j) {
					db.setText("Player-2 won Game");
				}
				else {
					db.setText("Computer won Game");
				}
			}
		});
		compbut.setBounds(166, 346, 147, 25);
		compbut.setFont(new Font("Tahoma", Font.BOLD, 15));
		compbut.setBackground(Color.GREEN);
		contentPane.add(compbut);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(50, 104, 48, 48);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\lokes\\Downloads\\engineer-icon (1).png"));
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setBounds(50, 192, 48, 48);
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\lokes\\OneDrive\\Pictures\\Manager-icon1.png"));
		contentPane.add(lblNewLabel_2_1);

		JLabel dispp = new JLabel("DISPLAY");
		dispp.setBounds(29, 400, 110, 22);
		dispp.setForeground(new Color(30, 141, 147));
		dispp.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(dispp);

		db = new JTextField();
		db.setBounds(149, 401, 281, 20);
		db.setBackground(new Color(255, 128, 192));
		db.setFont(new Font("Tahoma", Font.BOLD, 18));
		db.setForeground(new Color(0, 0, 0));
		contentPane.add(db);
		db.setColumns(10);

		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_2_1_1.setIcon(new ImageIcon("C:\\Users\\lokes\\OneDrive\\Pictures\\computer-icon.png"));
		lblNewLabel_2_1_1.setBounds(50, 288, 48, 48);
		contentPane.add(lblNewLabel_2_1_1);

		gp1 = new JTextField();
		gp1.setFont(new Font("Tahoma", Font.BOLD, 14));
		gp1.setBounds(256, 120, 124, 20);
		contentPane.add(gp1);
		gp1.setColumns(10);

		gp2 = new JTextField();
		gp2.setFont(new Font("Tahoma", Font.BOLD, 14));
		gp2.setColumns(10);
		gp2.setBounds(256, 208, 124, 20);
		contentPane.add(gp2);

		comm = new JTextField();
		comm.setFont(new Font("Tahoma", Font.BOLD, 14));
		comm.setColumns(10);
		comm.setBounds(256, 288, 124, 20);
		contentPane.add(comm);
		
		JLabel lblNewLabel_1 = new JLabel("** CHOOSE  0 TO 10 NUMS **");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Castellar", Font.BOLD, 18));
		lblNewLabel_1.setBounds(93, 71, 287, 22);
		contentPane.add(lblNewLabel_1);
	}
}
