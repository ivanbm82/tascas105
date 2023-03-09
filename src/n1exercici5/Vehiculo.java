package n1exercici5;

import java.io.Serializable;

class Vehiculo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String marca;
	private String modelo;

	public Vehiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setMarca(String name) {
		this.marca = name;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return marca + " , " + modelo;
	}
}
