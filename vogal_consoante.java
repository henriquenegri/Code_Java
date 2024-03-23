import java.util.Scanner;

public class Exercicios {
   
    public static void main(String[] args) {
        // Cria um objeto Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        if(letra == 'a' || letra =='A' || letra == 'e' || letra == 'E'
        || letra =='i' || letra == 'I' || letra == 'o' || letra == 'O' || letra == 'u' || letra == 'U')
        {
            System.out.println("A letra digitada eh uma vogal: "+ letra);
        }
        else{
            System.out.println("A letra digitada eh uma consoante: "+ letra);
        }
        scanner.close();
    }
}
