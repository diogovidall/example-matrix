package examples;/*
6) Solicitar que o usuário digite o valor maxAluno, que deverá ser um número inteiro maior ou
igual a 5 e menor ou igual a 15. Enquanto o usuário não digitar um valor válido, solicitar que
digite novamente.
- Criar um vetor aluno de maxAluno posições, do tipo String.
- Criar uma matriz notas de maxAluno linhas e 2 colunas, do tipo double.
- Criar um vetor media de 2 posições, do tipo double.
- Criar um vetor mediaAluno de maxAluno posições, do tipo double.
- Solicitar que o usuário digite os nomes dos alunos, que serão armazenados no vetor aluno.
- Solicitar que o usuário digite as notas dos alunos, que deverão ser armazenados na matriz
notas (1ª coluna: nota AC1, 2ª coluna: nota AC2). O nome do 1º aluno estará no vetor aluno,
índice zero. As notas do 1º aluno estarão na matriz notas, na linha zero.
- Calcular a média das notas da AC1 (de todos os alunos) e colocar no vetor media, índice
zero.
- Calcular a média das notas de AC2 (de todos os alunos) e colocar no vetor media, índice 1.
- Calcular a média das notas da AC1 e AC2 do 1º aluno (índice zero) e colocar no vetor
mediaAluno, índice zero, e assim sucessivamente.
- Exibir os dados em forma de tabela, com os títulos das colunas, de forma que na 1ª coluna,
apareçam os nomes dos alunos. Na 2ª coluna, as notas AC1 de cada aluno, na 3ª coluna, as
notas AC2, na 4ª coluna a média dos alunos. Utilize a saída formatada para isso, alinhando o
nome à esquerda e as notas à direita.
- Na última linha, exiba as médias das notas (das colunas) AC1 e AC2.
 */

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Passo 1: Solicitar que o usuário digite maxAluno
        int maxAluno;
        do {
            System.out.print("Digite o número de alunos (entre 5 e 15): ");
            maxAluno = scanner.nextInt();

        } while (maxAluno < 5 || maxAluno > 15);
        // Passo 2: Criar os vetores e a matriz necessários
        String[] aluno = new String[maxAluno];
        double[][] notas = new double[maxAluno][2]; // 2 colunas para as notas AC1 e AC2
        double[] media = new double[2]; // Para armazenar as médias das notas AC1 e AC2
        double[] mediaAluno = new double[maxAluno]; // Para armazenar a média de cada aluno

        // Passo 3: Solicitar que o usuário digite os nomes dos alunos e as notas
        System.out.println("Digite os nomes dos alunos e suas respectivas notas:");
        for (int i = 0; i < maxAluno; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            aluno[i] = scanner.next();
            System.out.print("Nota AC1: ");
            notas[i][0] = scanner.nextDouble();
            System.out.print("Nota AC2: ");
            notas[i][1] = scanner.nextDouble();
        }

        // Passo 4: Calcular as médias das notas
        for (int i = 0; i < maxAluno; i++) {
            mediaAluno[i] = (notas[i][0] + notas[i][1]) / 2.0;
            media[0] += notas[i][0]; // Soma das notas AC1
            media[1] += notas[i][1]; // Soma das notas AC2
        }
        media[0] /= maxAluno; // Média das notas AC1
        media[1] /= maxAluno; // Média das notas AC2

        // Passo 5: Exibir os dados em forma de tabela
        System.out.printf("\n%-20s%-10s%-10s%-10s\n", "Aluno", "AC1", "AC2", "Média");
        for (int i = 0; i < maxAluno; i++) {
            System.out.printf("%-20s%-10.2f%-10.2f%-10.2f\n", aluno[i], notas[i][0], notas[i][1], mediaAluno[i]);
        }
        System.out.printf("%-20s%-10.2f%-10.2f\n", "Média das Notas:", media[0], media[1]);

        scanner.close();
    }
}
