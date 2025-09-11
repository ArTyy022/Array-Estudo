package Exercício2;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Rice",10);

        Product product2 = new Product("bread",5);


        ArrayList<Product> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(product1);
        listaDeProdutos.add(product2);
        System.out.println("Lista de produtos: " + listaDeProdutos.size());
        if(product1.preco  >= 7){
            System.out.println("Produto mais caro: " + listaDeProdutos.get(0).nome);
        } else if (product2.preco >= 7){
            System.out.println("Produto mais caro: " + listaDeProdutos.get(1).nome);
        }
        }

        }

