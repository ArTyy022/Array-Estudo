package AtividadeQuatro;


import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Macarrão", 8.90);
        Produto produto2 = new Produto("Alface", 2.80);
        Produto produto3 = new Produto("Tomate",1.75);


        ArrayList<Produto> listaDeProduto = new ArrayList<>();
        listaDeProduto.add(produto1);
        listaDeProduto.add(produto2);
        listaDeProduto.add(produto3);



        double somaprecos = 0;

        for (Produto produto:listaDeProduto){
            somaprecos += produto.getPreco();
        }


        double precoMedio = somaprecos / listaDeProduto.size();
        System.out.println("Preço médio é: " + precoMedio);






    }
}
