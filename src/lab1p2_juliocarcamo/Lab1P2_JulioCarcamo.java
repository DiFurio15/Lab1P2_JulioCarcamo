package lab1p2_juliocarcamo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Lab1P2_JulioCarcamo {

    //Fila 3, asiento 6
    public static void main(String[] args) {
        Scanner Asus = new Scanner(System.in);

        System.out.println("---Laboratorio 1 de programacion 2--");

        System.out.println("Ingrese el tamano impar de la matriz mayor que 4:");
        int tamano = Asus.nextInt();

        // Asegurarse de que el tamaño es impar y mayor que 4
        if (tamano <= 4 || tamano % 2 == 0) {
            System.out.println("El tamano debe ser un numero impar mayor que 4.");
            return;
        }

        // Generar la matriz con numeros aleatorios
         int [][] matriz = generarMatriz(tamano);

        // Ordenar cada fila de la matriz
        for (int i = 0; i < matriz.length; i++) {
            bubbleSortRecursivo(matriz[i], matriz[i].length);
        }

        // Calcular las medianas de cada fila y almacenarlas
        ArrayList<Integer> medianas = new ArrayList<>();
        for (int[] fila : matriz) {
            medianas.add(calcularMediana(fila));
        }

        bubbleSortArrayList(medianas);

        int medianaDeMedianas = calcularMediana(medianas.stream().mapToInt(i -> i).toArray());
        System.out.println("La mediana de medianas es: " + medianaDeMedianas);
    }

    public static int[][] generarMatriz(int tamano) {
        int[][] matriz = new int[tamano][tamano];
        Random randy = new Random();
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                matriz[i][j] = randy.nextInt(10); // Numeros entre 0 y 9
            }
        }
        return matriz;
    }

    public static void bubbleSortRecursivo(int[] fila, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (fila[i] > fila[i + 1]) {
                int temp = fila[i];
                fila[i] = fila[i + 1];
                fila[i + 1] = temp;
            }
        }

    }

    public static int calcularMediana(int[] fila) {
        int mitad = fila.length / 2;
        if (fila.length % 2 == 1) {
            return fila[mitad];
        } else {
            return (fila[mitad - 1] + fila[mitad]) / 2;
        }
    }

    public static void bubbleSortArrayList(ArrayList<Integer> medianas) {
        int n = medianas.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (medianas.get(j) > medianas.get(j + 1)) {
                    int temp = medianas.get(j);
                    medianas.set(j, medianas.get(j + 1));
                    medianas.set(j + 1, temp);
                }
            }
        }
    }
}
