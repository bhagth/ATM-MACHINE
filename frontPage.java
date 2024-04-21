package sbi;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class frontPage extends JFrame implements ActionListener{
	
	frontPage(){
		setBounds (100,0,1250,1000);
		setLayout (null);
		getContentPane ().setBackground(Color.BLUE);
		ImageIcon icon = new ImageIcon (ClassLoader.getSystemResource("sunf.jpg"));
		Image i1 = icon.getImage().getScaledInstance(300, 700, Image.SCALE_DEFAULT);
		ImageIcon i2 = new ImageIcon (i1);
		JLabel image = new JLabel (i2);
		image.setBounds(200,100,300,500);
		add(image);
		
		JLabel text = new JLabel ("WELCOME TO STATE BANK OF INDIA");
		text.setBounds(200,30,700,50);
		text.setFont((new Font ("serif",Font.ITALIC,30)));
		add(text);
		
		text.setForeground(Color.white);
		JLabel tx = new JLabel ("SBI ATM CARD MAKES");
		tx.setBounds (700,100,400,50);
		tx.setForeground(Color.white);
		tx.setFont(new Font ("serif",Font.ITALIC,30));
		add(tx);
		
		JLabel tx1 = new JLabel ("LIFE SIMPLE");
		tx1.setBounds (750,200,400,50);
		tx1.setForeground(Color.white);
		tx1.setFont(new Font ("serif",Font.ITALIC,30));
		add(tx1);
		
		JButton insert = new JButton ("insert card");
		insert.setBounds (700,500,250,50);
		insert.setFont(new Font ("serif",Font.ITALIC,30));
		insert.setForeground(Color.black);
		insert.addActionListener (this);
		add(insert);
		
		
		
		setVisible (true);
		
	}
	public void actionPerformed (ActionEvent ae) {
		setVisible (false);
		new DashBoard();
	}

	public static void main(String[] args) {
		new frontPage();
	}

}
