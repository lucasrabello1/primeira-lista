import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int A = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int B = scanner.nextInt();

        if (A == B) {
            System.out.println("A sequência de números informados é inválida, pois ambos são iguais.");
        } else {
            int maior = (A > B) ? A : B;
            System.out.println("O maior número é: " + maior);
        }
        scanner.close();
    }
}
