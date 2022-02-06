import java.util.Scanner;

/**
 * <pre>
 * <strong>Descripción del programa:</strong>
 * 	La clase Calculadora es un programa que imprime por consola el resultado de las operaciones suma, resta, 
 *	multiplicación, división y residuo a partir de dos números proporcionados por el usuario
 * 
 * <strong>Ejemplo:</strong> 
 *	Primer número: 3
 *	Segundo número: 4 
 *
 * <strong>Mensaje de retorno por consola:</strong> 
 *	El resultado de la suma es: 7.0
 *	El resultado de la resta es: -1.0
 *	El resultado de la multiplicación es: 12.0
 *	El resultado de la división es: 0.75 
 *	El resultado del módulo es: 3
 * </pre>
 */
public class CalculadoraMetodos {
	
	public static void main(String[] args) {
        
		Scanner lector = new Scanner(System.in); //Creamos un objeto tipo Scanner para leer información por consola
		
		System.out.println("Digite a continuacion el primer numero:");

		double numero1 = lector.nextDouble(); //La instrucción nextDouble() permite obtener el siguiente número ingresado por el usuario por consola.
		
		System.out.println("Digite a continuacion el segundo numero:");

		double numero2 = lector.nextDouble();
		
		String resultado = "";
		
		resultado+="El resultado de la suma es: "+suma(numero1,numero2)+"\n";
			
		resultado+="El resultado de la resta es: "+resta(numero1,numero2)+"\n";
		
		resultado+="El resultado de la multiplicacion es: "+multiplicacion(numero1,numero2)+"\n";
		
		resultado+="El resultado de la division es: "+division(numero1,numero2)+"\n";
		
		resultado+="El resultado del modulo es: "+modulo(numero1,numero2)+"\n";
						
		System.out.println(resultado);
		
    }
	
	/**<pre>
	 *<strong>Descripcion:</strong> El metodo suma permite obtener el resultado de sumar dos numeros
	 *<strong>pre:</strong> No aplica
	 *<strong>pos:</strong> No aplica
	 *@param n1 <strong>double</strong> Primer numero a operar
	 *@param n2 <strong>double</strong> Segundo numero a operar
	 *@return n3 <strong>double</strong> Resultado de la suma de n1 y n2
	 *</pre>
	*/
	public static double suma(double n1, double n2) {
		double n3 = n1+n2;
		return n3;
	}

	public static double resta(double n1, double n2) {
		double n3 = n1-n2;
		return n3;
	}

	public static double multiplicacion(double n1, double n2) {
		double n3 = n1*n2;
		return n3;
	}

	public static double division(double n1, double n2) {
		double n3 = n1/n2;
		return n3;
	}

	public static double modulo(double n1, double n2) {
		double n3 = n1%n2;
		return n3;
	}

}





