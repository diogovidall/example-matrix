package queuesWithMatrix;

public class MatrixExample {
    public static void main(String[] args) {
        // Passo 1: Criar um vetor de objetos Remedio
        Remedio[] remedios = {
                new Remedio(1, 10, "Remedio A", 12.5, "Laboratorio X"),
                new Remedio(2, 15, "Remedio B", 8.75, "Laboratorio Y"),
                new Remedio(3, 20, "Remedio C", 6.0, "Laboratorio Z"),
                new Remedio(4, 5, "Remedio D", 20.0, "Laboratorio W"),
                new Remedio(5, 8, "Remedio E", 15.0, "Laboratorio V"),
                new Remedio(6, 12, "Remedio F", 10.0, "Laboratorio U")
        };

        // Passo 2: Criar uma matriz de objetos Remedio
        Remedio[][] matrizRemedios = new Remedio[remedios.length][2];
        for (int i = 0; i < remedios.length; i++) {
            matrizRemedios[i][0] = remedios[i]; // Atribuir o mesmo objeto Remedio para as duas colunas
            matrizRemedios[i][1] = remedios[i];
        }

        // Passo 3: Calcular a soma de cada coluna
        double[] somaPrecos = new double[2];
        for (int i = 0; i < matrizRemedios.length; i++) {
            somaPrecos[0] += matrizRemedios[i][0].getPreco();
            somaPrecos[1] += matrizRemedios[i][1].getPreco();
        }

        // Passo 4: Exibir o relatório
        System.out.printf("%-15s%-15s%-15s\n", "Remédio", "Preço 1", "Preço 2");
        for (int i = 0; i < remedios.length; i++) {
            System.out.printf("%-15s%-15.2f%-15.2f\n", remedios[i].getNome(), remedios[i].getPreco(), remedios[i].getPreco());
        }
        System.out.printf("%-15s%-15.2f%-15.2f\n", "Soma", somaPrecos[0], somaPrecos[1]);
    }
}
