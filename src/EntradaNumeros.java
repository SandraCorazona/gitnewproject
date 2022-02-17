import javax.swing.*;

public class EntradaNumeros {

	public static void main(String[] args) {
		
		//double x=1000.0;
		//System.out.printf("%1.2f", x/3); //Imprime dos lugares despues de la coma
		
		 String num1=JOptionPane.showInputDialog("Introduzca un numero");
		 
		 double num2=Double.parseDouble(num1); //Convierte a double
		 
		 System.out.print("La raíz de " + num2 + " es ");
		 System.out.printf("%1.2f", Math.sqrt(num2));
	}

}
