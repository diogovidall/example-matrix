package examples;/*
2)Elabore um método exibeMatriz, que recebe uma matriz de inteiros e exibe seus valores em
forma de matriz. Escreva no main o código que leia os valores de duas matrizes 2x3 de
inteiros. Depois calcule a soma dessas duas matrizes, armazenando a soma em uma terceira
matriz e exiba os valores dessa terceira matriz (chame o método exibeMatriz para exibir a matriz).
 */

public class Example02 {

    public static void exibeMatriz(int[][] matriz) {
        for (int linha=0; linha < matriz.length; linha++) {
            for (int coluna=0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] somaMatrizes(int[][] matriz01, int[][] matriz02){
        int linhas = matriz01.length;
        int colunas = matriz01[0].length;
        int[][] soma = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma[i][j] = matriz01[i][j] + matriz02[i][j];
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        //1°Matriz
        int[][] matriz01 = { {1,2,3}, {3,2,1}};

        //2°Matriz
        int[][] matriz02 = { {4,5,6}, {6,5,4}};

        System.out.println("Exibindo 1°Matriz:");
        exibeMatriz(matriz01);

        System.out.println("\nExibindo 2°Matriz:");
        exibeMatriz(matriz02);

        //Exibindo soma
        System.out.println("\nA soma das matrizes é:");
        exibeMatriz(somaMatrizes(matriz01, matriz02));
    }
}
