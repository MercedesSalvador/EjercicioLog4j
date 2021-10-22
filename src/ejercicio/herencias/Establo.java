package ejercicio.herencias;

public class Establo {

	Caballo[] lista;
	final int NUM_CABALLOS = 20;

	Establo() {
		// INICIALIZA A VALORES POR DEFECTO(null, porque son objetos Caballo) LA
		// ESTRUCTURA
		lista = new Caballo[NUM_CABALLOS];
	}

	public int getCaballosTotales() {
		int resultado = 0;

		for (int i = 0; i < lista.length; i++) {

			if (lista[i] != null) {
				resultado++;
			}

		}
		return resultado;
	}

	public void insertarCaballo(Caballo miCaballo) {
		boolean insertado = false;
		int controlInsercion = 0;

		for (int i = 0; i < lista.length; i++) {

			if (lista[i] == null && controlInsercion == 0) {
				lista[i] = miCaballo;
				controlInsercion = 1;
			}

		}
	}

	public void sacarCaballo(Caballo miCaballo) {

		int contador = 0;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				if (lista[i].getColor() == miCaballo.getColor()) { //SACAR CABALLOS DE CIERTO COLOR
					lista[i] = null;
					contador++;
				}

			}
		}

		System.out.println("El numero de caballos eliminados es: " + contador);
	}

	public boolean eliminarCaballoPorPosicion(int posicion) {
		boolean resultado = false;

		if (lista[posicion] != null) {

			lista[posicion] = null;
			resultado = true;

		}
		return resultado;
	}
	
	public void devolverCaballoPorPosicion (Caballo miCaballo, int posicion) {
		
		if(lista[posicion] == null) {
			lista[posicion] = miCaballo;
			
		} else {
			System.out.println("La posición esta ocupada");
		}
	}
	
	public void mostrarEstablo() {
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] !=null) {
				System.out.println("Hay un caballo " + lista[i].color );
			}
		}
		
		
		
		
		
	}
	

}
