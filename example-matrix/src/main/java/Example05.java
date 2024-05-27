/*
5) Elaborar um método quadradoMagico, que recebe uma matriz de inteiros e devolve true se ela
for um quadrado mágico e false caso contrário. Para que seja considerado um quadrado
mágico, a soma dos elementos de cada linha deve ser a mesma, e deve ser igual à soma dos
elementos de cada coluna, e igual à soma dos elementos de cada diagonal.
No main, leia os valores de uma matriz 3x3 e chame o método quadradoMagico para verificar
se essa matriz é um quadrado mágico.
Por exemplo, a matriz abaixo é considerada um quadrado mágico, pois a soma de cada linha
é igual a 15, assim como a soma de cada coluna e de cada diagonal:
 */

public class Example05 {

    public static boolean quadradoMagico(int[][] matriz) {
        int n = matriz.length;

        // Calcula a soma da primeira linha para referência
        int somaReferencia = 0;
        for (int coluna = 0; coluna < n; coluna++) {
            somaReferencia += matriz[0][coluna];
        }

        // Verifica a soma das linhas
        for (int linha = 1; linha < n; linha++) {
            int somaLinha = 0;
            for (int coluna = 0; coluna < n; coluna++) {
                somaLinha += matriz[linha][coluna];
            }
            if (somaLinha != somaReferencia) {
                return false;
            }
        }

        // Verifica a soma das colunas
        for (int coluna = 0; coluna < n; coluna++) {
            int somaColuna = 0;
            for (int linha = 0; linha < n; linha++) {
                somaColuna += matriz[linha][coluna];
            }
            if (somaColuna != somaReferencia) {
                return false;
            }
        }

        // Verifica a soma da diagonal principal
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < n; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        if (somaDiagonalPrincipal != somaReferencia) {
            return false;
        }

        // Verifica a soma da diagonal secundária
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < n; i++) {
            somaDiagonalSecundaria += matriz[i][n - 1 - i];
        }
        return somaDiagonalSecundaria == somaReferencia;
    }
    public static void main(String[] args) {
        int[][] matriz = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};

        System.out.println("Matriz:");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        if (quadradoMagico(matriz)) {
            System.out.println("A matriz é um quadrado mágico.");
        } else {
            System.out.println("A matriz NÃO é um quadrado mágico.");
        }
    }
}
