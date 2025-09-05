package AtividadeDoisETres;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {



        ArrayList<Titulo> listaDeTitulo = new ArrayList<>();
        listaDeTitulo.add(new Titulo("Repo"));
        listaDeTitulo.add(new Titulo("Kuma"));
        listaDeTitulo.add(new Titulo("Dofii"));
        Collections.sort(listaDeTitulo);

        for (Titulo titulo : listaDeTitulo) {
            System.out.println(titulo.nome);
        }



    }


}
