package MiniproyectoFunval;


public class Empleado {
	
	String nombre;
	int edad;
	float salario;
	
	
	public Empleado(String nombre, int edad, float salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public void MuestraInfo() {
		System.out.println("EL nombre del empleado es: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Salario: " + salario);
	}

}
