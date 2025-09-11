package Exercício2;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Rice",10);

        Product product2 = new Product("bread",5);


        ArrayList<Product> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(product1);
        listaDeProdutos.add(product2);
        System.out.println("List of product: " + listaDeProdutos.size());
        if(product1.price >= 7){
            System.out.println("Most expensive product: " + listaDeProdutos.get(0).name);
        } else if (product2.price >= 7){
            System.out.println("Most expensive product: " + listaDeProdutos.get(1).name);
        }
        }

        }

