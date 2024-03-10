import java.util.Scanner;

//Sergio Wu e Leonardo de Lima
/*8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros. */
public class TP01Ex08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite o valor em milhas maritimas: ");
        double milhas = scanner.nextDouble();
    
        double metros = milhas * 1852;
        double quilometros = metros / 1000;
    
        System.out.println("O valor em quilômetros é: " + quilometros);
        scanner.close();
    }
}
