package Exercício8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Revenue> listRevenue = new ArrayList<>();
        listRevenue.add(new Revenue("Noodle",37));
        listRevenue.add(new Revenue("Cake",20));
        listRevenue.add(new Revenue("bread",15));

        for(Revenue revenue: listRevenue){
            if (revenue.getTimePreparation() <= 30){
                System.out.println(revenue.getName() + " takes less than 30 minutes to make");
            }
        }


    }
}
