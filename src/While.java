import javax.swing.*;
public class While {

	public static void main(String[] args) {
		
		String clave="Sandra";
		String pass="";
		
		while (clave.equals(pass)==false){
			
			pass=JOptionPane.showInputDialog("Introduzca la contraseņa");
			
			if(clave.equals(pass)==false) {
				
			 System.out.println("Contraseņa incorrecta");
				
			}
		}
		
		System.out.println("Contraseņa correcta. Acceso permitido");

	}

}
