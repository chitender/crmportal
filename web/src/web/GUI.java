package web;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class GUI {
public static void main(String[] args){
	String username = JOptionPane.showInputDialog(null,"Enter Username","TELENITY CRM PORTAL",JOptionPane.PLAIN_MESSAGE);
	if (username.equals("telenity")){
		String password = JOptionPane.showInputDialog(null,"Enter Password for " +username,"TELENITY CRM PORTAL", JOptionPane.PLAIN_MESSAGE);
		if ( password.equals("telenity")){
			JOptionPane.showMessageDialog(null,  "Welcome " +username, "LOGIN SUCCES", JOptionPane.PLAIN_MESSAGE);
		String operation = JOptionPane.showInputDialog(null, "1.Admin Activation\n 2.Child Activation \n 3. Child Addition into Admin \n 4.PASSWORD UPDATION FOR ADMIN \n 5.GROUP CREATION FOR ADMIN \n 6.CHILD ADDITION TO ADMIN GROUP", "CHOOSE OPERATION WHICH NEED TO PERFORM", JOptionPane.PLAIN_MESSAGE);
		int selection = Integer.parseInt(operation);
		
		switch (selection){
			case 1:
				JOptionPane.showMessageDialog(null,  "You Opted for Admin Activation", "TELENITY CRM PORTAL", JOptionPane.PLAIN_MESSAGE);
			    new Form();
			    break;
			case 2:
				JOptionPane.showMessageDialog(null,  "You opted for Child Activation", "TELENITY CRM PORTAL", JOptionPane.PLAIN_MESSAGE);
				new ChildActivation();
			break;
			case 3:
				JOptionPane.showMessageDialog(null,  "you opted for Child Addition into Admin", "TELENITY CRM PORTAL", JOptionPane.PLAIN_MESSAGE);
			new ChildAddition();
				break;
			case 4:
				JOptionPane.showMessageDialog(null,  "You opted for Password updation of Admin", "TELENITY CRM PORTAL", JOptionPane.PLAIN_MESSAGE);
			new PasswordGeneration();
				break;
			case 5:
				JOptionPane.showMessageDialog(null,  "You Opted for Group for Creation", "TELENITY CRM PORTAL", JOptionPane.PLAIN_MESSAGE);
			new GroupCreation();
				break;
						
			default:
				JOptionPane.showMessageDialog(null,  "you didnt choose valid option", "TELENITY CRM PORTAL", JOptionPane.PLAIN_MESSAGE);
				}
				}
		else {
			tuna test = new tuna();
			test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			test.setSize(575,600);
			test.setVisible(true);
		}
	}
	else {
		tuna test = new tuna();
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setSize(575,600);
		test.setVisible(true);
	}
	


}
}

