import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.141592;

        System.out.print("Digite o codigo da operacao: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite o raio: ");
        double raio = scanner.nextDouble();

        if (codigo == 1) {
            double perimetro = 2 * PI * raio;
            System.out.println("Perimetro do circulo: " + perimetro);
        } else if (codigo == 2) {
            double area = PI * Math.pow(raio, 2);
            System.out.println("Area do circulo: " + area);
        } else if (codigo == 3) {
            double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);
            System.out.println("Volume da esfera: " + volume);
        } else {
            System.out.println("Codigo da operacao invalido.");
        }

        scanner.close();
    }
}
