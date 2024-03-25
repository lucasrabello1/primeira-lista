import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor inteiro: ");
        int valor1 = scanner.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        int valor2 = scanner.nextInt();
        System.out.print("Digite o terceiro valor inteiro: ");
        int valor3 = scanner.nextInt();
        int menor, meio, maior;
        menor = Math.min(valor1, Math.min(valor2, valor3));
        maior = Math.max(valor1, Math.max(valor2, valor3));
        if (valor1 != menor && valor1 != maior) {
            meio = valor1;
        } else if (valor2 != menor && valor2 != maior) {
            meio = valor2;
        } else {
            meio = valor3;
        }
        System.out.println("Valores em ordem crescente: " + menor + ", " + meio + ", " + maior);
    
        scanner.close();
    }
}
