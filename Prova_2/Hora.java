import java.util.Scanner;

public class Hora {
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
    
    @Override
    public String toString() {
        return getHora1();
    }
}