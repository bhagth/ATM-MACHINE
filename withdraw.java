package sbi;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class withdraw extends JFrame implements ActionListener {
	
	withdraw (){
		setBounds (150,100,1000,550);
		setLayout (null);
		getContentPane().setBackground (Color.pink);
		
		JLabel text = new JLabel ("Enter Amount");
		text.setBounds(200,100,500,100);
		text.setFont(new Font ("serif",Font.ITALIC,50));
		text.setForeground(Color.white);
		add(text);
		
		JTextField amnt = new JTextField ();
		amnt.setBounds(200,200,150,50);
		add(amnt);
		
		JButton sav = new JButton ("SAVING ACCOUNT");
		sav.setBounds(700,300,250,50);
		sav.setFont(new Font ("serif",Font.ITALIC,20));
		sav.setForeground(Color.BLACK);
		sav.addActionListener(this);
		add(sav);
		
		JButton cur = new JButton ("CURRENT ACCOUNT");
		cur.setBounds(700,400,250,50);
		cur.setFont(new Font ("serif",Font.ITALIC,20));
		cur.setForeground(Color.BLACK);
		add(cur);
		cur.addActionListener(this);
		setVisible (true);
		
	}
	
	public void actionPerformed (ActionEvent ae) {
		setVisible (false);
		new credential();
	}

	public static void main(String[] args) {
		new withdraw ();

	}

}
