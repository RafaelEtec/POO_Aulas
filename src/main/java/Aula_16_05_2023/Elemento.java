package Aula_16_05_2023;

/**
 *
 * @author rafael.fgoulart1
 */
public class Elemento {
    public Elemento esq, dir, r;
    private int n;

    public Elemento() {};
    
    public Elemento(int n) {
        this.n = n;
    }

    public Elemento getEsq() {
        return esq;
    }

    public void setEsq(Elemento esq) {
        this.esq = esq;
    }

    public Elemento getDir() {
        return dir;
    }

    public void setDir(Elemento dir) {
        this.dir = dir;
    }

    public Elemento getR() {
        return r;
    }

    public void setR(Elemento r) {
        this.r = r;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}