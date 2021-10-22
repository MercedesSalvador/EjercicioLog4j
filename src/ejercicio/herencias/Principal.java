package ejercicio.herencias;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;



public class Principal {
	private static Logger logger = LogManager.getLogger(Principal.class);
	
	public static void main(String... args) {
		
		int a;
		Caballo caballo1;

		// CONSTRUCTOR POR DEFECTO, NO ASIGNA VALORES
		caballo1 = new Caballo();
		System.out.println(caballo1.getColor());
		System.out.println(caballo1.getEdad());

		caballo1 = new Caballo("gris");
		caballo1.getEdad();

		Caballo caballo2;

		caballo2 = new Caballo("negro", 2);

		System.out.println(caballo2.getColor());
		caballo2.setColor("blanco");
		System.out.println(caballo2.getColor());

		Establo establo = new Establo();
		
		logger.info("aquí vemos los animales que hay en el establo " );
		
		System.out.println(establo.getCaballosTotales());
		establo.insertarCaballo(caballo1);
		establo.insertarCaballo(caballo1);
		establo.insertarCaballo(caballo2);
		System.out.println(establo.getCaballosTotales());
		establo.sacarCaballo(caballo1);

		if (establo.eliminarCaballoPorPosicion(2)) {
			System.out.println("Eliminacion  correcta en esa posicion");
		} else {
			System.out.println("En esta posicion no hay caballo");
		}
		
		System.out.println(establo.getCaballosTotales());
		
		establo.devolverCaballoPorPosicion(caballo1,1);
		System.out.println(establo.getCaballosTotales());
		establo.devolverCaballoPorPosicion(caballo2,2);
		System.out.println(establo.getCaballosTotales());
		
		establo.mostrarEstablo();
		establo.sacarCaballo(caballo1);
		establo.mostrarEstablo();
		
	}

}
