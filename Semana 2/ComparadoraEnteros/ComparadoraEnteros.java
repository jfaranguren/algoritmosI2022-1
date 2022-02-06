import java.util.Scanner;

/**
 * <pre>
 * <strong>Descripción del programa:</strong>
 * 	La clase Comparadora enteros es un programa que imprime el resultado de comparar dos enteros  
 *	con los operadores mayor que, mayor o igual que, menor que, menor o igual que, igual y diferente
 * 
 * <strong>Ejemplo:</strong> 
 *	Primer número: 4
 *	Segundo número: 3 
 *
 * <strong>Mensaje de retorno por consola:</strong> 
 *	Resultados de la comparacion:
 *	1. Es a mayor que b? Si
 *	2. Es a mayor o igual que b? Si
 *	3. Es a menor que b? No
 *	4. Es a menor o igual que b? No
 *	5. Es a igual que b? No
 *	6. Es a diferente de b? Si
 * </pre>
 */
public class ComparadoraEnteros {
	
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido a Comparadora de 2 Enteros");
		System.out.println("Digite el primer entero (a)");
		int n1 = sc.nextInt();
		System.out.println("Digite el segundo entero (b)");
		int n2 = sc.nextInt();
		System.out.println("Resultados de la comparacion:");
		System.out.println("1. Es a mayor que b?"+(mayorQue(n1,n2)?" Si":" No"));
		System.out.println("2. Es a mayor o igual que b?" +(mayorIgualQue(n1,n2)?" Si":" No"));
		System.out.println("3. Es a menor que b?"+ (menorQue(n1,n2)?" Si":" No"));
		System.out.println("4. Es a menor o igual que b?"+ (menorIgualQue(n1,n2)?" Si":" No"));
		System.out.println("5. Es a igual que b?"+ (igual(n1,n2)?" Si":" No"));
		System.out.println("6. Es a diferente de b?"+ (diferente(n1,n2)?" Si":" No"));
    }
	
/**<pre>
	 *<strong>Descripcion:</strong> El metodo mayorQue permite obtener el resultado booleano luego de evaluar el operador ">" entre dos números enteros
	 *<strong>pre:</strong> No aplica
	 *<strong>pos:</strong> No aplica
	 *@param n1 <strong>double</strong> Primer numero a comparar
	 *@param n2 <strong>double</strong> Segundo numero a comparar
	 *@return <strong>boolean</strong> Resultado de la operación n1">"n2
	 *</pre>
	*/
	public static boolean mayorQue(int n1, int n2) {
		boolean resultado = n1 > n2 ? true : false;
		return resultado;
	}

/**<pre>
	 *<strong>Descripcion:</strong> El metodo mayorIgualQue permite obtener el resultado booleano luego de evaluar el operador ">=" entre dos números enteros
	 *<strong>pre:</strong> No aplica
	 *<strong>pos:</strong> No aplica
	 *@param n1 <strong>double</strong> Primer numero a comparar
	 *@param n2 <strong>double</strong> Segundo numero a comparar
	 *@return <strong>boolean</strong> Resultado de la operación n1">="n2
	 *</pre>
	*/
	public static boolean mayorIgualQue(int n1, int n2) {
		boolean resultado = n1 >= n2 ? true : false;
		return resultado;
	}

/**<pre>
	 *<strong>Descripcion:</strong> El metodo menorQue permite obtener el resultado booleano luego de evaluar el operador "<" entre dos números enteros
	 *<strong>pre:</strong> No aplica
	 *<strong>pos:</strong> No aplica
	 *@param n1 <strong>double</strong> Primer numero a comparar
	 *@param n2 <strong>double</strong> Segundo numero a comparar
	 *@return <strong>boolean</strong> Resultado de la operación n1"<"n2
	 *</pre>
	*/
	public static boolean menorQue(int n1, int n2) {
		boolean resultado = n1 < n2 ? true : false;
		return resultado;
	}

/**<pre>
	 *<strong>Descripcion:</strong> El metodo menorIgualQue permite obtener el resultado booleano luego de evaluar el operador "<=" entre dos números enteros
	 *<strong>pre:</strong> No aplica
	 *<strong>pos:</strong> No aplica
	 *@param n1 <strong>double</strong> Primer numero a comparar
	 *@param n2 <strong>double</strong> Segundo numero a comparar
	 *@return <strong>boolean</strong> Resultado de la operación n1"<="n2
	 *</pre>
	*/
	public static boolean menorIgualQue(int n1, int n2) {
		boolean resultado = n1 <= n2 ? true : false;
		return resultado;
	}

/**<pre>
	 *<strong>Descripcion:</strong> El metodo igual permite obtener el resultado booleano luego de evaluar el operador == entre dos números enteros
	 *<strong>pre:</strong> No aplica
	 *<strong>pos:</strong> No aplica
	 *@param n1 <strong>double</strong> Primer numero a comparar
	 *@param n2 <strong>double</strong> Segundo numero a comparar
	 *@return <strong>boolean</strong> Resultado de la operación n1==n2
	 *</pre>
	*/
	public static boolean igual(int n1, int n2) {
		boolean resultado = n1 == n2 ? true : false;
		return resultado;
	}

/**<pre>
	 *<strong>Descripcion:</strong> El metodo diferente permite obtener el resultado booleano luego de evaluar el operador != entre dos números enteros
	 *<strong>pre:</strong> No aplica
	 *<strong>pos:</strong> No aplica
	 *@param n1 <strong>double</strong> Primer numero a comparar
	 *@param n2 <strong>double</strong> Segundo numero a comparar
	 *@return <strong>boolean</strong> Resultado de la operación n1!=n2
	 *</pre>
	*/
	public static boolean diferente(int n1, int n2) {
		boolean resultado = n1 != n2 ? true : false;
		return resultado;
	}


}





