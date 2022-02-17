import javax.swing.JOptionPane;

public class For1 {

	public static void main(String[] args) {
		
		//for(int i=0; i<10; i++) {
			
			//System.out.println("Sandra");
		//} //Imprime el nombre 10 veces

		boolean arroba= false;
		String email=JOptionPane.showInputDialog("Introduzca el email");
		
		for(int i=0; i<email.length(); i++) {
			
			if(email.charAt(i)=='@') {
				
				arroba=true;
			}
		}		
		 if(arroba==true) {
		 System.out.println("El email es correcto");
		 }
		 else {
			 System.out.println("El email no es correcto");
			 
		 }
		
	}

}
