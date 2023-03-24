package thuchanh2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student std = new Student("khiet",20,"bg");
        Student std1 = new Student("nam",22,"ht");
        Student std2 = new Student("hieu",21,"tb");
        Student std3 = new Student("nhan",21,"hn");
        Map<Integer,Student> map = new TreeMap<>();
        map.put(1,std);
        map.put(2,std1);
        map.put(2,std2);
        map.put(3,std3);
        for (Map.Entry<Integer,Student> student: map.entrySet()) {
            System.out.println(student);
        }
        System.out.println("*****************set*******");
        Set<Student> set = new HashSet<>();
        set.add(std);
        set.add(std1);
        set.add(std2);
        set.add(std3);
        for (Student STD:set) {
            System.out.println(STD);
        }
    }
}
