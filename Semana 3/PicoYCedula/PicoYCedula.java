import java.util.Scanner; 

/**
 * <pre>
 * <strong>Descripción del programa: </strong>
 * La clase PicoYCedula es un programa que, a partir del último digito de la cédula y el número del día proporcionados por el usuario, 
 * imprime por consola si el usuario puede o no salir de su casa.
 * 
 * <strong>Inputs:</strong> int lastDigit, int day
 * <strong>Outputs:</strong> String message
 *
 * Example 1: lastDigit: 3, day: 4, Mensaje de retorno por consola: Usted no puede salir, permanezca en su casa
 * Example 2: lastDigit: 7, day: 23, Mensaje de retorno por consola: Usted puede salir, recuerde las medidas de bioseguridad
 * </pre>
 */
public class PicoYCedula {
	
	public static void main(String[] args) { // Encabezado de método
        
		Scanner lector = new Scanner(System.in); //Creamos un objeto tipo Scanner para leer información por consola
		
		System.out.println("Digite a continuacion el ultimo digito de su cedula:");

		int lastDigit = lector.nextInt(); //La instrucción nextInt() permite obtener el siguiente número entero ingresado por el usuario por consola.
		
		System.out.println("Digite a continuacion el numero del dia de hoy:");

		int day = lector.nextInt();
		
		System.out.println(determinarPicoYCedula(lastDigit,day));
		
    }
	
	/**<pre>
	 *<strong>Descripcion:</strong> El metodo determinarPicoYCedula permite determinar si la persona puede o no salir, 
	 *dado el último número de cédula y el número del día
	 *<strong>pre:</strong> No aplica
	 *<strong>pos:</strong> No aplica
	 *@param lastDigit <strong>int</strong> Último dígito de la cédula
	 *@param day <strong>int</strong> Número del día
	 *@return message <strong>String</strong> Mensaje informativo
	 *</pre>
	*/
	
	public static String determinarPicoYCedula(int lastDigit, int day){

		String message = "";
	
		if (lastDigit % 2 == 0) {

			if (day % 2 == 0) {
				message += "Usted puede salir, recuerde las medidas de bioseguridad";
			} else {
				message += "Usted no puede salir, permanezca en su casa";
			}

		} else {

			if (day % 2 != 0) {
				message += "Usted puede salir, recuerde las medidas de bioseguridad";
			} else {
				message += "Usted no puede salir, permanezca en su casa";
			}
		}		

		return message;
	}		
	
	
	
	
}
