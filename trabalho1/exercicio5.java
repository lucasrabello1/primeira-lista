import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor para a variável A: ");
        int A = scanner.nextInt();
    
        System.out.print("Digite o valor para a variável B: ");
        int B = scanner.nextInt();
        
        System.out.println("Valores originais:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        
        int temp = A;
        A = B;
        B = temp;
        
        System.out.println("\nValores após a troca:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        scanner.close();
    }
}
