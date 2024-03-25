import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            if (numero >= 100 && numero <= 200) {
                System.out.println("O número está no intervalo entre 100 e 200.");
            } else {
                System.out.println("O número está fora do intervalo entre 100 e 200.");
            }
        } else {
            System.out.println("Por favor, digite um número válido.");
        }
        scanner.close();
    }
}
