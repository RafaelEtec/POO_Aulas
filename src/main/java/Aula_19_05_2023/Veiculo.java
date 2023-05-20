package Aula_19_05_2023;

/**
 *
 * @author Rafael.fgoulart1
 */
public abstract class Veiculo implements Relatorio {
    protected String placa;
    protected int ano;
    
    public Veiculo() {}
    
    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void exibirDados() {
        System.out.println(
                "| Placa: " + getPlaca() +
                "\n| Ano: " + getAno() +
                "\n+-----+-----+-----+-----+-----+"
        );
    }
}