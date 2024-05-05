package TP03;

import java.util.Scanner;

//Sergio Wu CB3025691 e Leonardo de Lima CB3026655

public class javaTP03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hora hora = new Hora();

        while (true) {
            System.out.println("1. Seta hora");
            System.out.println("2. Seta minuto");
            System.out.println("3. Seta segundo");
            System.out.println("4. Pegar hora");
            System.out.println("5. pegar minuto");
            System.out.println("6. pegar segundo");
            System.out.println("7. pegar hora no formato hh:mm:ss");
            System.out.println("8. pegar hora no formato hh:mm:ss AM/PM");
            System.out.println("9. Pegar total de segundos");
            System.out.println("10. Sair");
            System.out.println("Escolha uma opção:");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("------------------");
                    hora.setHora();
                    System.out.println("------------------");
                    break;
                case 2:
                    System.out.println("------------------");
                    hora.setMin();
                    System.out.println("------------------");
                    break;
                case 3:
                    System.out.println("------------------");
                    hora.setSeg();
                    System.out.println("------------------");
                    break;
                case 4:
                    System.out.println("------------------");
                    System.out.println("Hora: " + hora.getHora());
                    System.out.println("------------------");
                    break;
                case 5:
                    System.out.println("------------------");
                    System.out.println("Minuto: " + hora.getMin());
                    System.out.println("------------------");
                    break;
                case 6:
                    System.out.println("------------------");
                    System.out.println("Segundo: " + hora.getSeg());
                    System.out.println("------------------");
                    break;
                case 7:
                    System.out.println("------------------");
                    System.out.println("Hora no formato hh:mm:ss: " + hora.getHora1());
                    System.out.println("------------------");
                    break;
                case 8:
                    System.out.println("------------------");
                    System.out.println("Hora no formato hh:mm:ss AM/PM: " + hora.getHora2());
                    System.out.println("------------------");
                    break;
                case 9:
                    System.out.println("------------------");
                    System.out.println("Total de segundos: " + hora.getSegundos());
                    System.out.println("------------------");
                    break;
                case 10:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

 class Hora {
    private int hora;
    private int min;
    private int seg;

    public Hora() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite a hora (0-23):");
            this.hora = scanner.nextInt();
        } while (this.hora < 0 || this.hora > 23);

        do {
            System.out.println("Digite os minutos (0-59):");
            this.min = scanner.nextInt();
        } while (this.min < 0 || this.min > 59);

        do {
            System.out.println("Digite os segundos (0-59):");
            this.seg = scanner.nextInt();
        } while (this.seg < 0 || this.seg > 59);
    }

    public Hora(int h, int m, int s) {
        this.hora = h;
        this.min = m;
        this.seg = s;
    }

     public void setHora() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Digite a hora (0-23):");
            this.hora = scanner.nextInt();
        } while (this.hora < 0 || this.hora > 23);
        System.out.println("Hora setada com sucesso!");
    }

    public void setMin() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Digite os minutos (0-59):");
            this.min = scanner.nextInt();
        } while (this.min < 0 || this.min > 59);
        System.out.println("Minuto setado com sucesso!");
    }

    public void setSeg() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Digite os segundos (0-59):");
            this.seg = scanner.nextInt();
        } while (this.seg < 0 || this.seg > 59);
        System.out.println("Segundo setado com sucesso!");
    }

    public int getHora() {
        return this.hora;
    }

    public int getMin() {
        return this.min;
    }

    public int getSeg() {
        return this.seg;
    }

    public String getHora1() {
        return String.format("%02d:%02d:%02d", this.hora, this.min, this.seg);
    }

    public String getHora2() {
        int hour = this.hora;
        String ampm;
        if (hour >= 12) {
            ampm = "PM";
            if (hour > 12) {
                hour -= 12;
            }
        } else {
            ampm = "AM";
            if (hour == 0) {
                hour = 12;
            }
        }
        return String.format("%02d:%02d:%02d %s", hour, this.min, this.seg, ampm);
    }

    public int getSegundos() {
        return this.hora * 3600 + this.min * 60 + this.seg;
    }
    
}