package Ej_01MayorDeLosNumeros;
import java.util.Random;
/*
 * autor:Roselin Anahi Chipana Mamani
 */
import java.util.Scanner;
public class Ej_05sumadenumerospareseimpares {
	 public static void main(String[] args) {
	        int N = 10; // Tamaño del vector
	        int[] A = new int[N]; // Declaración del vector
	        
	        // Llenar el vector aleatoriamente
	        Random random = new Random();
	        for (int i = 0; i < N; i++) {
	            A[i] = random.nextInt(100); // Genera números aleatorios entre 0 y 99
	        }
	        
	        // Calcular la suma de los números pares y de los números impares
	        int sumaPares = 0;
	        int sumaImpares = 0;
	        for (int i = 0; i < N; i++) {
	            if (A[i] % 2 == 0) {
	                sumaPares += A[i];
	            } else {
	                sumaImpares += A[i];
	            }
	        }
	        
	        // Mostrar el vector A
	        System.out.print("Vector A: ");
	        for (int i = 0; i < N; i++) {
	            System.out.print(A[i] + " ");
	        }
	        System.out.println();
	        
	        // Mostrar la suma de los números pares e impares
	        System.out.println("Suma de los números pares en el vector: " + sumaPares);
	        System.out.println("Suma de los números impares en el vector: " + sumaImpares);
	    }

}
