package exercise4;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int num[][] = new int[3][6];
		num = Functions.setArray(num);
		System.out.println("Array:");
		Functions.printArray(num);
	}
}
/*Define un array de números enteros de 3 filas por 6 columnas
 *con nombre num y asigna los valores según la siguiente tabla.
 *Muestra el contenido de todos los elementos del array dispuestos en forma de tabla como se muestra en la figura.
 *(Ver enunciado.)
 */