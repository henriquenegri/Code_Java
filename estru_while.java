import java.util.Scanner;

public class Exercicios {
   
    public static void main(String[] args) {
        // Cria um objeto Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        int valor = 1;
        int limite = 20;

        while (valor <= limite) {
            if (ehPar(valor)) {
                System.out.println("Executando: " + valor);
            }
            valor++;
        }

        scanner.close();
    }

    public static boolean ehPar(int n) {
        return (n % 2) == 0;
    }
}
