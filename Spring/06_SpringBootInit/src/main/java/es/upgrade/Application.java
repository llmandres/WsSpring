package es.upgrade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import es.upgrade.modelo.entidades.Director;
import es.upgrade.modelo.entidades.Pelicula;

/*
 * ESTO VIENE DEL REPOSITORIO DE WsSpring de Felix (fdepablo)
 *
 * @SpringBootApplication engloba 3 anotaciones importantes
 * 
 * 1- @Configuration, decimos que esta clase va a tener Beans
 * para dar de alta en el contexto de Spring, es decir, metodos
 * anotados con @Bean 
 * 
 * 2- @ComponentScan, buscar anotaciones de Spring dentro de la aplicacion
 * de manera automatica, va a buscarlas en las clases de este paquete y en 
 * todos los paquetes hijos
 * 
 * 3- @EnableAutoConfiguration, decimos a Spring que cuando arranque la
 * aplicacion instancie todos los beans que necesite para que funcione correctamente
 * Lo beans que creara, irá en funcion de los staters que hemos añadido a 
 * nuestra aplicacion. Por ejemplo, si añadimos un stater web, automaticamente
 * se configurara un Tomcat embebido en el que se desplegara la app. Si por 
 * ejemplo, hemos añadido una base de datos y JPA Data, se nos creara automaticamete
 * el data source y los drives de conexion a la bbdd. Incluso por defecto, si 
 * utilizaramos una bbdd que pueda ser creada en memoria (como H2), spring levataria
 * por defecto dicha base de datos en memoria
 *  
 */ 
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//Esta sentencia arranca el contexto de spring
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		Pelicula p = context.getBean("pelicula",Pelicula.class);
		System.out.println(p);
		
		Director d = context.getBean("director2",Director.class);
		System.out.println(d);
	}
	
	@Bean
	public Director director2() {
		return new Director();
	}

}
