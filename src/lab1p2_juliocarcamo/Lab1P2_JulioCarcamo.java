package lab1p2_juliocarcamo;

import java.util.Scanner;
import java.util.Random;

public class Lab1P2_JulioCarcamo {

    //Fila 3, asiento 6
    public static void main(String[] args) {

        Scanner Asus = new Scanner(System.in);
        System.out.println("Ingrese el tamano impar de la matriz mayor que 4:");
        int tamano = Asus.nextInt();

        // Asegurarse de que el tamano es impar y mayor que 4
        if (tamano < 4 || tamano % 2 == 0) {
            System.out.println("El tamano debe ser un numero impar mayor que 4.");
            return;
        }

        // Generar la matriz con numeros aleatorios
        int[][] matriz = generarMatriz(tamano);

        // Ordenar cada fila de la matriz
        for (int i = 0; i < matriz.length; i++) {
            bubbleSort(matriz[i]);
        }

        // Calcular las medianas de cada fila y almacenarlas en una matriz
        int[] medianas = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            medianas[i] = calcularMediana(matriz[i]);
        }

        // Ordenar las medianas
        bubbleSort(medianas);

        // Calcular la mediana de medianas
        int medianaDeMedianas = calcularMediana(medianas);
        System.out.println("La mediana de medianas es: " + medianaDeMedianas);
    }

    public static int[][] generarMatriz(int tamano) {
        int[][] matriz = new int[tamano][tamano];
        Random randy = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = randy.nextInt(10); // Números entre 0 y 9
            }
            System.out.println();
        }
        
        return matriz;
    }

    public static void bubbleSort(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
    //clase final
    public static int calcularMediana(int[] arreglo) {
        int mitad = arreglo.length / 2;
        if (arreglo.length % 2 == 1) {
            return arreglo[mitad];
        } else {
            return (arreglo[mitad - 1] + arreglo[mitad]) / 2;
        }
    }
}
