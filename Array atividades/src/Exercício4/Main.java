package Exercício4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {




        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student("Chris", 10,10));
        listStudent.add(new Student("Leon",6,5));
        listStudent.add(new Student("Jake", 2,3));

        for(Student student: listStudent){
            if(student.getMedia() >= 7){
                System.out.println("The student " + student.getName() + " was approved");
            }
        }








    }
}
