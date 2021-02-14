/**
 * 
 */
package com.ucreativa;

/**
 * @author admin
 *
 */
public class Tren {
	private String tipoTren;
	public String getTipoTren() {
		return tipoTren;
	}

	public void setTipoTren(String tipoTren) {
		this.tipoTren = tipoTren;
	}

	public String getTipoCombustible() {
		return TipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		TipoCombustible = tipoCombustible;
	}

	public String getCantidadPasajeros() {
		return cantidadPasajeros;
	}

	public void setCantidadPasajeros(String cantidadPasajeros) {
		this.cantidadPasajeros = cantidadPasajeros;
	}

	private String TipoCombustible;
	private String cantidadPasajeros;

	/**
	 * 
	 */
	
	public Tren() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param tipoTren
	 * @param tipoCombustible
	 * @param cantidadPasajeros
	 */
	public Tren(String tipoTren, String tipoCombustible, String cantidadPasajeros) {
		super();
		this.tipoTren = tipoTren;
		TipoCombustible = tipoCombustible;
		this.cantidadPasajeros = cantidadPasajeros;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Tren a la basura: tipo de tren" + this.tipoTren + "cantidad de pasajeros" + this.cantidadPasajeros);
	}

}
