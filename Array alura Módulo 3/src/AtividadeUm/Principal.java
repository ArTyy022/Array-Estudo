package AtividadeUm;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Arroz");
        lista.add("Feijão");
        lista.add("Macarrão");
        for (String string: lista){
            System.out.println(string);
        }


    }
}