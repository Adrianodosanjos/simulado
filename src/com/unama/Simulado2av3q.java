package com.unama;

import java.util.Scanner;

    public class Simulado2av3q {
       public static double prestacao;
       public static  int meses;
       public static double taxa,valor;

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[3];
        double controle;

        System.out.print("Informe um valor R$ ");
        valor = sc.nextInt();
        System.out.print("Insira em quantas prestações X ");
        meses = sc.nextInt();
        System.out.print("Quanto de juros % ");
        taxa = sc.nextInt();

        controle = calcPrestacao(valor, taxa, meses);
        System.out.println("O valor ajustado da prestacao é R$ " + controle);
    }
    public static double calcPrestacao(double val, double tax, int tempo){
        double prest;
        prest=val+(val*(tax/100)*tempo);
        return prest;
    }
}
