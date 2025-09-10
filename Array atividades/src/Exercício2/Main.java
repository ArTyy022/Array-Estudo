package Exercício2;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.nome = "Arroz";
        produto1.preco = 8;

        Produto produto2 = new Produto();
        produto2.nome = "Feijão";
        produto2.preco = 6;


        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        System.out.println("Lista de produtos: " + listaDeProdutos.size());
        if(produto1.preco >= 7){
            System.out.println("Produto mais caro: " + produto1.nome);
        } else {
            System.out.println("Produto mais caro: " + produto2.nome);
        }
        }

        }

