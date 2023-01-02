package org.example.pz3;

import org.example.pz2.Discipline;

import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {

        MyListImpl<Discipline> list = new MyListImpl<>();
        Discipline discipline1 = new Discipline("Math",30);
        Discipline discipline2 = new Discipline("Physics",40);
        Discipline discipline3 = new Discipline("Programming Java",50);
        list.add(discipline1);
        list.add(discipline2);
        list.add(discipline3);
        Iterator<Discipline> iterator = list.iterator();
        System.out.println("While and Iterator<Discipline>");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\n");
        }
        System.out.println();
        System.out.println("Foreach");
        for (Discipline elem : list) {
            System.out.print(elem + "\n");
        }
        System.out.println();
        System.out.println("list.toString(): "+ list);
        list.remove(discipline1);
        System.out.println("after delete discipline1 {" +discipline1+"} -> ");
        System.out.println("list.toString(): "+list);
    }
}
