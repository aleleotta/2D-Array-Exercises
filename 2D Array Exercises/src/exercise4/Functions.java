package exercise4;

import java.util.Arrays;

public class Functions {
	
	public static int[][] setArray(int array[][]){
		array[0][0] = 0;
		array[0][1] = 30;
		array[0][2] = 2;
		array[0][5] = 5;
		array[1][0] = 75;
		array[1][4] = 0;
		array[2][2] = -2;
		array[2][3] = 9;
		array[2][5] = 11;
		return array;
	}

	public static void printArray(int array[][]) {
		for(int[] value: array) {
			System.out.println(Arrays.toString(value) + "\n");
		}
	}
}
/*Define un array de números enteros de 3 filas por 6 columnas
 *con nombre num y asigna los valores según la siguiente tabla.
 *Muestra el contenido de todos los elementos del array dispuestos en forma de tabla como se muestra en la figura.
 *(Ver enunciado.)
 */