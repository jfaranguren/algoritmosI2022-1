package ui;

import java.util.Scanner;

public class PracticaIntegradora{
	
	public static int[] globalArray;
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite el tamano del arreglo");
		
		int size = sc.nextInt();
		
		init(size);
		
		System.out.println("El arreglo tiene el siguiente contenido");
		System.out.println(printArray(globalArray));
	
	
	
	}
	
	
	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo init permite inicializar las variables globales, ej: globalArray
	 *<strong>pre:</strong> globalArray <strong>int[]</strong> debe haber sido declarado 
	 *<strong>pos:</strong> globalArray <strong>int[]</strong> se inicializa con tamaño size
	 *@param size <strong>int</strong> Numero que corresponde al tamaño del arreglo
	 * </pre>
	 */
	public static void init(int size){
	
		globalArray = new int[size];
	
	}
	
	
	/**
	 * <pre>
	 *<strong>Descripcion:</strong> El metodo printArray permite imprimir el contenido de un arreglo en una sola linea
	 *@param array <strong>int[]</strong> Arreglo de enteros
	 *@return msg <strong>String</strong> Cadena con el contenido del arreglo
	 * </pre>
	 */
	public static String printArray(int[] array){
	
		String msg ="";
		
		for(int i=0; i<array.length;i++){
			
			msg=msg+array[i];			
			
		}
		
		return msg;
	
	}
	
	
	
	
}