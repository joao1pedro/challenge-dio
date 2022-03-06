package com.dio.project;

import java.util.Scanner;

public class Project08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtdCoelhos = 0, qtdSapos = 0, qtdRatos = 0, total = 0, qtd;
        int N = input.nextInt();
        char tipo;

        for (int i = 0; i < N; i++) {
            qtd = input.nextInt();
            tipo = input.next().charAt(0);
            switch (tipo) {
                case 'C':
                    qtdCoelhos += qtd;
                    break;
                case 'S':
                    qtdSapos += qtd;
                    break;
                case 'R':
                    qtdRatos += qtd;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        }
        input.close();

        total = qtdCoelhos + qtdSapos + qtdRatos;
        double percentCoelhos = (qtdCoelhos * 100) / (double) total;
        double percentSapos = (qtdSapos * 100) / (double) total;
        double percentRatos = (qtdRatos * 100) / (double) total;
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + qtdCoelhos);
        System.out.println("Total de ratos: " + qtdRatos);
        System.out.println("Total de sapos: " + qtdSapos);
        System.out.println(String.format("Percentual de coelhos: %.2f", percentCoelhos) + " %");
        System.out.println(String.format("Percentual de ratos: %.2f", percentRatos) + " %");
        System.out.println(String.format("Percentual de sapos: %.2f", percentSapos) + " %");
    }
}
