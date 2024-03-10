import java.util.Scanner;

//Sergio Wu e Leonardo de Lima
//5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.
public class TP01Ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite o valor do diâmetro da esfera: ");
        double diametro = scanner.nextDouble();
    
        double raio = diametro / 2;
        double volume = (4/3) * Math.PI * Math.pow(raio, 3);
    
        System.out.println("O volume da esfera é: " + volume);
        scanner.close();
    }
}
