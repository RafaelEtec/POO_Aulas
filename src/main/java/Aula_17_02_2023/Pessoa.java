package Aula_17_02_2023;

import java.util.Scanner;

public class Pessoa {
    
    Scanner inp = new Scanner(System.in);
    String nome;
    int idade, dias;

    void pegaInfo() {
        System.out.println(" - Informe seu Nome: ");
        nome = inp.nextLine();
        System.out.println(" - Informe sua Idade: ");
        idade = inp.nextInt();
    }
    
    void anosParaDias() {
        pegaInfo();
        dias = idade * 360;
        System.out.println(" - Tendo 1 ano 360 dias\n - Você nasceu à cerca de " + dias + " dias atrás.");
    }
}