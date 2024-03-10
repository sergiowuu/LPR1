import java.util.Scanner;

//Sergio Wu e Leonardo de Lima
//11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
public class TP01Ex11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite o diâmetro do círculo: ");
        double diametro = scanner.nextDouble();
    
        double raio = diametro / 2;
        double area = Math.PI * Math.pow(raio, 2);
    
        System.out.println("A área do círculo é: " + area);
        scanner.close();
    }
}
