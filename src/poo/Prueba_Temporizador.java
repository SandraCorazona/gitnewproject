package poo;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;
import javax.swing.*;

public class Prueba_Temporizador {

	public static void main(String[] args) {
		
		Dame_Hora oyente= new Dame_Hora();
		
		Timer mi_temporizador=new Timer(5000, oyente);
		
		mi_temporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		
		System.exit(0);
	}
}

class Dame_Hora implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora=new Date();
		
		System.out.println("Te pongo la hora cada 5 segundos " + ahora);
		
		Toolkit.getDefaultToolkit().beep();
	}
}
