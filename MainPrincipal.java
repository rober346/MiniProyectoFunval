package MiniproyectoFunval;
import java.util.Scanner;

class MainPrincipal {

	public static void main(String[] args) {
		int opcion;
		 Alta darAlta = new Alta();
	
		do {
			System.out.println("***** SISTEMA DE GESTION DE NOMINA *****");
			System.out.println("1. Dar de alta a empleado");
            System.out.println("2. Dar de baja a empleado");
            System.out.println("3. Aumento de salario");
            System.out.println("4. Lista de empleados");
            System.out.println("5. Salir");

            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
           
            
            switch (opcion){
                case 1:             
                    darAlta.altaEmpleado();
                    break;
                case 2:
                    darAlta.darDeBaja();
                    //darAlta.listaEmpleados();
                    break;
                case 3:
                	darAlta.listaEmpleados ();
                	darAlta.aumentoSalario();                   
                    break;
                case 4:
                    darAlta.listaEmpleados ();
                    break;
                case 5:
                	System.out.println("FINALIZADO");
                	sc.close();
                	break;
                
                default:
                    System.out.println("Selecciona una opcion correcta");       	
            }
        }while(opcion != 0);
		
	}
	
}
