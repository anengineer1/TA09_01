package superclases;

import subclases.Electrodomestico;

public class Lavadora extends Electrodomestico {

	final private double CARGA_POR_DEFECTO = 5; 
	
	private double carga;
	
	public Lavadora() {
		super();
		this.carga = this.CARGA_POR_DEFECTO;
	}

	public Lavadora(double precio_base, double peso) {
		super(precio_base, peso);
		this.carga = this.CARGA_POR_DEFECTO;
	}

	public Lavadora(double precio_base, String color, char consumo_energetico, double peso, double carga) {
		super(precio_base, color, consumo_energetico, peso);
		this.carga = carga;
	}

	public double getCarga() {
		return carga;
	}

	public double precioFinal() {
		
		if (this.carga > 30.0) {
			return super.precioFinal() + 50.0;
		} else {
			return super.precioFinal();
		}
	}
	
}
