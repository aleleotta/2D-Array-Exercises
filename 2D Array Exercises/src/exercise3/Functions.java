package exercise3;
import java.util.*;

public class Functions {
	
	public static int[][] fillArray(int array[][], Scanner sc){
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println("Please introduce a grade for student " + (i+1) + ":");
				array[i][j] = sc.nextInt();
				while(array[i][j] > 10 && array[i][j] > 0) {
					System.out.println("Please enter a valid grade!");
					array[i][j] = sc.nextInt();
				}
			}
		}
		return array;
	}

	public static void printArray(int array[][]) {
		int i = 1;
		for(int[] value: array) {
			System.out.print("Student " + i + ": ");
			System.out.println(Arrays.toString(value) + "\n");
			i++;
		}
	}
}
/*Necesitamos crear un programa para almacenar las notas de 4 alumnos
 *(llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas.
 *El usuario introducirá las notas por teclado y luego el programa mostrará la tabla con las notas
 *A continuación, mostrará la nota mínima, máxima y media de cada alumno.
 */