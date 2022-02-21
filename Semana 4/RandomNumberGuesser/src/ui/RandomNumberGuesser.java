package ui;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * <strong>Descripci�n del programa: </strong> 
 * La clase RandomNumberGuesser es un programa que genera un n�mero aleatorio y 
 * le permite al usuario intentar adivinarlo en m�ximo 10 intentos
 * 
 * <strong>Inputs:</strong> int numeroUsuario
 * <strong>Outputs:</strong> Mensajes por consola
 *
 * Example: 
 * 1. El sistema genera un n�mero aleatorio
 * 2. Mensaje de retorno por consola: Intento 1:
 * 3. Usuario digita el n�mero 40
 * 4. Mensaje de retorno por consola: El n�mero proporcionado es mayor que el generado por el sistema, intente nuevamente
 * </pre>
 */

public class RandomNumberGuesser {

	public static Scanner lector = new Scanner(System.in);
	public static int[] memoria = { -1, -1, -1, -1,-1,-1,-1,-1,-1,-1};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bienvenido a RandomNumberGuesser");

		System.out.println(
				"El sistema ha generado un n�mero aleatorio entre 1 y 100, intente adivinarlo en hasta en 10 intentos");

		adivinarNumero();

	}

	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo advinarNumero permite determinar si el usuario adivina o no el numero 
	 *aleatorio generado por el programa, a partir de una serie de intentos (maximo 10) y respuestas del usuario 
	 *<strong>pre:</strong> lector <strong>Scanner</strong> debe estar inicializado
	 * </pre>
	 */
	private static void adivinarNumero() {
		// TODO Auto-generated method stub
		Random aleatorio = new Random();

		int numeroAleatorio = aleatorio.nextInt(99) + 1;

		boolean parada = false;
		int intentos = 0;

		while (!parada && intentos < 10) {

			System.out.println("\nIntento " + (intentos + 1) + ":");
			int numeroUsuario = lector.nextInt();
			
			while (buscarEnMemoria(numeroUsuario)) {
				System.out.println("El n�mero ingresado ya fue evaluado, por favor digita otro");
				numeroUsuario = lector.nextInt();
			}
			
			while (numeroUsuario<1||numeroUsuario>100) {
				System.out.println("El n�mero ingresado est� fuera del rango, por favor digite otro");
				numeroUsuario = lector.nextInt();
			}
			// A�adir a memoria
			memoria[intentos] = numeroUsuario;

			if (numeroUsuario == numeroAleatorio) {
				parada = true;
				System.out.println(
						"Felicitaciones, ha adivinado el n�mero! Le ha tomado " + (intentos + 1) + " intentos.");

			} else if (numeroUsuario < numeroAleatorio) {

				System.out
						.println("El n�mero proporcionado es menor que el generado por el sistema, intente nuevamente");
				intentos++;

			} else {
				System.out
						.println("El n�mero proporcionado es mayor que el generado por el sistema, intente nuevamente");
				intentos++;
			}

		}
		
		if(intentos>= 10) {
			System.out.println("\nEl n�mero era: "+numeroAleatorio+". Usted no ha logrado adivinarlo. Mejor suerte la pr�xima vez.");
		}
		
	}
	
	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo buscarEnMemoria recorrer el arreglo memoria 
	 *y determinar si el n�mero pasado por par�metro se encuentra almacenado en el arreglo
	 *<strong>pre:</strong> memoria <strong>int[]</strong> debe tener tama�o 3 y estar inicializado 
	 *<strong>pos:</strong> No aplica
	 *@param numeroGenerado <strong>int</strong> Numero a evaluar si se encuentra o no en memoria
	 *@return estaEnMemeoria <strong>boolean</strong> estaEnMemoria retorna true si el nuemero evaluado est� ya almacenado en memoria y false si no lo est�
	 * </pre>
	 */
	public static boolean buscarEnMemoria(int numeroGenerado) {

		boolean estaEnMemoria = false;

		for (int i = 0; i < memoria.length && !estaEnMemoria; i++) {

			if (memoria[i] == -1) {
				estaEnMemoria = estaEnMemoria || false;
			} else if (memoria[i] == numeroGenerado) {
				estaEnMemoria = estaEnMemoria || true;

			} else {
				estaEnMemoria = estaEnMemoria || false;
			}

		}

		return estaEnMemoria;

	}

}
