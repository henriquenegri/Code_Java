import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicios {
   
    public static void main(String[] args) {
        // Cria um objeto Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Adicao");
        System.out.println("2.Subtracao");
        System.out.println("3.Divisao");
        System.out.println("4.Multiplicacao");
       
        System.out.println("Informe qual operacao gostaria de executar: ");
        int opcao = scanner.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Escolheu a opcao de adicao");

                System.out.print("Digite o primeiro número: ");
                int primeiroNumero = scanner.nextInt();
       
                // Solicita ao usuário para inserir o segundo número
                System.out.print("Digite o segundo número: ");
                int segundoNumero = scanner.nextInt();

                int soma = primeiroNumero + segundoNumero;

                System.out.println("A soma dos numeros sao: "+soma);
                break;

            case 2:
                System.out.println("Escolheu a opcao de Subtracao");

                System.out.println("Digite o primeiro numero: ");
                int sub1 = scanner.nextInt();

                System.out.println("Digite o segundo numero: ");
                int sub2 = scanner.nextInt();

                int subtracao = sub1 - sub2;
                System.out.println("A subtracao dos numeros desejados foram: "+subtracao);
                break;

            case 3:
                System.out.println("Escolheu a opcao de Multiplicacao");

                System.out.println("Digite o primeiro numero: ");
                int mult1 = scanner.nextInt();

                System.out.println("Digite o segundo numero: ");
                int mult2 = scanner.nextInt();

                int multiplicacao = mult1 * mult2;
                System.out.println("A subtracao dos numeros desejados foram: "+multiplicacao);
                break;

            case 4:
                System.out.println("Digite o primeiro numero: ");
                int div1 = scanner.nextInt();

                System.out.println("Digite o segundo numero: ");
                int div2 = scanner.nextInt();

                int divisao = div1 / div2;
                System.out.println("A subtracao dos numeros desejados foram: "+divisao);
                break;
            default:
                break;
        } scanner.close();
    }
}
