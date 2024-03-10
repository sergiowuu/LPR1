import java.util.Scanner;

//Sergio Wu e Leonardo de Lima
//17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
public class TP01Ex17 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite o valor de X: ");
        double x = scanner.nextDouble();
    
        System.out.print("Digite o valor de Y: ");
        double y = scanner.nextDouble();
    
        double resultado = Math.pow(x, y);
    
        System.out.println("O resultado de X elevado a Y é: " + resultado);
        scanner.close();
    }
}
