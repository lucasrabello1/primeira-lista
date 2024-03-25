import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        if (scanner.hasNextDouble()) {
            double celsius = scanner.nextDouble();
            double fahrenheit = (9 * celsius + 160) / 5;
            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        } else {
            System.out.println("Por favor, digite um número válido para a temperatura.");
        }
        scanner.close();
    }
}
