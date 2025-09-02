import Produtos.Produto;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Arroz",8,3);
        Produto produto2 = new Produto("Feijão",6,3);
        Produto produto3 = new Produto("Carne",20,3);





        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        System.out.println("produtos: " + listaDeProdutos.size());
        System.out.println("Primeiro produto: " + listaDeProdutos.get(0).toString());
        System.out.println("Segundo produto: " + listaDeProdutos.get(1).toString());
        System.out.println("Terceiro produto: " + listaDeProdutos.get(2).toString());



    }
    }
