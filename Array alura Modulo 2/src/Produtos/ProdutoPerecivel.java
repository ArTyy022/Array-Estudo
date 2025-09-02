package Produtos;

public class ProdutoPerecivel extends Produto{
   private String dataValidade;



    public ProdutoPerecivel(String nome, int preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;

    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + " Data de validade: " + dataValidade;
    }
}
