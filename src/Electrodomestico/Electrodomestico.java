package Electrodomestico;

public class Electrodomestico {

	final protected double PRECIO_POR_DEFECTO = 100.0;
	final protected String COLOR_POR_DEFECTO = "blanco";
	final protected char CONSUMO_POR_DEFECTO = 'F';
	final protected double PESO_POR_DEFECTO = 5.0;

	protected double precio_base;
	protected String color;
	protected char consumo_energetico;
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

	public void setConsumo_energetico(char consumo_energetico) {
		this.consumo_energetico = consumo_energetico;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void comprobarConsumoEnergetico(char letra) {

		if (isLetra(letra)) {
			this.consumo_energetico = Character.toUpperCase(letra);
		} else {
			this.consumo_energetico = this.CONSUMO_POR_DEFECTO;
		}
	}

	public void comprobarColor(String color) {

		if (isColor(color)) {
			this.color = color.toLowerCase();
		} else {
			this.color = this.COLOR_POR_DEFECTO;
		}

	}

	protected boolean isLetra(char letra) {
		return (Character.toUpperCase(letra) == 'A' || Character.toUpperCase(letra) == 'B'
				|| Character.toUpperCase(letra) == 'C' || Character.toUpperCase(letra) == 'D'
				|| Character.toUpperCase(letra) == 'E' || Character.toUpperCase(letra) == 'F');
	}

	protected boolean isColor(String color) {
		return (color.toLowerCase() == "rojo" || color.toLowerCase() == "azul" || color.toLowerCase() == "negro"
				|| color.toLowerCase() == "blanco" || color.toLowerCase() == "gris");
	}

	public double precioFinal() {

		double precio_consumo = 0.0;
		double precio_peso = 0.0;

		switch (this.consumo_energetico) {
		case 'A':
			precio_consumo = 100.0;
			break;

		case 'B':
			precio_consumo = 80.0;
			break;

		case 'C':
			precio_consumo = 60.0;
			break;
		case 'D':
			precio_consumo = 50.0;
			break;

		case 'E':
			precio_consumo = 30.0;
			break;

		case 'F':
			precio_consumo = 10.0;
			break;

		default:
			break;
		}

		if ((19 >= this.peso) && (this.peso >= 0)) {
			precio_peso = 10.0;
		} else if ((49 >= this.peso) && (this.peso >= 20)) {
			precio_peso = 50.0;
		} else if ((79 >= this.peso) && (this.peso >= 50)) {
			precio_peso = 80.0;
		} else if (this.peso >= 80) {
			precio_peso = 100.0;
		}

		return this.precio_base + precio_consumo + precio_peso;
	}

}
