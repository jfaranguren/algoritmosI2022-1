import java.util.Scanner; //Debemos importar la clase Scanner para poder usar objetos de este tipo en el programa

/*
 * Descripción del programa: 
 * La clase NumeroMayor es un programa que, a partir de dos números enteros proporcionados por el usuario, imprime por consola el mayor de los dos.
 * En caso de que los dos números sean iguales, se muestra un mensaje al usuario indicando esta información.
 *
 * Ejemplo 1: Número 1: 3, Número 2: 4, Mensaje de retorno por consola: El número mayor es 4 
 * Ejemplo 2: Número 1: 5, Número 2: 5, Mensaje de retorno por consola: Los números proporcionados son iguales 
 */
public class NumeroMayor { // Encabezado de clase
	
	public static void main(String[] args) { // Encabezado de método
        
		Scanner lector = new Scanner(System.in); //Creamos un objeto tipo Scanner para leer información por consola
		
		System.out.println("Digite a continuacion el primer numero a evaluar:");

		int numero1 = lector.nextInt(); //La instrucción nextInt() permite obtener el siguiente número entero ingresado por el usuario por consola.
		
		System.out.println("Digite a continuacion el segundo numero a evaluar:");

		int numero2 = lector.nextInt();
		
		if(numero1>numero2){
			System.out.println("El numero mayor es: "+numero1);
		} else if(numero1<numero2){
			System.out.println("El numero mayor es: "+numero2);
		} else{
			System.out.println("Los numeros proporcionados son iguales");
			
		}
    }
}
