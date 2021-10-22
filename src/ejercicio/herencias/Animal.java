package ejercicio.herencias;

public class Animal {
	
	private String tipoAnimal; //vaca, perro, gato, cerdo, oveja, etc.
	private int edad;
	private double peso;
	private int patas;
	
	//CONSTRUCTOR
	public Animal(String tipoAnimal, int edad, double peso, int patas) {
		super();
		this.tipoAnimal = tipoAnimal;
		this.edad = edad;
		this.peso = peso;
		this.patas = patas;
	}

	// METODOS PARA OPERAR
	public String getTipoAnimal() {
		return tipoAnimal;
	}


	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public int getPatas() {
		return patas;
	}


	public void setPatas(int patas) {
		this.patas = patas;
	}

	
	
	
}
