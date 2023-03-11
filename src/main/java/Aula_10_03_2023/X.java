package Aula_10_03_2023;

public class X {
    private int atribA;
    private double atribB;
    
    public X() {}
    
    public X(int a, double b) {
        atribA = a;
        atribB = b;
    }

    public int getAtribA() {
        return atribA;
    }

    public void setAtribA(int atribA) {
        this.atribA = atribA;
    }

    public double getAtribB() {
        return atribB;
    }

    public void setAtribB(double atribB) {
        this.atribB = atribB;
    }
    
    public void mostrar() {
        System.out.println("  A: " + getAtribA());
        System.out.println("  B: " + getAtribB() + "\n");
    }
}