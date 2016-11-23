package web;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.RootPaneContainer;
import javax.swing.WindowConstants;
import javax.accessibility.Accessible;


public class PasswordGeneration extends JFrame implements WindowConstants, Accessible, RootPaneContainer{
	private JLabel l1,l2;
	private JTextField tf1;
	private JButton b1, b2, b3;
	
	public PasswordGeneration(){
		super("PASSWORD GENERATION/RESET");
		
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1 = new JLabel("PASSWORD GENERATION OR RESET PORTAL");
		l2 = new JLabel("Enter Admin MSISDN");
		tf1 = new JTextField("12");
		b1 = new JButton("SET");
		b2 = new JButton("RESET");
		b3 = new JButton("CLEAR");
		
		thehandler handler = new thehandler();
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		b3.addActionListener(handler);
		
		
		l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        
        tf1.setBounds(300, 70, 200, 30);
        
        b1.setBounds(50, 430, 100, 30);
        b2.setBounds(170, 430, 100, 30);
        b3.setBounds(290,430,100,30);
        
        add(l1);
        add(l2);
        add(tf1);
        add(b1);
        add(b2);
        add(b3);
        
        
		setSize(700, 700);
		setVisible(true);
	}
	
        private class thehandler implements ActionListener{
	
	     @Override
		public void actionPerformed(ActionEvent event){
	    	    
		if (event.getSource() == b1)
        {
           String s1 = tf1.getText();
           
           
           JOptionPane.showMessageDialog(null, "Password has been Generated and Password is 123456a For " +s1);
           
	}
		else
		{
			if (event.getSource() == b2){
				String s1 = tf1.getText();
				JOptionPane.showMessageDialog(null, "Password has been Reset to 123456a For " +s1);
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Please enter MSISDN");
			}
		}
	
}
}
}
