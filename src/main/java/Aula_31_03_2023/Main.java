package Aula_31_03_2023;

public class Main {
    
    public static void main(String[] args) {
        Animal a0 = new Animal("Dromedário", "Ana", 3);
        Animal a1 = new Animal("Big Foot", "Ana Maria", 6);
        Animal a2 = new Animal("Leprechaun", "Ana Santos", 9);
        Animal a3 = new Animal("Passarin", "Ana Vitória", 12);
        Animal a4 = new Animal("Cágado", "Ana Lúcia", 15);
        Animal a5 = new Animal("Jacaré", "Ana Clara", 18);
        
        Animal loja[] = new Animal[6];
        loja[0] = a0;
        loja[1] = a1;
        loja[2] = a2;
        loja[3] = a3;
        loja[4] = a4;
        loja[5] = a5;
        
        Loja oL = new Loja(3);
        oL.inserirAnimal(0, a0);
        oL.inserirAnimal(100, a1);
        
        oL.mostrarLoja();
        
        oL.excluirAnimal(2);
        oL.mostrarLoja();
        
        oL.buscarAnimal("Ana Clara");
    }
}