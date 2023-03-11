package Aula_5_Exercicio;

/**
 * @author rafael.fgoulart1
**/

public class Main {
    public static void main(String[] args) {
        Midia midia1 = new Midia(1, 12.50, "Midia 1");
        Midia midia2 = new Midia(2, 10.50, "Midia 2");
        Midia midia3 = new Midia(3, 10, "Midia 3");
        Midia midia4 = new Midia(4, 15.50, "Midia 4");
        Midia midia5 = new Midia(5, 12.50, "Midia 5");
        
        midia2.getDetalhes();
        midia4.getTipo();
        
        midia1.printDado();
        midia2.printDado();
        midia3.printDado();
        midia4.printDado();
        midia5.printDado();
        
        midia1.inserirDado();
        midia1.printDado();
    }
}