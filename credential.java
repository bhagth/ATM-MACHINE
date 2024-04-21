package sbi;
import java.awt.Color;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class credential extends JFrame implements ActionListener {
	
	JButton []NUMBER_BUTTONS = new JButton[10];
	JButton star,dec;
	JTextField pin;
	
	double cash;
	
	credential (){
		setBounds (50,100,1000,565);
		setLayout (null);
		
		star = new JButton ("*");
		dec = new JButton (".");
		
		getContentPane().setBackground(Color.BLUE);
		JLabel enter = new JLabel ("Enter Pin Number");
		enter.setBounds(80, 30, 400, 50);
		enter.setFont(new Font("serif",Font.ITALIC,50));
		enter.setForeground(Color.black);
		add(enter);
		
	    pin = new JTextField ();
		pin.setBounds(80,100,300,50);
		pin.setFont(new Font ("serif",Font.BOLD,20));
		pin.setEditable(false);
		add(pin);
		
		JButton ent = new JButton ("ENTER");
		ent.setBounds(700,350,200,50);
		ent.setFont(new Font ("serif",Font.BOLD,20));
		ent.setBackground(Color.yellow);
		ent.setForeground(Color.black);
		ent.addActionListener(this);
		add(ent);
		
		JButton can = new JButton ("CANCEL");
		can.setBounds(700,450,200,50);
		can.setFont(new Font ("serif",Font.ITALIC,20));
		can.setBackground(Color.yellow);
		can.setForeground(Color.black);
		add(can);
		for (int i=0;i <10; i++) {
			NUMBER_BUTTONS[i] = new JButton (String.valueOf(i));
			NUMBER_BUTTONS[i].addActionListener(this);
			NUMBER_BUTTONS[i].setFont(new Font ("ink free",Font.BOLD,20));
			NUMBER_BUTTONS[i].setFocusable(false);
		}
		
		JPanel panel = new JPanel ();
		panel.setBounds(80,200,300,300);
		panel.setLayout(new GridLayout(4,3,10,10));
		//panel.setBackground(Color.black);
		panel.add(NUMBER_BUTTONS[1]);
		panel.add(NUMBER_BUTTONS[2]);
		panel.add(NUMBER_BUTTONS[3]);
		
		panel.add(NUMBER_BUTTONS[4]);
		panel.add(NUMBER_BUTTONS[5]);
		panel.add(NUMBER_BUTTONS[6]);
		
		panel.add(NUMBER_BUTTONS[7]);
		panel.add(NUMBER_BUTTONS[8]);
		panel.add(NUMBER_BUTTONS[9]);
		
		panel.add(star);
		panel.add(NUMBER_BUTTONS[0]);
		panel.add(dec);
		
		add(panel);
		
		
		setVisible (true);
	}
	             
	
	
	public static void main(String[] args) {
		new credential();

	}
public void actionPerformed(ActionEvent e) {
		
		
		
		for (int i =0; i<10; i ++) {
			if (e.getSource()== NUMBER_BUTTONS[i]) {
				pin.setText(pin.getText().concat(String.valueOf(i)));
			}
		}
		if (e.getSource()== dec) {
			pin.setText(pin.getText().concat("."));
		}
		
		
		
		
	}


}
