package examples;
/*
1) Escreva um programa que cria uma matriz 2x3 de inteiros, solicite que o usuário digite os
valores para preencher a matriz, leia os valores, preencha a matriz e depois exiba os valores
em forma de matriz.
 */

import java.util.Scanner;

public class Example01 {
    public static void exibeMatriz(int[][] matriz) {
        for (int linha=0; linha < matriz.length; linha++) {
            for (int coluna=0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        // Solicita que o usuario digite os valores para preencher a matriz
        for (int linha=0; linha < matriz.length; linha++) {
            for (int coluna=0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor de matriz[" + linha +
                        "][" + coluna + "]");
                matriz[linha][coluna] = leitor.nextInt();
            }
        }

        // Exibe a matriz no formato de matriz
        System.out.println("Exibicao da matriz:");
        exibeMatriz(matriz);
    }
}
