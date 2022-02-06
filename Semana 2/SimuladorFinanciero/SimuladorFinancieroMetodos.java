import java.util.Scanner;
import java.lang.Math;

/**
 *<pre>
 *<strong>Descripción del programa: </strong>
 * La clase SimuladorFinancieroMetodos es un programa que, haciendo uso de las fórmulas asociadas al interés compuesto,
 * imprime por consola el número de años que el usuario debe ahorrar, de acuerdo a un capital final fijo
 * y el capital inicial ahorrado y una tasa de interés dados por el usuario.
 * 
 * <strong>Entradas:</strong> double capitalInicial, double tasaInteres
 * <strong>Salidas:</strong> double aniosAhorro
 *
 * <strong>Ejemplo:</strong> capitalInicial: 100000 y tasaInteres: 0.03
 
 * <strong>Mensaje de retorno por consola:</strong> 
 *		El número de años a ahorrar es: 12.983076209573193
 *		El numero de anios a ahorrar(redondeado) es: 13.0
 *</pre>
 */
public class SimuladorFinancieroMetodos {
	
	public static void main(String[] args) {
        
		Scanner lector = new Scanner(System.in);
		
		double CAPITALFINAL = 10000000;
		
		System.out.println("Digite a continuacion el capital inicial de ahorro: ");

		double capitalInicial = lector.nextDouble();
		
		System.out.println("Digite a continuacion la tasa de interes mensual: ");

		double tasaInteres = lector.nextDouble();
		
		double aniosAhorro = calcularAnios(capitalInicial,CAPITALFINAL,tasaInteres);
		
		double aniosRedondeado = Math.ceil(aniosAhorro);
								
		System.out.println("El numero de anios a ahorrar es: "+aniosAhorro);
		
		System.out.println("El numero de anios a ahorrar es (redondeado): "+aniosRedondeado);
		
    }
	
	/**<pre>
	 *<strong>Descripcion:</strong> El metodo calcularAnios permite obtener el número de años que el usuario debe ahorrar, 
	 *dado el capital inicial, el capital final y la tasa de interés
	 *<strong>pre:</strong> No aplica
	 *<strong>pos:</strong> No aplica
	 *@param capitalInicial <strong>double</strong> Capital inicial que el usuario tiene ahorrado
	 *@param capitalFinal <strong>double</strong> Capital final que se espera obtener al final del tiempo de ahorro
	 *@param tasaInteres <strong>double</strong> Tasa de interés proporcionada por el banco a determinada periodicidad
	 *@return aniosAhorro <strong>double</strong> Número de años que el usuario debe ahorrar
	 *</pre>
	*/
	public static double calcularAnios(double capitalInicial, double capitalFinal, double tasaInteres){
	
	double aniosAhorro = 0;
	
	aniosAhorro = ((Math.log10(capitalFinal/capitalInicial))/Math.log10(1+tasaInteres))/12;
		
	return aniosAhorro;
	
	}
	
}





