package Aula_5_Exercicio;

import java.util.Scanner;

/**
 * @author rafael.fgoulart1
**/

public class Midia {
    private Scanner inp = new Scanner(System.in);
    private static int indice = 0;
    
    private int codigo;
    private double preco;
    private String nome;
    
    public Midia() {}
    
    public Midia(int c, double p, String n) {
        codigo = c;
        preco = p;
        nome = n;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int c) {
        this.codigo = c;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double p) {
        this.preco = p;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }
    
    public String getTipo() {
        return "Mídia";
    }
    
    public String getDetalhes() {
        return "Código\nPreço\nNome";
    }
    
    public void printDado() {
        System.out.println("ID: " + getCodigo() + "\n  Nome: " + getNome() + "\n  Preço: " + getPreco());
    }
    
    public void inserirDado() {
        System.out.println(" - Informe o novo nome: ");
        this.setNome(inp.nextLine());
        System.out.println(" - Informe o novo preço: ");
        this.setPreco(inp.nextDouble());
    }
}