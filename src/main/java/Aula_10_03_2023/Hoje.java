package Aula_10_03_2023;

public class Hoje {
    public static void main(String[] args) {
        X oX = new X();
        X oX1 = new X(10, 3.7);
        
        System.out.println("Objeto 1");
        oX.setAtribA(1);
        oX.setAtribB(2);
        oX.mostrar();
        
        System.out.println("Objeto 2 - Antes");
        oX1.mostrar();
        
        System.out.println("Objeto 2 - Depois");
        oX1.setAtribA(oX1.getAtribA() + 10);
        oX1.setAtribB(11);
        oX1.mostrar();
    }
}