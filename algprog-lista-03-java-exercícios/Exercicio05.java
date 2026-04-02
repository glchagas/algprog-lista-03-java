import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o simbolo da operacao (+, -, *, /, ^): ");
        String simbolo = scanner.next();

        double resultado;

        switch (simbolo) {
            case "+":
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case "-":
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case "*":
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case "/":
                if (numero2 == 0) {
                    System.out.println("Nao e possivel dividir por zero.");
                } else {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                }
                break;
            case "^":
                resultado = Math.pow(numero1, numero2);
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Simbolo da operacao invalido.");
                break;
        }

        scanner.close();
    }
}
