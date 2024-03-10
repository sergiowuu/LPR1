import java.util.Scanner;

//Sergio Wu e Leonardo de Lima
/*16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos. */
public class TP01Ex16 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("digite o valor de um angulo em graus: ");
        double anguloGraus = scanner.nextDouble();
    
        double anguloRadianos = Math.toRadians(anguloGraus);
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);
        double secante = 1 / cosseno;
    
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);
        scanner.close();
    }
}
