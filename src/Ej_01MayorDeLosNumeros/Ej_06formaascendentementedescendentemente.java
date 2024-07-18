package Ej_01MayorDeLosNumeros;
import java.util.Arrays;
import java.util.Random;
/*
 * autor:Roselin Anahi Chipana Mamani
 */
public class Ej_06formaascendentementedescendentemente {
	public static void main(String[] args) {
        int m = 5; // Tamaño del vector A
        int n = 7; // Tamaño del vector B
        
        // Declaración y llenado de los vectores A y B
        int[] A = new int[m];
        int[] B = new int[n];
        Random random = new Random();
        
        System.out.println("Vector A (antes de ordenar):");
        for (int i = 0; i < m; i++) {
            A[i] = random.nextInt(100); // Genera números aleatorios entre 0 y 99
            System.out.print(A[i] + " ");
        }
        System.out.println();
        
        System.out.println("Vector B (antes de ordenar):");
        for (int i = 0; i < n; i++) {
            B[i] = random.nextInt(100); // Genera números aleatorios entre 0 y 99
            System.out.print(B[i] + " ");
        }
        System.out.println();
        
        // Ordenar los vectores de forma ascendente
        Arrays.sort(A);
        Arrays.sort(B);
        
        // Mostrar los vectores ordenados de forma ascendente
        System.out.println("Vector A (orden ascendente):");
        for (int i = 0; i < m; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        
        System.out.println("Vector B (orden ascendente):");
        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
        
        // Mostrar los vectores ordenados de forma descendente
        System.out.println("Vector A (orden descendente):");
        for (int i = m - 1; i >= 0; i--) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        
        System.out.println("Vector B (orden descendente):");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
    }
}

