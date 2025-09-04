package AtividadeCinco;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;


        ArrayList<Forma> listaForma = new ArrayList<>();
        listaForma.add(circulo);
        listaForma.add(quadrado);

        for (Forma forma:listaForma){
            System.out.println("Área: " + forma.calcularArea());
        }


    }
}
