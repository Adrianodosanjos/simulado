package com.unama;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Simulado2av2q {
    public static int[] vetor = new int[7];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maiorn = 0, menorn = 0, imaior = 0, imenor = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe um número:");
            vetor[i] = sc.nextInt();
            if (vetor[i] > maiorn) {
                maiorn = vetor[i];
                imaior = i;
            }
        }

        menorn=maiorn;

        for (int i = 0; i < vetor.length; i++) {
            if (menorn > vetor[i]) {
                menorn = vetor[i];
                imenor = i;
            }
        }

        System.out.println("Maior número armazenado é: " + maiorn + " e seu índice é: " + imaior);
        System.out.println("Menor número armazenado é: " + menorn + " e seu índice é " + imenor);


    }
}
