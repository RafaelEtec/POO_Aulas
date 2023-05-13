package Aula_12_05_2023;

/**
 *
 * @author Rafael.fgoulart1
 */
public abstract class Professor extends Pessoa {
    public void adicionar() {
        System.out.println("Adicionar professor");
    }
    public void exluir() {
        System.out.println("Excluir professor");
    }
    public void pesquisar() {
        System.out.println("Pesquisar professor");
    }
}