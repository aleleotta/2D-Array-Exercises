package exercise3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int grades[][] = new int[4][5];
		Scanner sc = new Scanner(System.in);
		grades = Functions.fillArray(grades, sc);
		Functions.printArray(grades);
		sc.close();
	}
}
/*Necesitamos crear un programa para almacenar las notas de 4 alumnos
 *(llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas.
 *El usuario introducirá las notas por teclado y luego el programa mostrará la tabla con las notas
 *A continuación, mostrará la nota mínima, máxima y media de cada alumno.
 */