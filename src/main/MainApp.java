package main;

import subclases.Electrodomestico;
import superclases.Lavadora;
import superclases.Television;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaración de las variables
		double TotalPrecioLavadoras = 0;
		double TotalPrecioTelevisioes = 0;
		double TotalPrecio = 0;
		Electrodomestico Electrodomesticos[] = new Electrodomestico[10];
		
		Electrodomesticos[0] = new Electrodomestico();
		Electrodomesticos[1] = new Electrodomestico(20, "Gris", 'a', 10);
		Electrodomesticos[2] = new Electrodomestico(35.50, "Negro", 'b', 8);
		Electrodomesticos[3] = new Electrodomestico(15.75, "Azul", 'c', 3);
		Electrodomesticos[4] = new Electrodomestico(62, "Roja", 'd', 15.5);
		Electrodomesticos[5] = new Electrodomestico(825, "Blanco", 'e', 5);
		Electrodomesticos[6] = new Lavadora();
		Electrodomesticos[7] = new Lavadora(999, "Negra", 'e', 14.5, 8);
		Electrodomesticos[8] = new Television();
		Electrodomesticos[9] = new Television(585.85, "Negra", 'f', 7, 45, true);
		
		for(int i=0; i < Electrodomesticos.length; i++) {
			if (Electrodomesticos[i] instanceof Lavadora){
				TotalPrecioLavadoras += Electrodomesticos[i].precioFinal();
			} else if(Electrodomesticos[i] instanceof Television) {
				TotalPrecioTelevisioes +=  Electrodomesticos[i].precioFinal();
			}
			TotalPrecio += Electrodomesticos[i].precioFinal();
		}
		System.out.println("El precio de todas las lavadoras es: " + TotalPrecioLavadoras);
		System.out.println("El precio de todas las televisiones es: " + TotalPrecioTelevisioes);
		System.out.println("El precio de todos los electrodomesticos es: " + TotalPrecio);
	}
}

