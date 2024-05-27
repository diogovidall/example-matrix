/*
3)Elabore um programa em Java que leia os valores de uma matriz 3x3 de inteiros. Crie um vetor
de 3 elementos, contendo o total de cada coluna e exiba os valores desse vetor.
 */


public class Example03 {

    public static void exibeMatriz(int[][] matriz) {
        for (int linha=0; linha < matriz.length; linha++) {
            for (int coluna=0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] exibeColunas(int[][] matriz){
        int numColunas = matriz[0].length; // Assumindo que todas as linhas têm o mesmo número de colunas
        int[] tamanhos = new int[numColunas];

        for (int coluna = 0; coluna < numColunas; coluna++) {
            int tamanhoColuna = 0;
            for (int linha = 0; linha < matriz.length; linha++) {
                tamanhoColuna++; // Incrementa o tamanho da coluna para cada elemento na linha
            }
            tamanhos[coluna] = tamanhoColuna;
        }

        return tamanhos;
    }

    public static void main(String[] args) {
        int[][] matriz = {{1,2,3} , {3,2,1}, {9,8,4}};
        int[] vetor = new int[matriz[0].length];

        System.out.println("Exibindo matriz:");
        exibeMatriz(matriz);

        int[] tamanhoColunas = exibeColunas(matriz);
        System.out.println("\nQuantidade de colunas:");
        for (int i = 0; i < tamanhoColunas.length; i++) {
            System.out.println("Coluna " + (i + 1) + ": " + tamanhoColunas[i]);
        }
    }
}
