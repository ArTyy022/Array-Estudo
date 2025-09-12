package Exercício10;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Athlete> listAthlete = new ArrayList<>();
        listAthlete.add(new Athlete("Robert","swimming",8));
        listAthlete.add(new Athlete("Leonard","swimming",9));
        listAthlete.add(new Athlete("Maicon","swimming",10));

        for(Athlete athlete: listAthlete){
            if(athlete.getScore() == 10){
                System.out.println(athlete.getName() + " has the highest score");
            }
        }

    }
}
