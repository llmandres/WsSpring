package es.khk.modelo.entidad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Procesador {
	@Value("AMD")
	private String marca;
	@Value("Ryzen 9")
	private String modelo;
	@Value("16")
	private int numeroNucleos;
	@Value("500")
	private double precio;
	
	
	
	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", numeroNucleos=" + numeroNucleos + ", precio="
				+ precio + "]";
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumeroNucleos() {
		return numeroNucleos;
	}
	public void setNumeroNucleos(int numeroNucleos) {
		this.numeroNucleos = numeroNucleos;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}