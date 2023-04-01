package Aula_31_03_2023;

public class Animal {
    private String especie;
    private String nome;
    private int idade;

    public Animal() {
    }

    public Animal(String especie, String nome, int idade) {
        this.especie = especie;
        this.nome = nome;
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void mostrarAnimal() {
        System.out.println(
            "Espécie: " + getEspecie() +
            "\n  Nome: " + getNome() +
            "\n  Idade: " + getIdade() + "\n");
    }
}