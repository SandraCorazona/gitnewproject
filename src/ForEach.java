import java.util.Iterator;

import javax.swing.JOptionPane;

public class ForEach {

	public static void main(String[] args) {
		
		String []paises=new String[8];
		//String []paises= {"Espa�a", "M�xico", "Colombia", "Per�", "Chile", "Argentina", "Ecuador", "Venezuela"};
		/*paises[0]="Espa�a";
		paises[1]="M�xico";
		paises[2]="Colombia";
		paises[3]="Per�";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";
		for (int i = 0; i < paises.length; i++) {
			System.out.println("Pa�s " + (i+1) + " " + paises[i]);
			
		}*/
		for (int i = 0; i < 8; i++) {
			
			paises[i]=JOptionPane.showInputDialog("Introduce pa�s " + (i+1));
			
		}
		/*for(String elemento:paises) {  //Otra forma
			
			System.out.println("Pa�s: " + elemento);
		}/*/
		
	}

}
