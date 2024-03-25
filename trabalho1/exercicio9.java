import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor para A: ");
        int A = scanner.nextInt();
        System.out.print("Digite o valor para B: ");
        int B = scanner.nextInt();
        if (A == B) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
            int maior = (A > B) ? A : B;
            System.out.println("O maior número é: " + maior);
        }
        scanner.close();
    }
}
