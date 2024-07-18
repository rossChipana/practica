package Ej_01MayorDeLosNumeros;
import java.util.Random;
/*
 * autor:Roselin Anahi Chipana Mamani
 */
import java.util.Scanner;

public class Ej_04numeromultiplode3 {
	 public static void main(String[] args) {
	        int N = 10; // Tamaño del vector
	        int[] A = new int[N]; // Declaración del vector
	        
	        // Llenar el vector aleatoriamente
	        Random random = new Random();
	        for (int i = 0; i < N; i++) {
	            A[i] = random.nextInt(100); // Genera números aleatorios entre 0 y 99
	        }
	        
	        // Calcular la suma de los múltiplos de 3
	        int sumaMultiplosDe3 = 0;
	        for (int i = 0; i < N; i++) {
	            if (A[i] % 3 == 0) {
	                sumaMultiplosDe3 += A[i];
	            }
	        }
	        
	        // Mostrar el vector A
	        System.out.print("Vector A: ");
	        for (int i = 0; i < N; i++) {
	            System.out.print(A[i] + " ");
	        }
	        System.out.println();
	        
	        // Mostrar la suma de los múltiplos de 3
	        System.out.println("Suma de los múltiplos de 3 en el vector: " + sumaMultiplosDe3);
	    }
	}
