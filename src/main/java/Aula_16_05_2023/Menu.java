package Aula_16_05_2023;

/**
 *
 * @author rafael.fgoulart1
 */
public class Menu {
    public static void main(String[] args) {
        Arvore a = new Arvore();
        
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 43, 11, 82, 31, 92, 54, 17, 54, 13};
        for (int i = 0; i < nums.length; i++) {
            a.inserir(nums[i]);
        }
        
        System.out.print("|       Ordem: ");
        a.ordem(a.getRaiz());
        System.out.print("\n|   Pós-ordem: ");
        a.pos(a.getRaiz());
        System.out.print("\n|   Pré-ordem: ");
        a.pre(a.getRaiz());
    }
}