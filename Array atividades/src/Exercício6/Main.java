package Exercício6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Animal> listAnimal = new ArrayList<>();
        listAnimal.add( new Animal("Zaraki","Dog"));
        listAnimal.add( new Animal("Ichigo","Cat"));
        listAnimal.add( new Animal("Mayuri","Cat"));
        listAnimal.add( new Animal("Biakuya","Dog"));

        for (Animal animal: listAnimal){
            if(animal.getSpecies().equalsIgnoreCase("cat")){
                System.out.println(animal.getName());
            }
        }



    }
}
