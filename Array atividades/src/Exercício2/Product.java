package Exercício2;

public class Product {
     private String name;
     private int price;

     public Product(String nome, int preco){
         this.name =nome;
         this.price = preco;
     }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

