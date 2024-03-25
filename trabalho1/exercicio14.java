import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro termo (a1) da Progressão Aritmética: ");
        int a1 = scanner.nextInt();
        System.out.print("Digite o número do termo desejado (n) da Progressão Aritmética: ");
        int n = scanner.nextInt();
        System.out.print("Digite a razão (r) da Progressão Aritmética: ");
        int r = scanner.nextInt();
        if (r == 0) {
            System.out.println("A razão não pode ser zero. Por favor, insira um valor válido para a razão.");
            return;
        }
        int an = a1 + (n - 1) * r;
        System.out.println("O " + n + "º termo da Progressão Aritmética é: " + an);
        scanner.close();
    }
}
