import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();
        
        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o operador aritmético (+, -, * ou /): ");
        char operador = scanner.next().charAt(0); 
        double resultado = 0;
        switch (operador) {
            case '+':
                resultado = A + B;
                break;
            case '-':
                resultado = A - B;
                break;
            case '*':
                resultado = A * B;
                break;
            case '/':
                if (B != 0) {
                    resultado = A / B;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    return;
                }
                break;
            default:
                System.out.println("Operador não definido!");
                return;
        }
        System.out.println("Resultado da operação: " + resultado);
        scanner.close();
    }
}
