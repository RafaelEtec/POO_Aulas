package Aula_17_02_2023;

import java.util.Scanner;

public class Quadrado {
    
    double lado, area;

    void entrarLado() {
        Scanner ot = new Scanner(System.in);
        
        System.out.println("Lado: ");
        lado = ot.nextDouble();
    }
    
    void calcularArea() {
        entrarLado();
        area = lado * lado;
        System.out.println("Area: " + area);
    }
}