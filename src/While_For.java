import javax.swing.*;
public class While_For {

	public static void main(String[] args) {
		
		String clave="Sandra";
		String pass="";
		
		while (clave.equals(pass)==false){
			
			pass=JOptionPane.showInputDialog("Introduzca la contraseña");
			
			if(clave.equals(pass)==false) {
				
			 System.out.println("Contraseña incorrecta");
				
			}
		}
		
		System.out.println("Contraseña correcta. Acceso permitido");

	}

}
