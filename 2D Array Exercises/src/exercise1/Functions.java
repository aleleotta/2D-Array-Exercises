package exercise1;

import java.util.Arrays;

public class Functions {
	
	public static int[][] fillArray(int array[][]){
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = 10 * i + j;
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

/*Crea una tabla bidimensional de longitud 5x5 y rellenarla de la siguiente forma:
el elemento de la posición [n][m] debe contener el valor 10 * n + m.
Después se debe mostrar su contenido.
*/