import javax.swing.*;
public class While_For {

	public static void main(String[] args) {
		
		String clave="Sandra";
		String pass="";
		
		while (clave.equals(pass)==false){
			
			pass=JOptionPane.showInputDialog("Introduzca la contrase�a");
			
			if(clave.equals(pass)==false) {
				
			 System.out.println("Contrase�a incorrecta");
				
			}
		}
		
		System.out.println("Contrase�a correcta. Acceso permitido");

	}

}
