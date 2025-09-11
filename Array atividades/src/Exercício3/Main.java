package Exercício3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {





        ArrayList<Book> listBooks = new ArrayList<>();
        listBooks.add(new Book("Gosebumps Smile and Die","R. L. Stine", 1992 ));
        listBooks.add(new Book("It - The Thing", "Stephen King", 1986));
        listBooks.add(new Book("Arthur T.F", "Toda seigen", 2025));

        for(Book book: listBooks){
            if (book.getYearOfPublication() > 2010){
                System.out.println(book.getTitle() + " was released after 2010 ");
                System.out.println("year of release " + book.getYearOfPublication());
            }
        }

        }
    }

