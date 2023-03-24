package thuchanh3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            Student std = new Student("nam",21,"ht");
            Student std1 = new Student("hieu",20,"tb");
            Student std2 = new Student("nhan",23,"hn");
            Student std3 = new Student("khiet",19,"bg");
        List<Student> list = new ArrayList<>();
        list.add(std);
        list.add(std1);
        list.add(std2);
        list.add(std3);
        Collections.sort(list);
        for (Student student:list) {
            System.out.println(student);
        }
        Compareter compareter = new Compareter();
        Collections.sort(list,compareter);
        System.out.println("theo age*************");
        for (Student Std:list) {
            System.out.println(Std);
        }
    }
}
