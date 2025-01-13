package configuracion;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import modelo.entidades.Director;
import modelo.entidades.Pelicula;
import modelo.negocio.GestorPelicula;
import modelo.persistencia.DaoPelicula;

@Configuration
public class ConfiguracionSpring {
	
	// El Tipo del metodo es la clase del bean y la ID sera el nombre del metodo
	@Bean
	@Scope("prototype")
	// <bean id="director" class="modelo.entidad.Director" scope="prototype">
	public Director director() {
		return new Director();
	}
	
	// Cuando le metemos un parametro es como usar ref (autowired). Esto sería un Autowired
	@Bean
	@Scope("prototype")
	// Si existe un bean de tipo director dentro del contexto de Spring
	// se inyectaria a traves del parametro. EN este caso entraría el 
	// bean cuyo nombre es "Steven Spilber"
	public Pelicula pelicula1(Director director) {
		Pelicula p = new Pelicula();
		p.setDirector(director);
		p.setGenero("Sci-Fi");
		return p;
	}
	@Bean

	public Pelicula pelicula2(Director director) {
		Director d = new Director();
		d.setNombre("George Lucas");
		Pelicula p = new Pelicula();
		p.setDirector(director);
		p.setTitulo("La Guerra de las Galaxias");
		return p;
	}
	@Bean
	public DaoPelicula daoPelicula() {
		DaoPelicula daoPelicula = new DaoPelicula();
		daoPelicula.setListaPelicula(new ArrayList<Pelicula>());
		daoPelicula.setNumeroMaximoPeliculas(3);
		return daoPelicula;
	}
	@Bean
	public GestorPelicula gestorPelicula(DaoPelicula daopelicula) {
		GestorPelicula gp = new GestorPelicula();
		gp.setDaoPelicula(daopelicula);
		return gp;
		
	}

}
