package org.example.pz2;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        Discipline [] arr  = new Discipline[4];
        arr[0]=new Discipline("Physics",40);
        arr[1]=new Teacher("Programming C#",30,
                "Kretov","Ivan","Andreevich","example@gmail.com","+353855050303");
        arr[2]=new Discipline("Math",30);
        arr[3]=new Lesson("Programming JavaScript",50,
                "Ivanov","Sergey","Alexeevich","testExample@nure.ua","+380956764444",
                "2023-01-01 15:30:00","2023-01-01 17:00:00");
        System.out.println("Beginning array of Discipline: ");
        for(Discipline elem : arr){
            System.out.println(elem);
        }
        Arrays.sort(arr,new SortByDisciplineNameASC());
        System.out.println("=================================\nAfter sort by discipline name ASC: ");
        for(Discipline elem : arr){
            System.out.println(elem);
        }
        Arrays.sort(arr,new SortByHourPerSemesterASC());
        System.out.println("=================================\nAfter sort by hour per semester ASC: ");
        for(Discipline elem : arr){
            System.out.println(elem);
        }
    }
}
