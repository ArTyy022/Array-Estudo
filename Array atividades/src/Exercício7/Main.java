package Exercício7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Trip> listTrip = new ArrayList<>();
        listTrip.add(new Trip("Canadá",3));
        listTrip.add(new Trip("Japão",8));
        listTrip.add(new Trip("Espanha",2));

        for(Trip trip: listTrip){
            if(trip.getDurationDays() > 7){
                System.out.println("the trip to " + trip.getDestination() + " lasts more than 7 days");
            }
        }

    }
}
