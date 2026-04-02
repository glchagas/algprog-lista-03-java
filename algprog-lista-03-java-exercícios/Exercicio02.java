import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        int valorCompra = scanner.nextInt();

        System.out.print("Digite o valor pago: ");
        int valorPago = scanner.nextInt();

        if (valorPago < valorCompra) {
            System.out.println("Quantia paga insuficiente para realizar a compra.");
        } else {
            int troco = valorPago - valorCompra;
            int[] notas = {50, 20, 10, 5, 2, 1};

            System.out.println("Troco: R$ " + troco + ",00");

            for (int nota : notas) {
                int quantidade = troco / nota;
                troco = troco % nota;
                System.out.println("Notas de R$ " + nota + ",00: " + quantidade);
            }
        }

        scanner.close();
    }
}
