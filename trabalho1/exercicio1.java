import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (numero > 10) {
            System.out.println("Número maior do que 10!");
        } else {
            System.out.println("Número menor ou igual a 10!");
        }
        
        scanner.close();
    }
}
