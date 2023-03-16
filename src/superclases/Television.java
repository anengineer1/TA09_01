package superclases;

import subclases.Electrodomestico;

public class Television extends Electrodomestico {

	final private int RESOLUCION_POR_DEFECTO = 20;
	final private boolean TDT_POR_DEFECTO = false;

	private int resolucion;
	private boolean tdt;

	public Television() {
		super();
		this.resolucion = this.RESOLUCION_POR_DEFECTO;
		this.tdt = this.TDT_POR_DEFECTO;
	}

	public Television(double precio_base, double peso) {
		super(precio_base, peso);
		this.resolucion = this.RESOLUCION_POR_DEFECTO;
		this.tdt = this.TDT_POR_DEFECTO;
	}

	public Television(double precio_base, String color, char consumo_energetico, double peso, int resolucion,
			boolean tdt) {
		super(precio_base, color, consumo_energetico, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}
	
	

	public int getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}

	public double precioFinal() {

		double multiplicador = 1;
		double sumando = 0;
		
		// Añadir 30% si mayor resolución
		if (this.resolucion > 40.0) {
			multiplicador = 1.3;
		}
		
		// Sumar 50€ si TDT
		if (this.tdt) {
			sumando = 50;
		}
		return super.precioFinal() * multiplicador + sumando;
	}

}
