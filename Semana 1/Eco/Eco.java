import java.util.Scanner; //Debemos importar la clase Scanner para poder usar objetos de este tipo en el programa

/*
 * Descripción del programa: 
 * La clase Eco es un programa que imprime por consola cualquier mensaje que el usuario escriba
 */
public class Eco { // Encabezado de clase
	
	public static void main(String[] args) { // Encabezado de método
        
		Scanner lector = new Scanner(System.in); //Creamos un objeto tipo Scanner para leer información por consola
		
		System.out.println("Digite a continuacion su mensaje, Eco lo enviara de vuelta:"); 
		
		//Creamos un objeto tipo String para almacenar la información obtenida
		String mensaje = lector.nextLine(); 
		//La instrucción nextLine() permite obtener la siguiente linea de caracteres ingresada por el usuario por consola.
				
		System.out.println("Eco dice: "+mensaje);
		
    }
}





