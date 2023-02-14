package exercise5;

import java.util.Arrays;

public class Functions {
	
	public static int[][] fillArray(int array[][]){
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = i * j;
			}
		}
		return array;
	}

	public static void printArray(int array[][]) {
		for(int[] value: array) {
			System.out.println(Arrays.toString(value) + "\n");
		}
	}
}
/*Escribe un programa que genere 20 números enteros aleatorios entre 100 y 999.
 *Estos números se deben introducir en un array de 4 filas por 5 columnas.
 *El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara.
 *La suma total debe aparecer en la esquina inferior derecha.
 *(Ver enunciado.)
 */