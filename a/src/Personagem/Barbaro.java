package Personagem;

public class Barbaro extends Personagem{


    public Barbaro(String nome, int idade){
        this.setNome("Baltazar");
        this.setIdade(29);
    }
    public void exibir(){
        System.out.println(getNome() + getIdade());
    }
}


