package Aula_6_Exercicio;

public class Main {
    public static void main(String[] args) {
        System.out.println(retornarReferenciaBibliografica("Rafael Goulart"));
        System.out.println(contarPalavra("ana come banana"));
    }
    
    public static String retornarReferenciaBibliografica(String nomeAutor) {
        int pos = 0;
        String ref = "", temp = "";
        nomeAutor = nomeAutor.trim();
        
        while (nomeAutor.charAt(pos) != ' ') {
            temp = temp + nomeAutor.charAt(pos);
            pos++;
        }
        ref = ", " + temp;
        temp = "";
        while (pos != nomeAutor.length()) {
            temp = temp + nomeAutor.charAt(pos);
            pos++;
        }
        ref = temp.trim() + ref;
        return ref;
    }
    
    public static int contarPalavra(String frase) {
        int count = 0;
        frase = frase.toUpperCase();
        
        for (int i = 0; i < frase.length(); i++) {
            
        }
        
        return count;
    }
}