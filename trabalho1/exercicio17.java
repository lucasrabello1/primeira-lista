import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nota1, nota2, nota3, peso1, peso2, peso3;
        try {
            System.out.print("Digite a primeira nota: ");
            nota1 = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Digite o peso da primeira nota: ");
            peso1 = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Digite a segunda nota: ");
            nota2 = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Digite o peso da segunda nota: ");
            peso2 = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Digite a terceira nota: ");
            nota3 = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Digite o peso da terceira nota: ");
            peso3 = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, insira valores numéricos válidos.");
            return;
        }
        if (peso1 <= 0 || peso2 <= 0 || peso3 <= 0) {
            System.out.println("Erro: Os pesos devem ser valores positivos.");
            return;
        }
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        System.out.printf("Média ponderada: %.2f\n", mediaPonderada);
        scanner.close();
    }
}
