import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double raio, altura;
        while (true) {
            System.out.print("Digite o raio do cilindro: ");
            if (scanner.hasNextDouble()) {
                raio = scanner.nextDouble();
                break;
            } else {
                System.out.println("Erro: Por favor, insira um valor numérico para o raio.");
                scanner.next(); 
            }
        }
        while (true) {
            System.out.print("Digite a altura do cilindro: ");
            if (scanner.hasNextDouble()) {
                altura = scanner.nextDouble();
                break;
            } else {
                System.out.println("Erro: Por favor, insira um valor numérico para a altura.");
                scanner.next();
            }
        }
        if (raio <= 0 || altura <= 0) {
            System.out.println("Erro: O raio e a altura devem ser valores positivos.");
            return;
        }
        double volume = 3.14 * raio * raio * altura;
        System.out.printf("Volume do cilindro: %.2f\n", volume);
        scanner.close();
    }
}
