import javax.swing.*;

public class PruebaVisual1 {

	public static void main(String[] args) {
		
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre");	
		
		String edad=JOptionPane.showInputDialog("Introduzca su edad");
		
		int edad_usuario=Integer.parseInt(edad);		
		
		System.out.println("Hola " + nombre_usuario + " el año que viene tendrás " 
		+ (edad_usuario+1) + " años");
		

	}

}
