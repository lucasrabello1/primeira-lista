import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double tempo, velocidadeMedia;
        while (true) {
            try {
                System.out.print("Digite o tempo de viagem (em horas): ");
                tempo = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, insira um valor numérico para o tempo de viagem.");
                scanner.next();
            }
        }
        while (true) {
            try {
                System.out.print("Digite a velocidade média da viagem (em km/h): ");
                velocidadeMedia = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, insira um valor numérico para a velocidade média.");
                scanner.next();
            }
        }
        if (tempo <= 0 || velocidadeMedia <= 0) {
            System.out.println("Erro: O tempo de viagem e a velocidade média devem ser valores positivos.");
            return;
        }
        double distancia = velocidadeMedia * tempo;
        double consumoPorLitro = 12.0;
        double litros = distancia / consumoPorLitro;
        System.out.printf("A quantidade de litros de combustível gasta na viagem é: %.2f\n", litros);
        scanner.close();
    }
}
