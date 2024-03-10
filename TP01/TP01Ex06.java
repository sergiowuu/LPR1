import java.util.Scanner;

//Sergio Wu e Leonardo de Lima
//6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
public class TP01Ex06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
    
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
    
        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();
    
        System.out.print("Digite o quarto valor: ");
        double valor4 = scanner.nextDouble();
    
        double media = (valor1 + valor2 + valor3 + valor4) / 4;
    
        System.out.println("A média aritmética é: " + media);
        scanner.close();
    }
    
}
