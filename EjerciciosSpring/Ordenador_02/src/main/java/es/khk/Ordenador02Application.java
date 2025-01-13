package es.khk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import es.khk.modelo.entidad.Ordenador;

@SpringBootApplication
public class Ordenador02Application {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(Ordenador02Application.class, args);
		Ordenador o1 = context.getBean("ordenador", Ordenador.class);
		System.out.println(o1);
	}

}
