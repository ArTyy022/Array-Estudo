package Exercício3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Book livro1 = new Book();
        livro1.title = "Gosebumps Smile and Die";
        livro1.Author = "R. L. Stine";
        livro1.yearOfPublication = 1992;

        Book livro2 = new Book();
        livro2.title = "It - The Thing";
        livro2.Author = "Stephen King";
        livro2.yearOfPublication = 1986;

        Book livro3 = new Book();
        livro3.Author = "Arthur T.F";
        livro3.title = "Toda seigen";
        livro3.yearOfPublication = 2025;

        ArrayList<Book> listaDeLivros = new ArrayList<>();
        listaDeLivros.add(livro1);
        listaDeLivros.add(livro2);
        listaDeLivros.add(livro3);
        System.out.println("List of books: " + listaDeLivros.size());
        System.out.println("First book: " + listaDeLivros.get(0).title);
        System.out.println("Second book: " + listaDeLivros.get(1).title);
        System.out.println("Third book: " + listaDeLivros.get(2).title);

        if(livro1.yearOfPublication >= 2010){
            System.out.println("The book " + livro1.title + " was released after 2010");
        } else if (livro2.yearOfPublication >= 2010){
            System.out.println("The book " + livro2.title + " was released after 2010");
        } else if (livro3.yearOfPublication >= 2010){
            System.out.println("The book " + livro3.title + " was released after 2010");

        }
    }
}
