package Exercício2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Product> listProduct = new ArrayList<>();
        listProduct.add(new Product("Rice",10));
        listProduct.add(new Product("Bread",5));

        for(Product product:listProduct){
            if(product.getPrice() >= 7){
                System.out.println(product.getName() + " is more than 7R$, is " + product.getPrice());
            }
        }

        }
        }



