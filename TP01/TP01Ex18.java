import java.util.Scanner;

//Sergio Wu e Leonardo de Lima
/*18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido. */
public class TP01Ex18 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        double total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o valor do produto " + i + ": ");
            total += scanner.nextDouble();
        }
    
        System.out.print("Digite o valor pago: ");
        double pago = scanner.nextDouble();
    
        double troco = pago - total;
    
        System.out.println("O troco é: R$" + troco);
        scanner.close();
    }
}
