package MiniproyectoFunval;
import java.util.Scanner;

public class Alta {
	
	public int numeroempleados = 3;
	public String [] listaempleados = new String [numeroempleados];
	public int [] listaedades = new int [numeroempleados];
	public float [] listasalarios = new float [numeroempleados];
	public int [] idempleado = new int [numeroempleados];
		
	public void altaEmpleado() {
		
						
		for (int i = 0; i < listaempleados.length; i++) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Proporciona el nombre del empleado: ");
		String nombre = sc.nextLine();
		listaempleados[i] = nombre;
		
		System.out.println("Proporciona la edad del empleado: ");
		int edad = sc.nextInt();
		listaedades[i] = edad;
		
		System.out.println("Proporciona el salario del empleado: ");
		float salario = sc.nextFloat();
		listasalarios[i] = salario;
		
		idempleado[i] = i;		
		
		Empleado persona = new Empleado(nombre, edad, salario);
		
		persona.MuestraInfo ();
		
		}

	}
	
	public void listaEmpleados() {
		
		System.out.println("ID //// Empleado ////// Edad //// Salario ////");
		for (int i = 0; i < numeroempleados; i++) {
		System.out.println(idempleado[i] + "  "+ listaempleados[i] + " ** " + listaedades[i] + " **** " + listasalarios[i] );
		System.out.println("");
		}
		
	}
	
	
	public void aumentoSalario() {
		Scanner sc = new Scanner(System.in);
		System.out.println("DIGITA EL ID DEL EMPLEADO PARA AUMENTAR SU SUELDO");
		int id = sc.nextInt();
		System.out.println("CUAL ES EL PORCENTAJE % DE AUMENTO DE SUELDO");
		float porcentaje = sc.nextFloat();				
		
		if (id == idempleado[id]) {
			
			float salario = listasalarios[id];
			float aumento = (porcentaje/100) * salario;
			float salarioNuevo = salario + aumento;
			System.out.println("El nuevo salario es: " + salarioNuevo);
		}
	}

	public void darDeBaja() {
		Scanner sci = new Scanner(System.in);
		System.out.println("DIGITA EL ID DEL EMPLEADO PARA DARLE DE BAJA");
		int idbaja = sci.nextInt();
		
		for (int i = idbaja; i < numeroempleados - 1; i++) {
			idempleado[i] = idempleado[i + 1];
			listaempleados[i] = listaempleados[i +1];
			listaedades[i] = listaedades[i + 1];
			listasalarios[i] = listasalarios[i +1];
			}
			
		System.out.println("ID //// Empleado ////// Edad //// Salario ////");
		for (int i = 0; i < numeroempleados -1; i++) {
		System.out.println(idempleado[i] + "  "+ listaempleados[i] + " ** " + listaedades[i] + " **** " + listasalarios[i] );
		System.out.println("");	
		}
	}
}

