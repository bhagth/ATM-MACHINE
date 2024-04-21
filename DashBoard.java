package sbi;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DashBoard extends JFrame implements ActionListener{
	
	DashBoard  (){
		
		setBounds(100,50,1250,1000);
		setLayout (null);
		
		getContentPane ().setBackground(Color.BLUE);
		JLabel text = new JLabel ("State Bank Of India");
		text.setForeground(Color.white);
		text.setBounds(400,100,500,100);
		text.setFont(new Font ("serif",Font.ITALIC,50));
		
		add(text);
		
		JButton dep = new JButton ("DEPOSITE");
		dep.setBounds(100,250,200,50);
		dep.setFont(new Font ("serif",Font.ITALIC,20));
		dep.setBackground(Color.yellow);
		dep.setForeground(Color.black);
		dep.addActionListener(this);
		add(dep);
		
		JButton tra = new JButton ("TRANSFER");
		tra.setBounds(100,350,200,50);
		tra.setFont(new Font ("serif",Font.ITALIC,20));
		tra.setBackground(Color.yellow);
		tra.setForeground(Color.black);
		tra.addActionListener(this);
		add(tra);
		
		JButton pin = new JButton ("PIN CHANGE");
		pin.setBounds(100,450,200,50);
		pin.setFont(new Font ("serif",Font.ITALIC,20));
		pin.setBackground(Color.yellow);
		pin.setForeground(Color.black);
		pin.addActionListener(this);
		add(pin);
		
		JButton oth = new JButton ("OTHERS");
		oth.setBounds(100,550,200,50);
		oth.setFont(new Font ("serif",Font.ITALIC,20));
		oth.setBackground(Color.yellow);
		oth.setForeground(Color.black);
		oth.addActionListener(this);
		add(oth);
		
		JButton fast = new JButton ("FAST CASH");
		fast.setBounds(1000,250,200,50);
		fast.setFont(new Font ("serif",Font.ITALIC,20));
		fast.setBackground(Color.yellow);
		fast.setForeground(Color.black);
		fast.addActionListener(this);
		add(fast);
		
		JButton with = new JButton ("WITH DRAW ");
		with.setBounds(1000,350,200,50);
		with.setFont(new Font ("serif",Font.ITALIC,20));
		with.setBackground(Color.yellow);
		with.setForeground(Color.black);
		with.addActionListener(this);
		add(with);
		
		JButton bal = new JButton ("BALANCY INQUIRY");
		bal.setBounds(1000,450,200,50);
		bal.setFont(new Font ("serif",Font.ITALIC,20));
		bal.setBackground(Color.yellow);
		bal.setForeground(Color.black);
		bal.addActionListener(this);
		add(bal);
		
		JButton mns = new JButton ("MINI STATEMENT");
		mns.setBounds(1000,550,200,50);
		mns.setFont(new Font ("serif",Font.ITALIC,20));
		mns.setBackground(Color.yellow);
		mns.setForeground(Color.black);
		add(mns);
		
		setVisible (true);
		
		
	}
	public void actionPerformed(ActionEvent ae) {
		setVisible (false);
		new withdraw();
	}

	public static void main(String[] args) {
		new DashBoard();

	}

}
