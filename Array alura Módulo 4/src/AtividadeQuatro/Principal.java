package AtividadeQuatro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Secundario secundario1 = new Secundario("Jarisvaldo");
        Secundario secundario2 = new Secundario("Jubiscleudo");

        List<String> listaNome1  = new ArrayList<>();
        listaNome1.add(secundario1.toString());
        listaNome1.add(secundario2.toString());
        System.out.println("Lista com Array:" +  listaNome1);

        List<String> listaDeNome2 = new LinkedList<>();
        listaDeNome2.add(secundario1.toString());
        listaDeNome2.add(secundario2.toString());
        System.out.println("Lista com LinkedList: " + listaDeNome2);




    }


}
