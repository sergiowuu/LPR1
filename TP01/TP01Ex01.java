import java.util.Scanner;

//Sergio Wu e Leonardo de Lima
//1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
public class TP01Ex01 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("A área do retângulo é: " + area);
        scanner.close();
    }
}
