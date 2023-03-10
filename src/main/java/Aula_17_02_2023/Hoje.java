package Aula_17_02_2023;

import java.util.Scanner;

public class Hoje {
    /*            - Buffer (de entrada) -
                  -Definição-   ------------Existe---------   
    Classe = Abstração do mundo real*/
    public static Scanner inp = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Pessoa Eu = new Pessoa();
        Eu.anosParaDias();
        
        /**
        Retangulo r = new Retangulo();
        r.calcularArea();
        
        Quadrado q = new Quadrado();
        q.calcularArea();
        
        Pessoa Eu = new Pessoa();
        Pessoa Voce = new Pessoa();
        
        Eu.nome = "Rafael Goulart";
        Eu.idade = 20;
        
        System.out.println("Meu nome é " + Eu.nome + "\nE tenho " + Eu.idade + " anos.\nQualé seu nome?");
        Voce.nome = inp.nextLine();
        System.out.println("E a sua idade?");
        Voce.idade = inp.nextInt();
        System.out.println("Olá, " + Voce.nome + "\nVocê está na Terra há " + Voce.idade + " anos.");
        **/
    }
}