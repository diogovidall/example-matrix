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
