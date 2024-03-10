import java.util.Scanner;

//Sergio Wu e Leonardo de Lima
//2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
public class TP01Ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da aresta do quadrado: ");
        double aresta = scanner.nextDouble();

        double area = Math.pow(aresta, 2);

        System.out.println("A área do quadrado é: " + area);

        scanner.close();
    }
}
