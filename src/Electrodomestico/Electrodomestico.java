package TA08_03;

public class Electrodomestico {
	
	// especificar colores disponibles
	final private String COLOR_BLANCO = "blanco";
	final private String COLOR_NEGRO = "negro";
	final private String COLOR_ROJO = "rojo";
	final private String COLOR_AZUL = "azul";
	final private String COLOR_GRIS = "gris";
	

	final private double PRECIO_POR_DEFECTO = 100;
	final private String COLOR_POR_DEFECTO = "blanco";
	final private char CONSUMO_POR_DEFECTO = 'F';
	final private double PESO_POR_DEFECTO = 5.0;

	private double precio_base;
	private String color;
	private char consumo_energetico;
	protected double peso;
	
	public Electrodomestico() {
		this.precio_base = this.PRECIO_POR_DEFECTO;
		this.peso = this.PESO_POR_DEFECTO;
		this.color = this.COLOR_POR_DEFECTO;
		this.consumo_energetico = this.CONSUMO_POR_DEFECTO;

	}

	public Electrodomestico(double precio_base, double peso) {
		this.precio_base = precio_base;
		this.peso = peso;
		this.color = this.COLOR_POR_DEFECTO;
		this.consumo_energetico = this.CONSUMO_POR_DEFECTO;

	}

	public Electrodomestico(double precio_base, String color, char consumo_energetico, double peso) {
		this.precio_base = precio_base;
		this.color = color;
		this.consumo_energetico = consumo_energetico;
		this.peso = peso;
	}

	public double getPrecio_base() {
		return precio_base;
	}

	public String getColor() {
		return color;
	}

	public char getConsumo_energetico() {
		return consumo_energetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}

//	public void setColor(String color) {
//		this.color = color;
//	}
	
	public void setColorBlanco(String color) {
		this.color = this.COLOR_BLANCO;
	}
	
	public void setColorGris(String color) {
		this.color = this.COLOR_GRIS;
	}
	
	public void setColorNegro(String color) {
		this.color = this.COLOR_NEGRO;
	}
	
	public void setColorRojo(String color) {
		this.color = this.COLOR_ROJO;
	}
	
	public void setColorAzul(String color) {
		this.color = this.COLOR_AZUL;
	}

	public void setConsumo_energetico(char consumo_energetico) {
		this.consumo_energetico = consumo_energetico;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
