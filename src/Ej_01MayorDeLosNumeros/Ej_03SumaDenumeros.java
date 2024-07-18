package Ej_01MayorDeLosNumeros;
import java.util.Random;
/*
 * autor:Roselin Anahi Chipana Mamani
 */
import java.util.Scanner;

public class Ej_03SumaDenumeros {
	public static void main(String[] args) {
        // Tamaño del vector
        int N = 10; // Puedes cambiar este valor según tus necesidades
        
        // Declarar el vector A de tamaño N
        int[] A = new int[N];
        
        // Llenar el vector A con números enteros aleatorios
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            A[i] = random.nextInt(100); // Genera números enteros aleatorios entre 0 y 99
        }
        
        // Mostrar el vector generado
        System.out.print("Vector A: ");
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        
        // Calcular la suma de los números pares en el vector A
        int sumaPares = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] % 2 == 0) {
                sumaPares += A[i];
            }
        }
        
        // Mostrar la suma de los números pares
        System.out.println("La suma de los números pares en el vector es: " + sumaPares);
    }
}
