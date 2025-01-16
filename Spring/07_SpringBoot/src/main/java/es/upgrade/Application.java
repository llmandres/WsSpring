package es.upgrade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import es.upgrade.modelo.entidad.Direccion;
import es.upgrade.modelo.entidad.Empleo;
import es.upgrade.modelo.entidad.Persona;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private ApplicationContext context;
	@Autowired
	private Persona p2;
	
	//@AutoWired
	// GestorPersona gp = new GestorPersona();

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		System.out.println("Esto va despues del método run");
		
		Direccion d = new Direccion();
		d.setNombreVia("Gran via");
		System.out.println(d);
		System.out.println(d.getNombreVia());
		Empleo e = new Empleo("Upgrade", 40000, false);
		e.getEmpresa();
		e.isBaja();
		System.out.println(e);
	}

	@Override
	public void run(String... args) throws Exception {
		Persona p = context.getBean("persona", Persona.class); // Este objeto es prototipado
		System.out.println(p2); // Como Persona es prototipado este objeto no es el mismo que el de arriba
		
		// Esto sería con 3 puntos como parametro de entrada
		int suma = sumar(0);
		suma = sumar(0,1);
		suma = sumar(0,1,2,3,4,5,89);
		
		// Esto seria sin puntos en parametro de entrada, y con un array
		sumarArray(new int[] {2,4,5});
		
	}
	
	public int sumar(int... numeros) {
		int resultado = 0;
		for(int i : numeros) {
			resultado+= i;
		}
		return resultado;
	}
	public int sumarArray(int[] numeros) {
		int resultado = 0;
		return resultado;
	}

}
