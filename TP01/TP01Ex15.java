import java.util.Scanner;

//Sergio Wu e Leonardo de Lima
//15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).
public class TP01Ex15 {

       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("digite a cotação do dolar: ");
        double cotacao = scanner.nextDouble();
    
        System.out.print("Digite a quantidade de dolares: ");
        double dolares = scanner.nextDouble();
    
        double reais = cotacao * dolares;
    
        System.out.println("O valor em Reais é: R$" + reais);
        scanner.close();
    }
}
