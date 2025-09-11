package Exercício4;

public class Student {
    private String name;
    private int notice1;
    private int notice2;
    private int media = notice1 + notice2 / 2;

    public Student(String name, int notice1, int notice2){
        this.name = name;
        this.notice1 = notice1;
        this.media = notice1 + notice2 / 2;
    }


    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public int getNotice2() {
        return notice2;
    }

    public void setNotice2(int notice2) {
        this.notice2 = notice2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNotice1() {
        return notice1;
    }

    public void setNotice1(int notice1) {
        this.notice1 = notice1;
    }




}
