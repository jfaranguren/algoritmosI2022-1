import java.util.Scanner;
import java.lang.Math;

/*
 * Descripción del programa: 
 * La clase SimuladorFinancieroAnual es un programa que, haciendo uso de las fórmulas asociadas al interés compuesto,
 * imprime por consola el número de años que el usuario debe ahorrar, de acuerdo a una tasa de interés y capital final fijos 
 * y el capital inicial ahorrado dado por el usuario.
 * 
 * Entradas: double capitalInicial
 * Salidas: double aniosAhorro
 *
 * Ejemplo: capitalInicial: 100.000
 * Mensaje de por consola: 
 * 		El número de años a ahorrar es: 12.983076209573193
 *      El numero de anios a ahorrar es (redondeado): 13.0
 */
public class SimuladorFinancieroAnual {
	
	public static void main(String[] args) {
        
		Scanner lector = new Scanner(System.in);
		
		double TASA = 0.425761;
		double CAPITALFINAL = 10000000;
		
		System.out.println("Digite a continuacion el capital inicial de ahorro:");

		double capitalInicial = lector.nextDouble();
		
		double aniosAhorro = (Math.log10(CAPITALFINAL/capitalInicial))/Math.log10(1+TASA);
		
		double aniosRedondeado = Math.ceil(aniosAhorro);
								
		System.out.println("El numero de anios a ahorrar es: "+aniosAhorro);
		
		System.out.println("El numero de anios a ahorrar es (redondeado): "+aniosRedondeado);
		
    }
}





