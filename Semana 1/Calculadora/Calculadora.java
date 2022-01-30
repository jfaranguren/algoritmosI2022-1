import java.util.Scanner;

/*
 * Descripción del programa: 
 * La clase Calculadora es un programa que imprime por consola el resultado de las operaciones suma, resta, multiplicación y división
 * a partir de dos números proporcionados por el usuario
 *
 * Entradas: double numero1 y double numero2, los números que ingresa el usuario para ejecutar las operaciones
 * Salidas: double suma, double resta, double multiplicacion, double division y double modulo, los resultados de cada una de las operaciones
 *
 * Ejemplo: Sean numero1=3 y numero2=4 
 * Mensaje de retorno por consola: 
 * 		El resultado de la suma es: 7.0
 *  	El resultado de la resta es: -1.0
 *		El resultado de la multiplicación es: 12.0
 *		El resultado de la división es: 0.75
 *		El resultado del modulo es: 3
 */
public class Calculadora {
	
	public static void main(String[] args) {
        
		Scanner lector = new Scanner(System.in); //Creamos un objeto tipo Scanner para leer información por consola
		
		System.out.println("Digite a continuacion el primer numero:");

		double numero1 = lector.nextDouble(); //La instrucción nextDouble() permite obtener el siguiente número ingresado por el usuario por consola.
		
		System.out.println("Digite a continuacion el segundo numero:");

		double numero2 = lector.nextDouble();
		
		String resultado = "";
		
		double suma = numero1+numero2;
		
		resultado+="El resultado de la suma es: "+suma+"\n";
		
		double resta = numero1-numero2;
		
		resultado+="El resultado de la resta es: "+resta+"\n";
		
		double multiplicacion = numero1*numero2;
		
		resultado+="El resultado de la multiplicacion es: "+multiplicacion+"\n";
		
		double division = numero1/numero2;
		
		resultado+="El resultado de la division es: "+division+"\n";
		
		double modulo = numero1%numero2;
		
		resultado+="El resultado del modulo es: "+modulo+"\n";
						
		System.out.println(resultado);
		
    }
}





