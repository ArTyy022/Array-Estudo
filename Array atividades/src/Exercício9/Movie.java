package Exercício9;

public class Movie {
    private String tittle;
    private String gender;
    private int assessment;


    public Movie(String tittle, String gender, int assessment){
        this.tittle = tittle;
        this.gender = gender;
        this.assessment = assessment;
    }


    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getAssessment() {
        return assessment;
    }

    public void setAssessment(int assessment) {
        this.assessment = assessment;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
