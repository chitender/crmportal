package web;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class tuna extends JFrame{
	
	private JLabel username;
	private JLabel password;
	public tuna(){
		super("Telenity CRM");
		setLayout(new FlowLayout());
		
		username = new JLabel("LOGIN FAILURE");
		
		
		username.setToolTipText("RETRY");
		add(username);

	}

}

