package ejercicio.herencias;

public class Caballo {
	
	
	String color;
	int edad;
	
	
	// CONSTRUCTOR	
	public Caballo(String color, int edad) {
		super();
		this.color = color;
		this.edad = edad;
	}
	
	public Caballo(String color) {
		System.out.println("El caballo se va a crear con el color: " + color);
		this.color = color;
		
	}
	
	public Caballo() {
	this.edad=1;
	this.color="blanco";
		
	}
	
	// GET Y SET
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
	
	

}
