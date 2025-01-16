package es.upgrade.modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * Para trabajar con las librerías Lombok, tenemos que meter en el pom.xml
 * las librerias y ademas instalar el plugin de lombok
 */
@Component
@Scope("prototype")
@Data
public class Direccion {
	private String tipoVia;
	private String nombreVia;
	private String pais;
	

}
