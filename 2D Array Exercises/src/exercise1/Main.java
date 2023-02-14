package exercise1;

public class Main {
	public static void main(String[] args) {
		int array2D[][] = new int[5][5];
		array2D = Functions.fillArray(array2D);
		Functions.printArray(array2D);
	}
}

/*Crea una tabla bidimensional de longitud 5x5 y rellenarla de la siguiente forma:
  el elemento de la posición [n][m] debe contener el valor 10 * n + m.
  Después se debe mostrar su contenido.
 */