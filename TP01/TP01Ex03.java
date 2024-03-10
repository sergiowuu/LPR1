import java.util.Scanner;

//Sergio Wu e Leonardo de Lima
//3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.
public class TP01Ex03 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite o valor da diagonal do quadrado: ");
        double diagonal = scanner.nextDouble();
    
        double area = (diagonal * diagonal) / 2;
    
        System.out.println("A área do quadrado é: " + area);
        scanner.close();
    }
    
}
