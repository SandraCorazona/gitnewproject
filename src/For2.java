import java.util.Iterator;
import javax.swing.JOptionPane;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arroba=0;
		boolean punto=false;
		String email=JOptionPane.showInputDialog("Introduzca el email");
		
		for(int i=0; i<email.length(); i++) {
			
			if(email.charAt(i)=='@') {
				arroba++;
			}
			if (email.charAt(i)=='.') {
				
				punto=true;
			}
		}		
		 if(arroba==1 && punto==true) {
		 System.out.println("El email es correcto");
		 }
		 else {
			 System.out.println("El email no es correcto");
		 }
	}

}
