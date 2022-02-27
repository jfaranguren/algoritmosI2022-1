package ui;

import java.util.Scanner;

/**
 * <pre>
 * <strong>Descripci�n del programa: </strong> La clase
 * EntrenamientoCiclismoRigo es un programa que permite al usuario registrar sus
 * entrenamientos diarios por distancia y tiempo, consultar sus estad�sticas,
 * generales y promedio, y comparar sus avances contra una meta establecida,
 * para dos modalidades de competencia diferentes.
 * 
 * <strong>Inputs:</strong> int opcionPrincipal, int opcionModalidad, double
 * distancia, int tiempo <strong>Outputs:</strong> Mensajes por consola para el
 * Men� y los resultados de cada consulta double para la distancia y el
 * rendimiento
 * </pre>
 */
public class EntrenamientoCiclismoRigo {

	public static Scanner lector = new Scanner(System.in);

	private final static double METADISTANCIAMONTA�A = 250.0;
	private final static double METADISTANCIACONTRARRELOJ = 200.0;

	private final static double METARENDIMIENTOMONTA�A = 0.59;
	private final static double METARENDIMIENTOCONTRARRELOJ = 0.72;

	public static double entrenamientoDistanciaMonta�a = 0;
	public static double entrenamientoDistanciaContrarreloj = 0;

	public static int entrenamientoTiempoMonta�a = 0;
	public static int entrenamientoTiempoContrarreloj = 0;

	public static int diasEntrenamientoMonta�a = 0;
	public static int diasEntrenamientoContrarreloj = 0;

	public static void main(String[] args) {

		desplegarMenuPrincipal();
	}

	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo desplegarMenuPrincipal presenta al usuario las funcionalidades del programa,
	 *permiti�ndole seleccionar alguna e invocando los metodos asociados a cada funcionalidad
	 *<strong>pre:</strong> lector <strong>Scanner</strong> debe estar inicializado
	 *<strong>pos:</strong> No aplica
	 * </pre>
	 */
	public static void desplegarMenuPrincipal() {

		System.out.println("Bienvenido Rigo a tu sistema personalizado de entrenamiento");

		boolean parada = false;

		do {

			System.out.println("\nDigite una opci�n");
			System.out.println("1. Registrar entrenamiento");
			System.out.println("2. Consultar total recorrido y rendimiento acumulado");
			System.out.println("3. Consultar el promedio diario recorrido");
			System.out.println("4. Comparar resultados contra meta");
			System.out.println("0. Salir");

			int opcionPrincipal = lector.nextInt();

			switch (opcionPrincipal) {

			case 1:

				while (!parada) {
					System.out.println("\nDigite una modalidad");
					System.out.println("1. Monta�a");
					System.out.println("2. Contrarreloj");
					int opcionModalidad = lector.nextInt();

					if (opcionModalidad == 1 || opcionModalidad == 2) {
						parada = true;
						registrarEntrenamiento(opcionModalidad);
					} else {
						System.out.println("Debe digitar una opci�n de modalidad v�lida");
					}

				}
				parada = false;
				break;
			case 2:
				consultarEstadisticas();
				break;
			case 3:
				calcularPromedioDiarioRecorrido();
				break;
			case 4:
				consultarEntrenamientoMeta();
				break;
			case 0:
				System.out.println("Suerte en el entrenamiento! Adios.");
				parada = true;
				break;
			default:
				System.out.println("Debe digitar una opci�n v�lida");
				break;

			}

		} while (!parada);

	}

	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo registrarEntrenamiento permite registrar la informaci�n 
	 *de distancia recorrida y tiempo empleado en un entrenamiento de acuerdo al tipo de modalidad
	 *<strong>pre:</strong> lector <strong>Scanner</strong> debe estar inicializado
	 *<strong>pre:</strong> entrenamientoDistanciaMonta�a <strong>double</strong> debe estar inicializada
	 *<strong>pre:</strong> entrenamientoDistanciaContrarreloj <strong>double</strong> debe estar inicializada
	 *<strong>pre:</strong> entrenamientoTiempoMonta�a <strong>int</strong> debe estar inicializada
	 *<strong>pre:</strong> entrenamientoTiempoContrarreloj <strong>int</strong> debe estar inicializada
	 *<strong>pre:</strong> diasEntrenamientoMonta�a <strong>int</strong> debe estar inicializada
	 *<strong>pre:</strong> diasEntrenamientoContrarreloj <strong>int</strong> debe estar inicializada
	 *@param modalidad <strong>int</strong> C�digo de la modalidad a registrar, 1. Monta�a, 2. Contrarreloj
	 * </pre>
	 */
	public static void registrarEntrenamiento(int modalidad) {

		System.out.println("Digite el n�mero de kil�metros (km) recorridos en esta sesi�n de entrenamiento");
		double distancia = lector.nextDouble();

		System.out.println("Digite el tiempo, en minutos (min), empleado en esta sesi�n de entrenamiento");
		int tiempo = lector.nextInt();

		switch (modalidad) {

		case 1:
			entrenamientoDistanciaMonta�a += distancia;
			entrenamientoTiempoMonta�a += tiempo;
			diasEntrenamientoMonta�a++;
			break;

		case 2:
			entrenamientoDistanciaContrarreloj += distancia;
			entrenamientoTiempoContrarreloj += tiempo;
			diasEntrenamientoContrarreloj++;
			break;
		}

	}

	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo consultarEstadisticas permite consultar la informaci�n 
	 *de distancia recorrida y rendimiento de todos los entrenamientos por tipo de modalidad
	 *<strong>pre:</strong> entrenamientoDistanciaMonta�a <strong>double</strong> debe estar inicializada
	 *<strong>pre:</strong> entrenamientoDistanciaContrarreloj <strong>double</strong> debe estar inicializada
	 *<strong>pre:</strong> entrenamientoTiempoMonta�a <strong>int</strong> debe estar inicializada
	 *<strong>pre:</strong> entrenamientoTiempoContrarreloj <strong>int</strong> debe estar inicializada
	 * </pre>
	 */
	public static void consultarEstadisticas() {

		System.out.println("Este es el resumen de tus entrenamientos");
		
		System.out.println("\nModalidad: Monta�a");
		System.out.println("------------------");
		
		
		if(entrenamientoTiempoMonta�a<=0) {
			System.out.println("A�n no has relizado entrenamiento en Monta�a");
		}else {
			System.out.println("Distancia recorrida: " + entrenamientoDistanciaMonta�a+" km");
			System.out.println("Rendimiento: " + entrenamientoDistanciaMonta�a / entrenamientoTiempoMonta�a +" km/min");
		}
		
		System.out.println("\nModalidad: Contrarreloj");
		System.out.println("------------------");
		
		if(entrenamientoTiempoContrarreloj<=0) {
			System.out.println("A�n no has relizado entrenamiento en Contrareloj");
		}else {
		System.out.println("Distancia recorrida: " + entrenamientoDistanciaContrarreloj+" km");
		System.out.println("Rendimiento: " + entrenamientoDistanciaContrarreloj / entrenamientoTiempoContrarreloj+" km/min");
		}
	}

	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo calcularPromedioDiarioRecorrido permite consultar la informaci�n 
	 *de distancia media recorrida por tipo de modalidad
	 *<strong>pre:</strong> entrenamientoDistanciaMonta�a <strong>double</strong> debe estar inicializada
	 *<strong>pre:</strong> entrenamientoDistanciaContrarreloj <strong>double</strong> debe estar inicializada
	 *<strong>pre:</strong> entrenamientoDistanciaSprint <strong>double</strong> debe estar inicializada
	 *<strong>pre:</strong> diasEntrenamientoMonta�a <strong>int</strong> debe estar inicializada
	 *<strong>pre:</strong> diasEntrenamientoContrarreloj <strong>int</strong> debe estar inicializada
	 *<strong>pre:</strong> diasEntrenamientoSprint <strong>int</strong> debe estar inicializada
	 * </pre>
	 */
	public static void calcularPromedioDiarioRecorrido() {

		System.out.println("Este es el promedio diario de recorridos");

		System.out.println("\nModalidad: Monta�a");
		System.out.println("------------------");
		
		if(entrenamientoTiempoMonta�a<=0) {
			System.out.println("A�n no has relizado entrenamiento en Monta�a");
		}else {
			System.out.println("Distancia media recorrida: " + entrenamientoDistanciaMonta�a / diasEntrenamientoMonta�a+" km");
		}
		

		System.out.println("\nModalidad: Contrarreloj");
		System.out.println("------------------");
		
		if(entrenamientoTiempoContrarreloj<=0) {
			System.out.println("A�n no has relizado entrenamiento en Contrarreloj");
		}else {
			System.out.println("Distancia media recorrida: " + entrenamientoDistanciaContrarreloj / diasEntrenamientoContrarreloj+" km");
		}
		
	}

	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo consultarEntrenamientoMeta permite consultar la informaci�n 
	 *de distancia recorrida y rendimiento alcanzados en el entrenamiento, distancia recorrida y rendimiento meta
	 *y calcula la distancia y rendimiento faltantes
	 *<strong>pre:</strong> entrenamientoDistanciaMonta�a <strong>double</strong> debe estar inicializada
	 *<strong>pre:</strong> entrenamientoDistanciaContrarreloj <strong>double</strong> debe estar inicializada
	 *<strong>pre:</strong> entrenamientoDistanciaSprint <strong>double</strong> debe estar inicializada
	 *<strong>pre:</strong> entrenamientoTiempoMonta�a <strong>int</strong> debe estar inicializada
	 *<strong>pre:</strong> entrenamientoTiempoContrarreloj <strong>int</strong> debe estar inicializada
	 *<strong>pre:</strong> entrenamientoTiempoSprint <strong>int</strong> debe estar inicializada
	 * </pre>
	 */

	public static void consultarEntrenamientoMeta() {

		System.out.println("Las metas de entrenamiento son las siguientes:");

		System.out.println("\nModalidad: Monta�a");
		System.out.println("------------------");
		System.out.println("Distancia objetivo: " + METADISTANCIAMONTA�A+" km");
		System.out.println("Rendimiento objetivo: " + METARENDIMIENTOMONTA�A +" km/min");
		
		if(entrenamientoTiempoMonta�a<=0) {
			System.out.println("\n�A�n no has relizado entrenamientos en Monta�a!");
			System.out.println("\nDistancia faltante: " + METADISTANCIAMONTA�A+" km");
			System.out.println("Rendimiento faltante: " + METARENDIMIENTOMONTA�A+ " km/min");
		}else {
			System.out.println("\nDistancia recorrida: " + entrenamientoDistanciaMonta�a+" km");
			System.out.println("Rendimiento: " + entrenamientoDistanciaMonta�a / entrenamientoTiempoMonta�a + " km/min");

			if (METADISTANCIAMONTA�A - entrenamientoDistanciaMonta�a <= 0) {
				System.out.println("\nFelicitaciones! Lograste la meta de distancia de Monta�a");
			} else {
				System.out.println("\nDistancia faltante: " + (METADISTANCIAMONTA�A - entrenamientoDistanciaMonta�a)+" km");
			}

			if (METARENDIMIENTOMONTA�A - (entrenamientoDistanciaMonta�a / entrenamientoTiempoMonta�a) <= 0) {
				System.out.println("\nFelicitaciones! Lograste la meta de rendimiento de Monta�a");

			} else {
				System.out.println("\nRendimiento faltante: "
						+ (METARENDIMIENTOMONTA�A - (entrenamientoDistanciaMonta�a / entrenamientoTiempoMonta�a))+ " km/min");
			}
		}
		
		System.out.println("\nModalidad: Contrarreloj");
		System.out.println("------------------");
		System.out.println("Distancia objetivo: " + METADISTANCIACONTRARRELOJ+" km");
		System.out.println("Rendimiento objetivo: " + METARENDIMIENTOCONTRARRELOJ+ " km/min");
		
		if(entrenamientoTiempoContrarreloj<=0) {
			System.out.println("\n�A�n no has relizado entrenamientos en Contrarreloj!");
			System.out.println("\nDistancia faltante: " + METADISTANCIACONTRARRELOJ+" km");
			System.out.println("Rendimiento faltante: " + METARENDIMIENTOCONTRARRELOJ+ " km/min");
		}else {
			System.out.println("\nDistancia recorrida: " + entrenamientoDistanciaContrarreloj+" km");
			System.out.println("Rendimiento: " + entrenamientoDistanciaContrarreloj / entrenamientoTiempoContrarreloj+ " km/min");

			if (METADISTANCIACONTRARRELOJ - entrenamientoDistanciaContrarreloj <= 0) {
				System.out.println("\nFelicitaciones! Lograste la meta de distancia de Contrarreloj"+ " km/min");
			} else {
				System.out
						.println("\nDistancia faltante: " + (METADISTANCIACONTRARRELOJ - entrenamientoDistanciaContrarreloj)+" km");
			}

			if (METARENDIMIENTOCONTRARRELOJ - (entrenamientoDistanciaContrarreloj / entrenamientoTiempoContrarreloj) <= 0) {
				System.out.println("\nFelicitaciones! Lograste la meta de rendimiento de Contrarreloj");

			} else {
				System.out.println("\nRendimiento faltante: " + (METARENDIMIENTOCONTRARRELOJ
						- (entrenamientoDistanciaContrarreloj / entrenamientoTiempoContrarreloj))+ " km/min");
			}
		}
	}
}
