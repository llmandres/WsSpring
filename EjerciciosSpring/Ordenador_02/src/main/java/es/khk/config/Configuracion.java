package es.khk.config;


import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.khk.modelo.entidad.Periferico;
import es.khk.modelo.entidad.RAM;
import es.khk.modelo.entidad.TarjetaGrafica;

@Configuration
public class Configuracion {
	
	@Bean
	public ArrayList<RAM> listaRAM(){
		ArrayList<RAM> listaRAMS = new ArrayList<RAM>();
		listaRAMS.add(new RAM());
		listaRAMS.add(new RAM());
		listaRAMS.get(0).setCapacidad(16);
		listaRAMS.get(1).setCapacidad(16);
		listaRAMS.get(0).setPrecio(300);
		listaRAMS.get(1).setPrecio(150);
		return listaRAMS;
	}
	@Bean
	public ArrayList<Periferico> listaPeriferico(){
		ArrayList<Periferico> listaPerifericos = new ArrayList<Periferico>();
		listaPerifericos.add(new Periferico());
		listaPerifericos.add(new Periferico());
		listaPerifericos.get(0).setMarca("HyperX");
		listaPerifericos.get(0).setTipo("Teclado");
		listaPerifericos.get(1).setMarca("HyperX");
		listaPerifericos.get(1).setTipo("Raton");
		return listaPerifericos;
	}
	@Bean
	public TarjetaGrafica tarjetaGrafica(RAM ram) {
		TarjetaGrafica tarjetaGrafica = new TarjetaGrafica();
		tarjetaGrafica.setRam(listaRAM().get(0));
		tarjetaGrafica.setMarca("NVIDIA");
		tarjetaGrafica.setNucleosCUDA(5);
		tarjetaGrafica.setPrecio(500);
		return tarjetaGrafica;
		
	}

}
