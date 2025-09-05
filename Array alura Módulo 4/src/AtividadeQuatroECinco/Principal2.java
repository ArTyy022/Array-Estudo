package AtividadeQuatroECinco;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Principal2 {
    public static void main(String[] args) {
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Javinho");
        listaPolimorfica.add("Concielo");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Mike");
        listaPolimorfica.add("Didas");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}