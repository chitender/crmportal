package web;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.RootPaneContainer;
import javax.swing.WindowConstants;
import javax.accessibility.Accessible;



public class GroupCreation extends JFrame implements WindowConstants, Accessible, RootPaneContainer{
	
	private JLabel l1,l2,l3,l4;
	private JTextField tf1,tf2,tf3;
	private JButton b1,b2;
	
	public GroupCreation(){
		super("GROUP CREATION");
		
		setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1 = new JLabel("ENTER THE DETAILS TO CREATE GROUP FOR ADMIN");
		l2 = new JLabel("ADMIN MSISDN");
		tf1 = new JTextField(12);
		l3 = new JLabel("GROUP NAME");
		tf2 = new JTextField(10);
		l4 = new JLabel("CHILD MSISDN LIST");
		tf3 = new JTextField();
		b1 = new JButton("SUBMIT");
		b2 = new JButton("CLEAR");
		
		thehandler handler = new thehandler();
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		
		l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        l4.setBounds(80, 150, 200, 30);
        tf1.setBounds(300, 70, 200, 30);
        tf2.setBounds(300, 110, 200, 30);
        tf3.setBounds(300, 150, 200, 30);
        b1.setBounds(50, 430, 100, 30);
        b2.setBounds(170, 430, 100, 30);
        
        
        add(l1);
		add(l2);
		add(tf1);
		add(l3);
		add(tf2);
		add(l4);
		add(tf3);
		add(b1);
		add(b2);
		
		
		setSize(700,700);
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
	            
	            
	            JOptionPane.showMessageDialog(null, s1);
	            
	         }
	}
		}
}
