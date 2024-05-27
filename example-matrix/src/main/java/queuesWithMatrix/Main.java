package queuesWithMatrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Repositorio repositorio = new Repositorio();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1- Salvar objeto");
            System.out.println("2- Deletar objeto");
            System.out.println("3- Exibir");
            System.out.println("4- Desfazer");
            System.out.println("5- Fim");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Remedio remedio = new Remedio(
                            1,
                            3,
                            "Trembolona",
                            100.00,
                            "Fabrica dos mosntros");

                    repositorio.salvar(remedio);
                    break;

                case 2:
                    System.out.print("Digite o ID do objeto a ser deletado: ");
                    int idDeletar = scanner.nextInt();
                    repositorio.deletar(idDeletar);
                    break;

                case 3:
                    repositorio.exibir();
                    break;

                case 4:
                    repositorio.desfazer();
                    break;

                case 5:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;

            }
        } while (opcao != 5);
        scanner.close();
    }
}