package Exercício4;

public class Student {
    private String name;
    private int notice;
    double media = notice / 1;

    public Student(String name, int notice){
        this.name = name;
        this.notice = notice;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNotice() {
        return notice;
    }

    public void setNotice(int notice) {
        this.notice = notice;
    }




}
