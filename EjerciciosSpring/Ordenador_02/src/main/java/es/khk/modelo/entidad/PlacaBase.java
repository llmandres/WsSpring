package es.khk.modelo.entidad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PlacaBase {
	@Value("MSI")
	private String marca;
	@Value("250")
	private double precio;
	@Value("Tomahawk")
	private String tipo;
	
	
	@Override
	public String toString() {
		return "PlacaBase [marca=" + marca + ", precio=" + precio + ", tipo=" + tipo + "]";
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}