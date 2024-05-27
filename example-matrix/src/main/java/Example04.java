
/*
4) Elaborar um programa que solicita que o usuário digite um número n, que de
que 1 e menor do que 6. Em seguida, crie uma matriz n x n de números intei
o usuário digite os valores para preencher a matriz. Em seguida, calcule e
elementos da diagonal principal da matriz e a soma dos elementos da diagon
matriz.ublic static void main(String[] args) {
Exemplo: neste exercício, o usuário que define o tamanho da matriz.   Scan
Vamos supor que o usuário digitou n = 3. Então a matriz será 3 x 3
Vamos supor que o usuário digitou os valores conforme o desenho abaixo:
 */

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número (maior que 1 e menor que 6): ");
        int n = scanner.nextInt();

        // Verifica se o número digitado está dentro do intervalo permitido
        while (n <= 1 || n >= 6) {
            System.out.println("Número inválido. Por favor, digite um número maior que 1 e menor que 6: ");
            n = scanner.nextInt();
        }

        int[][] matriz = new int[n][n];

        // Preenche a matriz com os valores digitados pelo usuário
        System.out.println("Digite os valores para preencher a matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calcula a soma dos elementos da diagonal principal
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < n; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }

        // Calcula a soma dos elementos da diagonal secundária
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < n; i++) {
            somaDiagonalSecundaria += matriz[i][n - 1 - i];
        }

        // Exibe os resultados
        System.out.println("Os elementos da diagonal principal são: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println("\nSoma da diagonal principal: " + somaDiagonalPrincipal);

        System.out.println("\nOs elementos da diagonal secundária são: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][n - 1 - i] + " ");
        }
        System.out.println("\nSoma da diagonal secundária: " + somaDiagonalSecundaria);

        scanner.close();
    }
}
