import java.util.*;
import javax.swing.*;

public class PruebaVisual2 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Elija una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo"); //Salto de linea
		
		int figura=entrada.nextInt();
		
		switch (figura) {
		
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el lado"));//Convierte a entero
			System.out.println("El área del cuadrado es: " + Math.pow(lado, 2));
			break;
		case 2:
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura"));
			System.out.println("El área del rectángulo es: " + base*altura);
			break;
		case 3:
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base"));
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura"));
			System.out.println("El área del triángulo es: " + (base*altura)/2);
			break;
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el radio"));
			System.out.print("El área del círculo es: ");
			System.out.printf("%1.2", Math.PI*(Math.pow(radio, 2)));
			break;
		default:	
		    System.out.print("La opción no es correcta");
		}
	}
}
