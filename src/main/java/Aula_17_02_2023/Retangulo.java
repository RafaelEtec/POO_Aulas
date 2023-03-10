package Aula_17_02_2023;

import java.util.Scanner;

public class Retangulo {
    double base, altura, area;
    
    void mandaBaseAltura() {
        Scanner ot = new Scanner(System.in);
        
        System.out.println("Base: ");
        base = ot.nextDouble();
        System.out.println("Altura: ");
        altura = ot.nextDouble();
    }
    
    void calcularArea() {
        mandaBaseAltura();
        area = base * altura;
        System.out.println("Sendo a Base: " + base + "cm e a Altura: " + altura + "cm\nA Area é: " + area);
    }
}