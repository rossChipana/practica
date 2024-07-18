package Ej_01MayorDeLosNumeros;
import java.util.Scanner;
/*
 * autor:Roselin Anahi Chipana Mamani
 */
public class Ej_07determinarestudiantemayornota {
	 public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.print("Ingrese el número de estudiantes: ");
				int n = scanner.nextInt();
				
				// Declaración y llenado de los arreglos de nombres y notas
				String[] estudiantes = new String[n];
				int[] notas = new int[n];
				try (Scanner nombreScanner = new Scanner(System.in)) {
					for (int i = 0; i < n; i++) {
					    System.out.print("Ingrese el nombre del estudiante #" + (i + 1) + ": ");
					    estudiantes[i] = nombreScanner.nextLine();
					    System.out.print("Ingrese la nota del estudiante #" + (i + 1) + ": ");
					    notas[i] = scanner.nextInt();
					}
				}
				// Determinar al estudiante con mayor nota
				int indiceMayorNota = 0;
				for (int i = 1; i < n; i++) {
				    if (notas[i] > notas[indiceMayorNota]) {
				        indiceMayorNota = i;
				    }
				}
				
				// Mostrar al estudiante con mayor nota
				System.out.println("El estudiante con la mayor nota es: " + estudiantes[indiceMayorNota]);
				System.out.println("Nota: " + notas[indiceMayorNota]);
			}
	    }
}
