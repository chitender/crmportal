package web;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.RootPaneContainer;
import javax.swing.WindowConstants;
import javax.accessibility.Accessible;


public class ChildActivation extends JFrame implements WindowConstants, Accessible, RootPaneContainer{
	private JLabel l1, l2, l3, l4, l5, l6, l7, l8;
	private JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7;
	private JButton b1, b2;
	public ChildActivation(){
		
		
		super("ENTER Child DETAILS");
		setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		l1 = new JLabel("ENTER Child DETAILS");
		l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
		l2 = new JLabel("LIST OF CHILD MSISDN");
		tf1 = new JTextField(10);
		l3 = new JLabel("Campaign ID");
		tf2 = new JTextField(10);
		l4 = new JLabel("Company Name");
		tf3 = new JTextField(10);
		l5 = new JLabel("COCP/COIP");
		tf4 = new JTextField(10);
		l6 = new JLabel("Circle Code");
		tf5 = new JTextField(10);
		l7 = new JLabel("Agent Code");
		tf6 = new JTextField(10);
		l8 = new JLabel("Sub Agent Code");
		tf7 = new JTextField(10);		
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
        tf1.setBounds(300, 70, 200, 30);
        tf2.setBounds(300, 110, 200, 30);
        tf3.setBounds(300, 150, 200, 30);
        tf4.setBounds(300, 190, 200, 30);
        tf5.setBounds(300, 230, 200, 30);
        tf6.setBounds(300, 270, 200, 30);
        tf7.setBounds(300, 310, 200, 30);
        b1.setBounds(50, 430, 100, 30);
        b2.setBounds(300, 430, 100, 30);
        
        getContentPane().add(l1);
        getContentPane().add(l2);
        getContentPane().add(tf1);
        getContentPane().add(l3);
        getContentPane().add(tf2);
        getContentPane().add(l4);
        getContentPane().add(tf3);
        getContentPane().add(l5);
        getContentPane().add(tf4);
        getContentPane().add(l6);
        getContentPane().add(tf5);
        getContentPane().add(l7);
        getContentPane().add(tf6);
        getContentPane().add(l8);
        getContentPane().add(tf7);
        getContentPane().add(b1);
        getContentPane().add(b2);
		
		    
	        
        setSize(700, 700);
		setVisible(true);
        
		
		
	}
	
	private class thehandler implements ActionListener{
		
	
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
                        
            JOptionPane.showMessageDialog(null, s1);
            
         }
}
	}
  }


