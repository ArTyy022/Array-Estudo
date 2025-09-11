package Exercício4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Chris", 10);
        Student student2 = new Student("Leon",6);
        Student student3 = new Student("Jake", 2);


        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);


    if(student1.media >= 7){
        System.out.println(student1.getName() + ":" + " Approved");
    } else {
        System.out.println(student1.getName() + ":" + " Failed");
    }
        if(student2.media >= 7){
            System.out.println(student2.getName() + ":" + " Approved");
        } else {
            System.out.println(student2.getName() + ":" + " Failed");
        }
        if(student3.media >= 7){
            System.out.println(student3.getName() +":" + " Approved");
        } else {
            System.out.println(student3.getName() + ":" + " Failed");
        }


    }
}
