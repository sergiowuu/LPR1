import java.util.Scanner;

//Sergio Wu e Leonardo de Lima
/*13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso 
(em s) que serão digitados. */
public class TP01Ex13 {

       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite a velocidade inicial (em m/s): ");
        double velocidadeInicial = scanner.nextDouble();
    
        System.out.print("Digite a aceleração (em m/s^2): ");
        double aceleracao = scanner.nextDouble();
    
        System.out.print("Digite o tempo de percurso (em s): ");
        double tempo = scanner.nextDouble();
    
        double velocidadeFinal = (velocidadeInicial + aceleracao * tempo) * 3.6;
    
        System.out.println("A velocidade final é: " + velocidadeFinal + " km/h");
        scanner.close();
    }
    
}
