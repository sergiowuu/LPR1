package TP04;

import java.util.Scanner;

// Sergio Wu CB3025691 e Leonardo de Lima CB3026655

public class TP04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia, mes, ano;

        do {
            System.out.println("Digite o dia (1-30):");
            dia = scanner.nextInt();
        } while (dia < 1 || dia > 30);

        do {
            System.out.println("Digite o mes (1-12):");
            mes = scanner.nextInt();
        } while (mes < 1 || mes > 12);

        System.out.println("Digite o ano:");
        ano = scanner.nextInt();

        Data data = new Data(dia, mes, ano);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Mostrar data no formato dd/mes/aaaa");
            System.out.println("2. Mostrar data no formato dd/mes/aaaa");
            System.out.println("3. Verificar se o ano é bissexto");
            System.out.println("4. Calcular dias transcorridos");
            System.out.println("5. Apresentar data atual");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(data.mostra1());
                    break;
                case 2:
                    System.out.println(data.mostra2());
                    break;
                case 3:
                    System.out.println("O ano é bissexto? " + data.bissexto());
                    break;
                case 4:
                    System.out.println("Dias transcorridos: " + data.diasTranscorridos());
                    break;
                case 5:
                    data.apresentaDataAtual();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
