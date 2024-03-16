/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author rique
 */
public class JavaApplication1 {
//Declaração de Variáveis
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        int faturamentoJaneiro;// = 1500;
        int faturamentoFevereiro;// = 4500;
        int faturamentoMarco;// = 9800;
        int faturamentoTrimestre;// = faturamentoJaneiro + faturamentoFevereiro + faturamentoMarco;
        //System.out.println("Total do Faturamento Do trimestre eh: " + faturamentoTrimestre);
 
         System.out.println("Digite o faturamento de Janeiro: ");
         Scanner fatuJan = new Scanner(System.in);
         
         int a = fatuJan.nextInt();
         
         System.out.println("Digite o faturamento de Fevereiro: ");
         Scanner fatuFev = new Scanner(System.in);
         
         int b = fatuFev.nextInt();
         
         System.out.println("Digite o faturamento de Marco: ");
         Scanner fatuMar = new Scanner(System.in);
         
         int c = fatuMar.nextInt();
         
         faturamentoTrimestre = a + b + c; 
         
         System.out.println("O resultado da soma foi de: " + faturamentoTrimestre);
    }
    
}
