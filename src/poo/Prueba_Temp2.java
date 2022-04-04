package poo;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class Prueba_Temp2 {

	public static void main(String[] args) {
		
		Reloj mi_Reloj=new Reloj();
		
		mi_Reloj.en_Marcha(3000, true);
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
		
		System.exit(0);
	}
}

class Reloj {
	
	public void en_Marcha(int intervalo, final boolean sonido) {
		
	class DamelaHora2 implements ActionListener {
			
	public void actionPerformed(ActionEvent evento) {
				
	  	Date ahora=new Date();
				
		System.out.println("Te pongo la hora cada 3 segundos" + ahora);
				
		if(sonido) {
					
		Toolkit.getDefaultToolkit().beep();
	}
    }  
   	}
	    ActionListener oyente=new DamelaHora2();
		Timer mi_temp=new Timer(intervalo, oyente);
		mi_temp.start();
	}
	
	}
