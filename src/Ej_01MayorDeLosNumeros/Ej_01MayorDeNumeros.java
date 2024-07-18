package Ej_01MayorDeLosNumeros;
/*
 * autor:Roselin Anahi Chipana Mamani
 */
import java.util.Scanner;

public class Ej_01MayorDeNumeros {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int N = scanner.nextInt();
        
        // Declarar el vector A de tamaño N
        int[] A = new int[N];
        
        // Llenar el vector A desde teclado con números enteros
        System.out.println("Ingrese los números enteros para el vector:");
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            A[i] = scanner.nextInt();
        }
        
        // Determinar el mayor número en el vector A
        int mayor = A[0];
        for (int i = 1; i < N; i++) {
            if (A[i] > mayor) {
                mayor = A[i];
            }
        }
        
        // Mostrar el resultado
        System.out.println("El mayor número en el vector es: " + mayor);
    }
}
