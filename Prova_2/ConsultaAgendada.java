import java.util.Scanner;

public class ConsultaAgendada {
    private Data data;
    private Hora hora;
    private String nomePaciente;
    private static int quantidade = 0;
    private String nomeMedico;
    private static final Scanner scanner = new Scanner(System.in);

    public ConsultaAgendada() {
        this.data = new Data();
        this.hora = new Hora();
        System.out.println("Por favor, insira o nome do paciente:");
        this.nomePaciente = scanner.nextLine();
        System.out.println("Por favor, insira o nome do médico:");
        this.nomeMedico = scanner.nextLine();
        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String me) {
        this.data = new Data(d, m, a);
        this.hora = new Hora(h, mi, s);
        this.nomePaciente = p;
        this.nomeMedico = me;
        quantidade++;
    }

    public ConsultaAgendada(Data d, Hora h, String p, String me) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = me;
        quantidade++;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public void setData(int a, int b, int c) {
        this.data = new Data(a, b, c);
    }

    public void setData() {
        this.data = new Data(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }

    public void setHora(int a, int b, int c) {
        this.hora = new Hora(a, b, c);
    }

    public void setHora() {
        this.hora = new Hora(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }

    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }

    public void setNomePaciente() {
        
        this.nomePaciente = scanner.nextLine();
    }

    public void setNomeMedico(String me) {
        this.nomeMedico = me;
    }

    public void setNomeMedico() {
        
        this.nomeMedico = scanner.nextLine();
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public String getData() {
        return data.toString();
    }

    public String getHora() {
        return hora.toString();
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }
}