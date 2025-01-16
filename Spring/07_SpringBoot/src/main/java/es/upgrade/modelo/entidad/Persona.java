package es.upgrade.modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Scope("prototype")
@Data
public class Persona {
	private String nombre;
	@Autowired
	private Direccion direccion;
	@Autowired
	private Empleo empleo;

}
