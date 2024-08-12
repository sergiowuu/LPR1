import java.util.Scanner;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private static final String[] MESES = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    private static final Scanner scanner = new Scanner(System.in);

    public Data() {
        do {
            System.out.println("digite o dia:");
            dia = scanner.nextInt();
            System.out.println("digite o mês:");
            mes = scanner.nextInt();
            System.out.println("digite o ano:");
            ano = scanner.nextInt();
        } while (!dataValida(dia, mes, ano));
    }

    public Data(int d, int m, int a) {
        if (dataValida(d, m, a)) {
            this.dia = d;
            this.mes = m;
            this.ano = a;
        } else {
            throw new IllegalArgumentException("data invalida");
        }
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    // Setters
    public void setDia(int dia) {
        if (dataValida(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("dia inválido");
        }
    }

    public void setMes(int mes) {
        if (dataValida(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mês inválido");
        }
    }

    public void setAno(int ano) {
        if (dataValida(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("ano inválido");
        }
    }

    public String mostra1() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }

    public String mostra2() {
        return String.format("%02d/%s/%04d", this.dia, MESES[this.mes - 1], this.ano);
    }

    public boolean isBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    
    public String bissexto() {
        return isBissexto() ? "Sim" : "Não";
    }

    public int diasTranscorridos() {
        int dias = 0;
        for (int i = 1; i < this.mes; i++) {
            dias += diasNoMes(i, this.ano);
        }
        dias += this.dia;
        return dias;
    }

    public void apresentaDataAtual() {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, new Locale("pt", "BR"));
        System.out.println(dateFormat.format(new Date()));
    }

    private boolean dataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > diasNoMes(mes, ano)) {
            return false;
        }
        return true;
    }

    private int diasNoMes(int mes, int ano) {
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isBissexto() ? 29 : 28;
            default:
                return 31;
        }
    }

    @Override
    public String toString() {
        return mostra1();
    }
}