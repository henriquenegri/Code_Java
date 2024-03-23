import java.util.Scanner;

public class Exercicios {
   
    public static void main(String[] args) {
        // Cria um objeto Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para saber sua tabuada: ");
        int num = scanner.nextInt();

        System.out.println("Tabuada do"+ num + ":");

        for (int i = 0; i<=10; i++)
        {
            int resultado = num * i;
            System.out.println(num +"x"+ i +"=" + resultado);
        }

        scanner.close();
    }
}
