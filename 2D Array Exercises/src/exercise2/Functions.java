package exercise2;

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
/*
 * Crea un programa que cree una matriz de 10x10 e 
 * introduzca los valores de las tablas de multiplicar del 1 al 10
 * (cada tabla de multiplicar en una fila). Luego mostrará la matriz por pantalla.
*/