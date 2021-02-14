/**
 * 
 */
package com.ucreativa;

/**
 * @author admin
 *
 */
public class Bicicleta {
	private String velocidad;
	public String getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}

	public String getTipoLlanta() {
		return tipoLlanta;
	}

	public void setTipoLlanta(String tipoLlanta) {
		this.tipoLlanta = tipoLlanta;
	}

	public String getTipoPropulsor() {
		return tipoPropulsor;
	}

	public void setTipoPropulsor(String tipoPropulsor) {
		this.tipoPropulsor = tipoPropulsor;
	}

	private String tipoLlanta;
	private String tipoPropulsor;

	/**
	 * 
	 */
	public Bicicleta() {
		// TODO Auto-generated constructor stub
	}

	
	private String getvelocidad() {
		// TODO Auto-generated method stub
		return null;
	}

	private String gettipoLlanta() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/**
	 * @param velocidad
	 * @param tipoLlanta
	 * @param tipoPropulsor
	 */
	public Bicicleta(String velocidad, String tipoLlanta, String tipoPropulsor) {
		super();
		this.velocidad = velocidad;
		this.tipoLlanta = tipoLlanta;
		this.tipoPropulsor = tipoPropulsor;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Bicicleta a la basura: Velocidad" + this.getvelocidad() + "tipo de llanta" + this.gettipoLlanta());
	}
	
}
