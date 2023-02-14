package exercise2;
import exercise1.Functions;

public class Main {
	public static void main(String[] args) {
		int array2D[][] = new int[11][11];
		array2D = exercise2.Functions.fillArray(array2D);
		Functions.printArray(array2D);
	}
}
/*
 * Crea un programa que cree una matriz de 10x10 e 
 * introduzca los valores de las tablas de multiplicar del 1 al 10
 * (cada tabla de multiplicar en una fila). Luego mostrará la matriz por pantalla.
*/