package Questao_2;

import java.util.Scanner;

/**
 *
 * @author rafael.fgoulart1
 */
public class Menu {
    public static void main(String[] args) {
        start();
    }
    
    public static void start() {
        menu();
    }
    
    public static void menu() {
        Scanner inp = new Scanner(System.in);
        
        try {
            System.out.println("Eu sei dividir!");
            System.out.println("Informe o primeiro valor: ");
            int x = inp.nextInt();
            System.out.println("Informe o segundo valor: ");
            int y = inp.nextInt();
            double r = (x / y);
            System.out.println("O resultado da divisão é: " + r);
        } catch (ArithmeticException aex) {
            System.out.println("Não é possível dividir por Zero guri!\n" + aex.getMessage());   
            start();
        } catch (NumberFormatException nex) {
            System.out.println("Informe os números corretamente!\n" + nex.getMessage());            
            start();
        } catch (NullPointerException npex) { 
            System.out.println("É necessário informar os número!\n" + npex.getMessage());            
            start();
        } catch (Exception ex) {
            System.out.println("Algo de errado não está certo!\n" + ex.getMessage());
            start();
        } finally {
            System.out.println("Auf wiedersehen!\n");
        }
    }
}