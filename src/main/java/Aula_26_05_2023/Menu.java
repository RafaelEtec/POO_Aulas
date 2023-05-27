package Aula_26_05_2023;

import javax.swing.*;

/**
 *
 * @author rafael.fgoulart1
 */
public class Menu {
    public static void main(String[] args) {
        
        try {
            String strNome = JOptionPane.showInputDialog(null, "Qualé o seu nome?");
            String strIdade = JOptionPane.showInputDialog(null, "Qualé a sua idade?");
            int idade = Integer.parseInt(strIdade);
            JOptionPane.showMessageDialog(null, "Olá " + strNome + "!\nVocê tem " + idade + " anos.");
            
            int porZero = idade/0;
        } catch (ArithmeticException exA) {
            JOptionPane.showMessageDialog(null, "Não é possível dividir por zero!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            JOptionPane.showMessageDialog(null,"Tchau!\n");
        }
    }
}