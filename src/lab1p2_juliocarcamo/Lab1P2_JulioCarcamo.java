package lab1p2_juliocarcamo;

import java.util.Scanner;

public class Lab1P2_JulioCarcamo {

    public static void main(String[] args) {
        Scanner Asus = new Scanner(System.in);

        System.out.println("---Laboratorio 1 de programacion 2--");

        System.out.println("1.  Mediana de medianas ");
        int TamanioMatriz = Asus.nextInt();
        if (TamanioMatriz < 4 || (TamanioMatriz % 2) == 0) {
           int[][] Matriz = new int ([TamanioMatriz][TamanioMatriz]);
        }
    } 
    
     public static void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
     
     public static void Bubblesort(){
         for (int i = 0; i < TamanioMatriz; i++) {
             if (Array[i] > Array[i+1]) {
                 
             }
         }
     }

}
