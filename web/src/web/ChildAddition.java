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


public class ChildAddition extends JFrame implements WindowConstants, Accessible, RootPaneContainer{
	private JLabel l1, l2, l3;
	private JTextField tf1, tf2;
	private JButton b1, b2;
	public ChildAddition(){
		super("Child Addition To Admin");
		
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		l1 = new JLabel("CHILD TO ADMIN LINKING");
		l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
		l2 = new JLabel("LIST OF CHILD MSISDN");
		tf1 = new JTextField(10);
		l3 = new JLabel("ADMIN MSISDN");
			
		b1 = new JButton("SUBMIT");
		b2 = new JButton("CLEAR");
		
		thehandler handler = new thehandler();
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		
		l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        tf1.setBounds(300, 70, 200, 30);
        tf2.setBounds(300, 110, 200, 30);
        b1.setBounds(50, 430, 100, 30);
        b2.setBounds(170, 430, 100, 30);
        
        getContentPane().add(l1);
        getContentPane().add(l2);
        getContentPane().add(tf1);
        getContentPane().add(l3);
        getContentPane().add(tf2);
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
            
            
            JOptionPane.showMessageDialog(null, s1);
            
         }
}
	}
  }


