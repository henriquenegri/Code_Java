import java.util.Scanner;

public class Exercicios {
   
    public static void main(String[] args) {
        // Cria um objeto Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Digite o valor da Gasolina: ");
        double gasosa = scanner.nextDouble();

        System.out.println("Digite o valor do Etanol: ");
        double etanol = scanner.nextDouble();

       double porcentagem = gasosa * 0.7;

       if (etanol<porcentagem)
       {
        System.out.println("Compensa comprar Etanol");
       }
       else{
        System.out.println("Compensa comprar gasolina");
       }

        scanner.close();
    }
}
