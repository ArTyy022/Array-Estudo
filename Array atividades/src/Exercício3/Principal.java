package Exercício3;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {


        Livro livro1 = new Livro();
        livro1.titulo= "Gosebumps Sorria e Morra";
        livro1.autor = "R. L. Stine";
        livro1.anoPublicacao = 1992;

        Livro livro2 = new Livro();
        livro2.titulo = "It - A Coisa";
        livro2.autor = "Stephen King";
        livro2.anoPublicacao = 1986;

        Livro livro3 = new Livro();
        livro3.autor = "Arthur T.F";
        livro3.titulo = "Toda seigen";
        livro3.anoPublicacao = 2025;

        ArrayList<Livro> listaDeLivros = new ArrayList<>();
        listaDeLivros.add(livro1);
        listaDeLivros.add(livro2);
        listaDeLivros.add(livro3);
        System.out.println("Lista de livros: " + listaDeLivros.size());
        System.out.println("Primeiro livro: " + listaDeLivros.get(0).titulo);
        System.out.println("Segundo livro: " + listaDeLivros.get(1).titulo);
        System.out.println("Terceiro livro: " + listaDeLivros.get(2).titulo);

        if(livro1.anoPublicacao >= 2010){
            System.out.println("O livro " + livro1.titulo + " foi lançado após 2010");
        } else if (livro2.anoPublicacao >= 2010){
            System.out.println("O livro " + livro2.titulo + " foi lançado após 2010");
        } else if (livro3.anoPublicacao >= 2010){
            System.out.println("O livro " + livro3.titulo + " foi lançado após 2010");

        }
    }
}
