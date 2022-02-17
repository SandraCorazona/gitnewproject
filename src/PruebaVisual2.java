import java.util.*;
import javax.swing.*;

public class PruebaVisual2 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Elija una opci�n: \n1: Cuadrado \n2: Rect�ngulo \n3: Tri�ngulo \n4: C�rculo"); //Salto de linea
		
		int figura=entrada.nextInt();
		
		switch (figura) {
		
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el lado"));//Convierte a entero
			System.out.println("El �rea del cuadrado es: " + Math.pow(lado, 2));
			break;
		case 2:
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura"));
			System.out.println("El �rea del rect�ngulo es: " + base*altura);
			break;
		case 3:
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base"));
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura"));
			System.out.println("El �rea del tri�ngulo es: " + (base*altura)/2);
			break;
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el radio"));
			System.out.print("El �rea del c�rculo es: ");
			System.out.printf("%1.2", Math.PI*(Math.pow(radio, 2)));
			break;
		default:	
		    System.out.print("La opci�n no es correcta");
		}
	}
}
