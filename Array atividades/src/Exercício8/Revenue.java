package Exercício8;

import java.util.Random;

public class Revenue {
    private String name;
    private double timePreparation;

public Revenue(String name, double timePreparation){
    this.name =name;
    this.timePreparation = timePreparation;
}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTimePreparation() {
        return timePreparation;
    }

    public void setTimePreparation(double timePreparation) {
        this.timePreparation = timePreparation;
    }
}
