package sbi;
import java.awt.Color;

import javax.swing.*;

public class money extends JFrame{
	double cash;
	money (){
		setBounds (100,100,1000,565);
		
		setLayout (null);
		setVisible (true);
		getContentPane().setBackground(Color.blue);
		
		if (cash<=30000) {
			System.out.print("wait transuction is getting ready");
		}else {
			System.out.println ("sorry no cash");
		}
	}

	public static void main(String[] args) {
		new money ();

	}

}
