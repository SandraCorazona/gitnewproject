
public class Calculos_con_Math {

	public static void main(String[] args) {
		
		//double raiz=Math.sqrt(9); //Raiz cuadrada
		//System.out.println(raiz);

		//double num1=5.85;
		//int resultado=(int)Math.round(num1);//Redondear
		//System.out.println(resultado);
		
		double base=5;
		double exponente=3;
		int resultado=(int)Math.pow(base, exponente);//Al cuadrado
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado);
		
	}

}
