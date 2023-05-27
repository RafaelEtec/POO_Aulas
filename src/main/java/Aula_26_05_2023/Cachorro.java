package Aula_26_05_2023;

/**
 *
 * @author rafael.fgoulart1
 */
public class Cachorro {
    private String nome;
    
    public Cachorro() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "| Nome: " + nome;
    }
}