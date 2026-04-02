import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o primeiro numero inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo numero inteiro: ");
        int numero2 = scanner.nextInt();

        int menor;
        int maior;

        if (numero1 < numero2) {
            menor = numero1;
            maior = numero2;
        } else {
            menor = numero2;
            maior = numero1;
        }

        int numeroSorteado = random.nextInt(maior - menor + 1) + menor;

        if (numeroSorteado % 2 == 0) {
            System.out.println("Numero sorteado: " + numeroSorteado);
            System.out.println("O numero sorteado e par.");
        } else {
            System.out.println("Numero sorteado: " + numeroSorteado);
            System.out.println("O numero sorteado e impar.");
        }

        scanner.close();
    }
}
