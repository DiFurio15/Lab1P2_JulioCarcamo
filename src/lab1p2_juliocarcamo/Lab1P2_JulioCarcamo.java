package lab1p2_juliocarcamo;

import java.util.Scanner;
import java.util.Random;

public class Lab1P2_JulioCarcamo {

    //Fila 3, asiento 6
    public static void main(String[] args) {
        Scanner Asus = new Scanner(System.in);

        System.out.println("---Laboratorio 1 de programacion 2--");

        System.out.println("Mediana de medianas ");
        int TamanioMatriz = Asus.nextInt();
        if (TamanioMatriz < 4 || (TamanioMatriz % 2) == 0) {
            int[][] Matriz = new int ([TamanioMatriz][TamanioMatriz]
        
    
    );
        }
    } 
    
     private static int[][] generarMatriz(int tamano) {
        int[][] matriz = new int[tamano][tamano];
        Random random = new Random();
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                matriz[i][j] = random.nextInt(10); // Números entre 0 y 9
            }
        }
        return matriz;
    }

    private static void bubbleSort(int[] fila, int n) {
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
}
