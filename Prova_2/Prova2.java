public class Prova2 {
    public static void main(String[] args) {
        ConsultaAgendada p1 = new ConsultaAgendada(20, 45, 0, 11, 8, 2024, "Sergio", "Dr. Paulo Muzy" );

        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());
        System.out.println("Quantidade: " + ConsultaAgendada.getQuantidade());

        ConsultaAgendada p2 = new ConsultaAgendada();

        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Nome do Paciente: " + p2.getNomePaciente());
        System.out.println("Nome do Médico: " + p2.getNomeMedico());

        p1.setData(new Data(11, 8, 2024));
        p1.setHora(new Hora(21, 30, 0));
        System.out.println("Por favor insira os dados abaixo para completar as atualizações da consulta do: ");
        System.out.println("Paciente: " + p1.getNomePaciente() + " e "+" Médico: " + p1.getNomeMedico());
        System.out.println("No Dia: ");
        System.out.println("Data: " + p1.getData());
        System.out.println("No horário de: ");
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Digite o novo nome do paciente:");
        p1.setNomePaciente();

        System.out.println("Digite o novo nome do médico:");
        p1.setNomeMedico();

        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());

        System.out.println("Quantidade: " + ConsultaAgendada.getQuantidade());
    }
}