/**
 * 
 */
package com.ucreativa;

/**
 * @author Isaac
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Carro carrito1 = new Carro(4, 7000, "Diesel");
		Bicicleta bicinueva = new Bicicleta("100 kmh", "montana", "cadena");
		
		carrito1 = null;
		System.gc();
		bicinueva = null;
		Runtime.getRuntime().gc();
	}

}
