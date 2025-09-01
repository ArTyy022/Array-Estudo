import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {


        Pessoa pessoa = new Pessoa("Julio ", 25);
        Pessoa pessoaDois = new Pessoa("Leonardo ",27);
        Pessoa pessoaTres = new Pessoa("Manoel ",24);




        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa);
        listaDePessoas.add(pessoaDois);
        listaDePessoas.add(pessoaTres);
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeiro nome: " + listaDePessoas.get(0).toString());
        System.out.println("Segundo nome: " + listaDePessoas.get(1).toString());
        System.out.println("Terceiro nome: " + listaDePessoas.get(2).toString());



    }
}
