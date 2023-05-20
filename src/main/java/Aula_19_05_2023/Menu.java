package Aula_19_05_2023;

/**
 *
 * @author Rafael.fgoulart1
 *         Pedro Henrique Fogaça
 */
public class Menu {
    public static void main(String[] args) {
        String placas[] = {"AAA0000", "AAB0000", "AAC0000", "AAD0000", "AAE0000", "AAF0000"};
        int anos[] = {2000, 2001, 2002, 2003, 2004, 2005};
        int eixos[] = {4, 8, 8};
        int assentos[] = {20, 24, 30};
        
        Veiculo onibus[] = new Veiculo[3];
        Veiculo caminhao[] = new Veiculo[3];
        
        System.out.println("| Ônibus cadastrados: ");
        for (int i = 0; i < onibus.length; i++) {
            onibus[i] = new Onibus(placas[i], anos[i], assentos[i]) {};
            onibus[i].imprimirRelatorio();
        }
        
        System.out.println("| Caminhões cadastrados: ");
        for (int i = 0; i < caminhao.length; i++) {
            caminhao[i] = new Caminhao(placas[i+2], anos[i+2], eixos[i]);
            caminhao[i].imprimirRelatorio();
        }
    }
}