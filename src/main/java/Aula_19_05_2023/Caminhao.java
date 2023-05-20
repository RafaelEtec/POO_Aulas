package Aula_19_05_2023;

/**
 *
 * @author Rafael.fgoulart1
 *         Pedro Henrique Fogaça
 */
public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int e) {
        super(placa, ano);
        eixos = e;
    }
    
    public void imprimirRelatorio() {
        exibirDados();
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    
    public void exibirDados() {
        System.out.println(
                "| Placa: " + getPlaca() +
                "\n| Ano: " + getAno() +
                "\n| Eixo: " + getEixos() +
                "\n+-----+-----+-----+-----+-----+"
        );
    }
}