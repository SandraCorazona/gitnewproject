import javax.swing.JOptionPane;

public class For3 {

	public static void main(String[] args) { //Hallar factorial de un numero
		
		int resultado=1;
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
		
		for (int i = numero; i > 0; i--) {
			
			resultado=resultado*i;
			
		}
		
		System.out.println("El factorial del numero " + numero + " es " + resultado);	 

	}

}
