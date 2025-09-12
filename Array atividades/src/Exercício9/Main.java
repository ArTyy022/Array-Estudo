package Exercício9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Movie> listMovie = new ArrayList<>();
        listMovie.add(new Movie("Alien","Horror",9 ));
        listMovie.add(new Movie("Predator","Horror", 8 ));
        listMovie.add(new Movie("Terminator","action",6));

        for(Movie movie: listMovie){
            if(movie.getAssessment() >= 8){
                System.out.println(movie.getTittle() + " has a rating greater than 8");
            }
        }


    }
}
