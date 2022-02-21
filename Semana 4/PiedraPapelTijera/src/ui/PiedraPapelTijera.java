package ui;

import java.util.Random;
import java.util.Scanner;


/**
 * <pre>
 * <strong>Descripción del programa: </strong> 
 * La clase PiedraPapelTijera es un programa que permite al usuario jugar piedra, papel o tijera
 * contra la computadora, almacenar los resultados de los juegos en un arreglo y consultarlos. 
 * 
 * <strong>Inputs:</strong> int seleccion
 * <strong>Outputs:</strong> Mensajes por consola
 *
 * Example: 
 * 1. Usuario selecciona Jugar
 * 2. El programa calcula su jugada, resultando en Piedra
 * 3. Usuario selecciona Piedra
 * 4. Mensaje de retorno por consola: Usted ha empatado :|
 * </pre>
 */

public class PiedraPapelTijera {

	public static String[] jugadas = { "Piedra", "Papel", "Tijera" };
	public static int[] victoriasDerrotasEmpates = { 0, 0, 0 };
	public static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean parada = false;

		System.out.println("Bienvenido a Piedra, Papel y Tijera");

		while (!parada) {

			System.out.println("Digite una opción\n 1. Jugar\n 2. Ver Resultados\n 3. Salir");
			int seleccion = lector.nextInt();

			switch (seleccion) {
			case 1:
				jugarPiedraPapelTijera();
				break;

			case 2:
				imprimirResultados();
				break;
			case 3:
				System.out.println("Adios!\n");
				parada = true;
				break;

			default:
				System.out.println("Debe digitar una opción valida\n");
				break;
			}

		}

	}
	
	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo jugarPiedraPapelTijera permite determinar la jugada del programa,
	 *solicitar la jugada al usuario y calcular el resultado del juego
	 *<strong>pre:</strong> lector <strong>Scanner</strong> debe estar inicializado
	 *<strong>pre:</strong> victoriasDerrotasEmpates <strong>int[]</strong> debe tener tamaño 3, estar inicializado y sus posiciones estar llenas de 0 
	 *<strong>pre:</strong> jugadas <strong>String[]</strong> debe tener tamaño 3, estar inicializado y sus posiciones estar llenas con las posibles jugadas: Piedra, Papel y Tijera
	 *<strong>pos:</strong> victoriasDerrotasEmpates <strong>int[]</strong> se modifica conforme a los resultados de los juegos
	 * </pre>
	 */

	public static void jugarPiedraPapelTijera() {

		Random aleatorio = new Random();
		String jugadaMaquina = jugadas[aleatorio.nextInt(3)];

		System.out.println("Seleccione su jugada\n1.Piedra\n2.Papel\n3.Tijera");
		int seleccion = lector.nextInt() - 1;

		String jugadaJugador = jugadas[seleccion];

		System.out.println("Usted ha seleccionado: " + jugadaJugador);
		System.out.println("La Maquina ha seleccionado: " + jugadaMaquina);

		if (jugadaMaquina.equals(jugadaJugador)) {
			victoriasDerrotasEmpates[2] = victoriasDerrotasEmpates[2] + 1;
			System.out.println("\nUsted ha empatado :|\n");
		}

		if ((jugadaMaquina.equals(jugadas[0]) && jugadaJugador.equals(jugadas[2]))
				|| (jugadaMaquina.equals(jugadas[1]) && jugadaJugador.equals(jugadas[0]))
				|| (jugadaMaquina.equals(jugadas[2]) && jugadaJugador.equals(jugadas[1]))) {
			victoriasDerrotasEmpates[1] = victoriasDerrotasEmpates[1] + 1;
			System.out.println("\nUsted ha perdido :(\n");
		}

		if ((jugadaJugador.equals(jugadas[0]) && jugadaMaquina.equals(jugadas[2]))
				|| (jugadaJugador.equals(jugadas[1]) && jugadaMaquina.equals(jugadas[0]))
				|| (jugadaJugador.equals(jugadas[2]) && jugadaMaquina.equals(jugadas[1]))) {
			victoriasDerrotasEmpates[0] = victoriasDerrotasEmpates[0] + 1;
			System.out.println("\nUsted ha ganado! :D\n");
		}

	}
	
	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo imprimir resultados permite al usuario consultar el histórico de los resultados de los juegos 
	 *desde la inicialización del programa
	 *<strong>pre:</strong> victoriasDerrotasEmpates <strong>int[]</strong> debe tener tamaño 3, estar inicializado y sus posiciones estar llenas de 0 
	 *<strong>pos:</strong> No aplica
	 * </pre>
	 */

	public static void imprimirResultados() {

		System.out.println("El histórico de resultados es el siguiente:");
		System.out.println("Victorias | Derrotas | Empates");
		System.out.println("--------- | -------- | -------");
		System.out.println("    "+victoriasDerrotasEmpates[0]+"     |    "+victoriasDerrotasEmpates[1]+"     |    "+ victoriasDerrotasEmpates[2]+"\n");
	

	}

}
