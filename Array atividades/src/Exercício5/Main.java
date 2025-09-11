package Exercício5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {






        ArrayList<Car> listCar = new ArrayList<>();
        listCar.add(new Car("Mitsubishi",2012,"red"));
        listCar.add(new Car("Fiat",2014,"blue"));
        listCar.add(new Car("Kia",2012,"black"));
        listCar.add(new Car("Audi",2016,"red"));

        System.out.println("List car: " + listCar.size());
        System.out.println("=================");



        //Depois
        for (Car car: listCar){
            if(car.getColor().equalsIgnoreCase("red")){
                System.out.println(car.getModel() + " is red");
            }
        }




        //Antes
        /*
        if(car1.getColor() == "red"){
            System.out.println(car1.getModel() + " is red");
        } else {
            System.out.println(car1.getModel() + " no is red, is " + car1.getColor() );
        }
        if(car2.getColor() == "red"){
            System.out.println(car2.getModel() + " is red");
        } else {
            System.out.println(car2.getModel() + " no is red, is " + car2.getColor());
        }
        if(car3.getColor() == "red"){
            System.out.println(car3.getModel() + " is red");
        } else {
            System.out.println(car3.getModel() + " no is red, is " + car3.getColor());
        }
        if(car4.getColor() == "red"){
            System.out.println(car4.getModel() + " is red");
        } else {
            System.out.println(car4.getModel() + " no is red, is " + car4.getColor());
        }
*/


    }
}
