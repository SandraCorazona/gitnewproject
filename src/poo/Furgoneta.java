package poo;

public class Furgoneta extends Coche {
	
	private int capacidad_carga;
	private int plazas_exta;
	
	public Furgoneta(int plazas_extra, int capacidad_carga) {
		
		super();  //llamar al constructor de la clase padre
		this.capacidad_carga=capacidad_carga;
		this.plazas_exta=plazas_extra;
	}
	
	public String dime_DatosFurgoneta() {
		
		return "La capacidad de carga de la furgoneta es " + capacidad_carga + 
				" y las plazas son " + plazas_exta;
	}
	
	

}
