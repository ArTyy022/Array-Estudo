package AtividadeSeis;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ContaBancaria contaBancaria1 = new ContaBancaria(600,6);
        ContaBancaria contaBancaria2 = new ContaBancaria(700,7);
        ContaBancaria contaBancaria3 = new ContaBancaria(800,8);

        ArrayList<ContaBancaria> listaDeConta = new ArrayList<>();
        listaDeConta.add(contaBancaria1);
        listaDeConta.add(contaBancaria2);
        listaDeConta.add(contaBancaria3);
        

    }
}
