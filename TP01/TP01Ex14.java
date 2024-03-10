import java.util.Scanner;

//Sergio Wu e Leonardo de Lima
/*14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão digitados. */
public class TP01Ex14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();
    
        System.out.print("Digite a aresta do cubo: ");
        double aresta = scanner.nextDouble();
    
        double volumeEsfera = (4/3) * Math.PI * Math.pow(raio, 3);
        double volumeCubo = Math.pow(aresta, 3);
        double volumeLivre = volumeCubo - volumeEsfera;
    
        System.out.println("Valor Esfera e cubo respectivamente esfera " + volumeEsfera + " Cubo " + volumeEsfera + "O volume livre no ambiente é: " + volumeLivre);
        scanner.close();
    }
}
