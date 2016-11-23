package web;
import java.awt.event.ActionListener;
import java.io.IOException;

import subscription.AdminSubscription;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Form extends JFrame {
	public static JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
	public static JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9;
	public static JButton b1, b2;
	public Form(){
		
		super("ENTER ADMIN DETAILS");
		
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		l1 = new JLabel("ENTER ADMIN DETAILS", SwingConstants.CENTER);
		l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
		l2 = new JLabel("Admin MSISDN", SwingConstants.LEFT);
		tf1 = new JTextField(10);
		l3 = new JLabel("Admin Name",SwingConstants.LEFT);
		tf2 = new JTextField(10);
		l4 = new JLabel("Company Name",SwingConstants.LEFT);
		tf3 = new JTextField(10);
		l5 = new JLabel("COCP/COIP",SwingConstants.LEFT);
		tf4 = new JTextField(10);
		l6 = new JLabel("Circle Code",SwingConstants.LEFT);
		tf5 = new JTextField(10);
		l7 = new JLabel("Campaign Id",SwingConstants.LEFT);
		tf6 = new JTextField(10);
		l8 = new JLabel("Email ID",SwingConstants.LEFT);
		tf7 = new JTextField(10);
		l9 = new JLabel("Agent Code",SwingConstants.LEFT);
		tf8 = new JTextField(10);
		l10 = new JLabel("Sub Agent Code",SwingConstants.LEFT);
		tf9 = new JTextField(10);		
		b1 = new JButton("SUBMIT");
		b2 = new JButton("CLEAR");
		
		thehandler handler = new thehandler();
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		
		
        
		l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        l4.setBounds(80, 150, 200, 30);
        l5.setBounds(80, 190, 200, 30);
        l6.setBounds(80, 230, 200, 30);
        l7.setBounds(80, 270, 200, 30);
        l8.setBounds(80, 310, 200, 30);
        l9.setBounds(80,350,200,30);
        l10.setBounds(80,390,200,30);
        tf1.setBounds(300, 70, 200, 30);
        tf2.setBounds(300, 110, 200, 30);
        tf3.setBounds(300, 150, 200, 30);
        tf4.setBounds(300, 190, 200, 30);
        tf5.setBounds(300, 230, 200, 30);
        tf6.setBounds(300, 270, 200, 30);
        tf7.setBounds(300, 310, 200, 30);
        tf8.setBounds(300, 350, 200, 30);
        tf9.setBounds(300, 390, 200, 30);
        b1.setBounds(50, 430, 100, 30);
        b2.setBounds(300, 430, 100, 30);
        
        add(l1);
        add(l2);
        add(tf1);
        add(l3);
        add(tf2);
        add(l4);
        add(tf3);
        add(l5);
        add(tf4);
        add(l6);
        add(tf5);
        add(l7);
        add(tf6);
        add(l8);
        add(tf7);
        add(l9);
        add(tf8);
        add(l10);
        add(tf9);		
        add(b1);
        add(b2);
		
		    
	        
		
        setSize(700,700);
		setVisible(true);
		
	}
	
	public static final class thehandler implements ActionListener{
		public String s1,s2;
		public String s6;
	
    	@Override
		public void actionPerformed(ActionEvent event) 
     {
        if (event.getSource() == b1)
         {
            String s1 = tf1.getText();
            String s2 = tf2.getText();
            String s3 = tf3.getText();
            String s4 = tf4.getText();
            String s5 = tf5.getText();
            String s6 = tf6.getText();
            String s7 = tf7.getText();
            String s8 = tf8.getText();
            String s9 = tf9.getText();
            
            JOptionPane.showMessageDialog(null, "Admin MSISDn is" +s1);
            JOptionPane.showMessageDialog(null, "CAMPAIGN ID is" +s6);
            AdminSubscription paidactivation = new AdminSubscription();
            try {
            	
				paidactivation.activation();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
        	            
            
         }
}
	}
  }

