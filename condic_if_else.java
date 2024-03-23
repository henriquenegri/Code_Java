import java.util.Scanner;

public class Exercicios {
   
    public static void main(String[] args) {
        // Cria um objeto Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Informe o segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.println("Informe o terceiro numero: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O primeiro eh o maior numero!");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O segundo eh o maior numero!");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("O terceiro eh o maior numero!");
        } else {
            System.out.println("Numeros iguais foram repetidos!");
        }

        scanner.close();
    }
}
