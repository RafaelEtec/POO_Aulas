package Aula_31_03_2023;

public class Loja {
    public Animal store[];

    public Loja(int q) {
        store = new Animal[q];
    }

    public void inserirAnimal(int pos, Animal a) {
        if (pos >= store.length) {
            System.out.println("Posição Inválida!");
        } else {
            if (store[pos] == null){
                store[pos] = a;
            } else {
                System.out.println("Posição Ocupada!");
            }
        }
    }
    
    public void mostrarLoja() {
        for (int i = 0; i < store.length; i++) {
            if (store[i] != null) {
                store[i].mostrarAnimal();
            }
        }
    }
    
    public void excluirAnimal(int pos){
        if (pos>=store.length) {
            System.out.println("Posicao Invalida");
        } else {
            if (store[pos] != null) {     
                store[pos] = null;
                System.out.println("Excluido!");
            }
        }
    }
   
    public void alterarAnimal(int pos, Animal a){
        if (pos>=store.length) {
            System.out.println("Posicao Inválida");
        } else {
            if (store[pos] != null) {
                store[pos]=a;
            }
        }
    }
    
    public void buscarAnimal(String nome) {
        boolean sai = false;
        for (int i = 0; i < store.length; i++) {
            if (store[i] != null) {
                if (store[i].getNome().equals(nome)) {
                    store[i].mostrarAnimal();
                    sai = true;
                }
            }
        }
        if (sai != true) {
            System.out.println(nome + " Não foi encontrado!");
        }
    }
}
