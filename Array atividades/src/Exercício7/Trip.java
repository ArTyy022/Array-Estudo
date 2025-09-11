package Exercício7;

public class Trip {
   private String destination;
    private int durationDays;

    public Trip(String destination, int durationDays){
        this.destination = destination;
        this.durationDays = durationDays;
    }



    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }
}
