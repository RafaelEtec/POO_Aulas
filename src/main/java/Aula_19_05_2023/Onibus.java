package Aula_19_05_2023;

/**
 *
 * @author Rafael.fgoulart1
 *         Pedro Henrique Fogaça
 */
public class Onibus extends Veiculo {
    private int assentos;
    
    public Onibus(String placa, int ano, int a) {
        super(placa, ano);
        assentos = a;
    }

    public void imprimirRelatorio() {
        exibirDados();
    }
    
    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    
    public void exibirDados() {
        System.out.println(
                "| Placa: " + getPlaca() +
                "\n| Ano: " + getAno() +
                "\n| Assentos: " + getAssentos() +
                "\n+-----+-----+-----+-----+-----+"
        );
    }
}