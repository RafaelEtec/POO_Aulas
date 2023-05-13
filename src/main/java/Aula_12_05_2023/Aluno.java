package Aula_12_05_2023;

/**
 *
 * @author Rafael.fgoulart1
 */
public abstract class Aluno extends Pessoa{
    public void adicionar() {
        System.out.println("Adicionar aluno");
    }
    public void exluir() {
        System.out.println("Excluir aluno");
    }
    public void pesquisar() {
        System.out.println("Pesquisar aluno");
    }
}