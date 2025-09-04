package AtividadeUm;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {

        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(numero4);
        lista.add(numero3);
        lista.add(numero2);
        lista.add(numero1);
        Collections.sort(lista);
        System.out.println(lista);




    }

}
