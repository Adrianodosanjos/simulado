package com.unama;

import java.util.Scanner;

public class Simulado2av1q {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        int[][] matrizM = new int[5][5];
        for (int i = 0; i <= 4; i++) {

            for (int j = 1; j <= 4; j++) {
                System.out.println("Informe um número "+i+"/"+j+":");
                matrizM[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <= 4; i++) {
            System.out.println("Diagonal principal: " + matrizM[i][i]);
        }
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {
                if (i + j == matrizM.length) {
                    System.out.println("Diagonal secundária: " + matrizM[i][j]);
                }
            }
        }
    }
}
