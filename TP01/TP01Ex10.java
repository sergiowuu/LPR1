import java.util.Scanner;

//Sergio Wu e Leonardo de Lima
//10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.
public class TP01Ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();
    
        double fahrenheit = (celsius * 9/5) + 32;
    
        System.out.println("a temperatura em Farenheit é: " + fahrenheit);
        scanner.close();
    }
}