import java.util.Scanner;

public class Exercicios {
   
    public static void main(String[] args) {
        // Cria um objeto Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos calcular o seu IMC");

        System.out.print("Digite o peso em quilogramas: ");
        double peso = scanner.nextDouble();

        // Solicita ao usuário que insira a altura em metros
        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC eh: "+imc);

        scanner.close();
    }
}
