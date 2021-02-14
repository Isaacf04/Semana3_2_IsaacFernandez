/**
 * 
 */
package com.ucreativa;

/**
 * @author admin
 *
 */
public class Carro {
	private int cantidadMarchas;
	public int getCantidadMarchas() {
		return cantidadMarchas;
	}

	public void setCantidadMarchas(int cantidadMarchas) {
		this.cantidadMarchas = cantidadMarchas;
	}

	public int getRevolucionesMaxima() {
		return revolucionesMaxima;
	}

	public void setRevolucionesMaxima(int revolucionesMaxima) {
		this.revolucionesMaxima = revolucionesMaxima;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	private int revolucionesMaxima;
	private String tipoCombustible;
	

	/**
	 * Constructor
	 * Este metodo genera instancias de una clase
	 * @param cantidadMarchas
	 * @param revolucionesMaxima
	 * @param tipoCombustible
	 */
	public Carro(int cantidadMarchas, int revolucionesMaxima, String tipoCombustible) {
		this.cantidadMarchas = cantidadMarchas;
		this.revolucionesMaxima = revolucionesMaxima;
		this.tipoCombustible = tipoCombustible;
	}

	/**
	 * 
	 */
	public Carro() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Carro a la basura: Combuistible" + this.getTipoCombustible() + "revoluciones maximas" + this.getRevolucionesMaxima());
	}
}
