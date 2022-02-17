import java.util.*;
public class While1 {

	public static void main(String[] args) {
		
		int aleatorio=(int)(Math.random()*100);//Devuelve un numero random
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		
		int intentos=0;
		
		while (numero!=aleatorio) {
			
			intentos++;
			System.out.println("Introduce un número");
			
			numero=entrada.nextInt();
			
			if (aleatorio<numero) {
				
				System.out.println("Más bajo");
			}
			else if (aleatorio>numero) {
				
				System.out.println("Más alto");
			}
			
		}
		System.out.println("Correcto. Lo has conseguido en: " + intentos + " intentos");
				
	}

}
