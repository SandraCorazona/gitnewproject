package Grafico;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		
		mi_Marco marco1=new mi_Marco();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class mi_Marco extends JFrame {
	
	public mi_Marco() {
		
		//setSize(500,300);   tamaño
		
		//setLocation(500,300); localizacion en la pantalla
		
		setBounds(500, 300, 250, 250); //derecha, izqui, alto, ancho
		
		//setResizable(false); para que el user no la pueda manipular
		
		//setExtendedState(JFrame.MAXIMIZED_BOTH); pantalla completa
		
		setTitle("Mi ventana");
	}
}