import java.util.Scanner;

/**
 * <pre>
 * <strong>Descripcion del programa:</strong>
 * 	La clase Comparadora enteros es un programa que imprime el resultado de comparar dos enteros  
 *	con los operadores mayor que, mayor o igual que, menor que, menor o igual que, igual y diferente
 * 
 * <strong>Ejemplo:</strong> 
 *	Primer numero: 4
 *	Segundo numero: 3 
 *
 * <strong>Mensaje de retorno por consola:</strong> 
 *	Seleccione la comparación a realizar
 *	1. Es a mayor que b?
 *	2. Es a mayor o igual que b?
 *	3. Es a menor que b?
 *	4. Es a menor o igual que b?
 *	5. Es a igual que b?
 *	6. Es a diferente de b?
 * 
 * Usuario selecciona 1
 * 
 * Mensaje de retorno por consola:
 * Si, a > b
 * 
 * </pre>
 */
public class ComparadoraMenu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido a Comparadora de 2 Enteros");
		System.out.println("Digite el primer entero (a)");
		int n1 = sc.nextInt();
		System.out.println("Digite el segundo entero (b)");
		int n2 = sc.nextInt();

		System.out.println("Seleccione la comparación a realizar");
		System.out.println("1. Es a mayor que b?");
		System.out.println("2. Es a mayor o igual que b?");
		System.out.println("3. Es a menor que b?");
		System.out.println("4. Es a menor o igual que b?");
		System.out.println("5. Es a igual que b?");
		System.out.println("6. Es a diferente de b?");

		int seleccion = sc.nextInt();

		switch (seleccion) {
		case 1:
			if (mayorQue(n1, n2)) {
				System.out.println("Si, a > b");
			} else {
				System.out.println("No, a <= b");
			}
			break;
		case 2:
			if (mayorIgualQue(n1, n2)) {
				System.out.println("Si, a >= b");
			} else {
				System.out.println("No, a < b");
			}
			break;
		case 3:
			if (menorQue(n1, n2)) {
				System.out.println("Si, a < b");
			} else {
				System.out.println("No, a >= b");
			}
			break;
		case 4:
			if (menorIgualQue(n1, n2)) {
				System.out.println("Si, a <= b");
			} else {
				System.out.println("No, a > b");
			}
			break;
		case 5:
			if (igual(n1, n2)) {
				System.out.println("Si, a = b");
			} else {
				System.out.println("No, a != b");
			}
			break;
		case 6:
			if (diferente(n1, n2)) {
				System.out.println("Si, a != b");
			} else {
				System.out.println("No, a == b");
			}
			break;

		default:
			System.out.println("Debe digitar una opcion valida");
			break;
		}

	}

	/**
	 * <pre>
		 *<strong>Descripcion:</strong> El metodo mayorQue permite obtener el resultado booleano luego de evaluar el operador ">" entre dos numeros enteros
		 *<strong>pre:</strong> No aplica
		 *<strong>pos:</strong> No aplica
		 *@param n1 <strong>double</strong> Primer numero a comparar
		 *@param n2 <strong>double</strong> Segundo numero a comparar
		 *@return <strong>boolean</strong> Resultado de la operacion n1">"n2
	 * </pre>
	 */
	public static boolean mayorQue(int n1, int n2) {
		return n1 > n2;
	}

	/**
	 * <pre>
		 *<strong>Descripcion:</strong> El metodo mayorIgualQue permite obtener el resultado booleano luego de evaluar el operador ">=" entre dos numeros enteros
		 *<strong>pre:</strong> No aplica
		 *<strong>pos:</strong> No aplica
		 *@param n1 <strong>double</strong> Primer numero a comparar
		 *@param n2 <strong>double</strong> Segundo numero a comparar
		 *@return <strong>boolean</strong> Resultado de la operacion n1">="n2
	 * </pre>
	 */
	public static boolean mayorIgualQue(int n1, int n2) {
		return n1 >= n2;
	}

	/**
	 * <pre>
		 *<strong>Descripcion:</strong> El metodo menorQue permite obtener el resultado booleano luego de evaluar el operador "<" entre dos numeros enteros
		 *<strong>pre:</strong> No aplica
		 *<strong>pos:</strong> No aplica
		 *@param n1 <strong>double</strong> Primer numero a comparar
		 *@param n2 <strong>double</strong> Segundo numero a comparar
		 *@return <strong>boolean</strong> Resultado de la operacion n1"<"n2
	 * </pre>
	 */
	public static boolean menorQue(int n1, int n2) {
		return n1 < n2;
	}

	/**
	 * <pre>
		 *<strong>Descripcion:</strong> El metodo menorIgualQue permite obtener el resultado booleano luego de evaluar el operador "<=" entre dos numeros enteros
		 *<strong>pre:</strong> No aplica
		 *<strong>pos:</strong> No aplica
		 *@param n1 <strong>double</strong> Primer numero a comparar
		 *@param n2 <strong>double</strong> Segundo numero a comparar
		 *@return <strong>boolean</strong> Resultado de la operacion n1"<="n2
	 * </pre>
	 */
	public static boolean menorIgualQue(int n1, int n2) {
		return n1 <= n2;
	}

	/**
	 * <pre>
		 *<strong>Descripcion:</strong> El metodo igual permite obtener el resultado booleano luego de evaluar el operador == entre dos numeros enteros
		 *<strong>pre:</strong> No aplica
		 *<strong>pos:</strong> No aplica
		 *@param n1 <strong>double</strong> Primer numero a comparar
		 *@param n2 <strong>double</strong> Segundo numero a comparar
		 *@return <strong>boolean</strong> Resultado de la operacion n1==n2
	 * </pre>
	 */
	public static boolean igual(int n1, int n2) {
		return n1 == n2;
	}
	
	/**
	 * <pre>
		 *<strong>Descripcion:</strong> El metodo igual permite obtener el resultado booleano luego de evaluar el operador == entre dos numeros enteros
		 *<strong>pre:</strong> No aplica
		 *<strong>pos:</strong> No aplica
		 *@param n1 <strong>double</strong> Primer numero a comparar
		 *@param n2 <strong>double</strong> Segundo numero a comparar
		 *@return <strong>boolean</strong> Resultado de la operacion n1==n2
	 * </pre>
	 */
	public static boolean diferente(int n1, int n2) {
		return n1 != n2;
	}

}
