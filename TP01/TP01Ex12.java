import java.util.Scanner;
import java.lang.Math;

//Sergio Wu e Leonardo de Lima
//12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serão digitados.
public class TP01Ex12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite a altura do cone: ");
        double altura = scanner.nextDouble();
    
        System.out.print("Digite o raio da Base do cone: ");
        double raio = scanner.nextDouble();
    
        double volume = (Math.PI * raio * raio * altura) / 3;
    
        System.out.println("O volume do cone é: " + volume);
        scanner.close();
    }

    
}
