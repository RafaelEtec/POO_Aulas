package Aula_16_05_2023;

/**
 *
 * @author rafael.fgoulart1
 */
public class Arvore {
    
    private Elemento raiz, atual;
    
    public Elemento getRaiz() {
        return raiz;
    }
    
    public void inserir(int n) {
        if (raiz == null) {
            raiz = new Elemento(n);
        } else {
            atual = new Elemento(n);
            inserir(atual, raiz);
        }
    }
    
    public void inserir(Elemento atual, Elemento e) {
        if (atual.getN() >= e.getN()) {
            if (e.getDir() == null) {
                e.setDir(atual);
                atual.setR(e);
            } else {
                inserir(atual, e.getDir());
            }
        } else {
            if (e.getEsq() == null) {
                e.setEsq(atual);
                atual.setR(e);
            } else {
                inserir(atual, e.getEsq());
            }
        }
    }
    
    /**
     * 1) Percorrer subárvore esquerda
     * 2) Visitar nó raiz
     * 3) Percorrer subárvore direita
     * @param e 
     */
    public void ordem(Elemento e) {
        if (e != null) {
            ordem(e.getEsq());
            System.out.print(e.getN() + "\t");
            ordem(e.getDir());
        }
    }
    
    /**
     * 1) Percorrer subárvore esquerda
     * 2) Percorrer subárvore direita
     * 3) Visitar nó raiz
     * @param e 
     */
    public void pos(Elemento e) {
        if (e != null) {
            pos(e.getEsq());
            pos(e.getDir());
            System.out.print(e.getN() + "\t");
        }
    }
    
    /**
     * 1) Visitar nó raiz
     * 2) Percorrer subárvore esquerda
     * 3) Percorrer subárvore direita
     * @param e 
     */
    public void pre(Elemento e) {
        if (e != null) {
            System.out.print(e.getN() + "\t");
            pos(e.getEsq());
            pos(e.getDir());
        }
    }
}