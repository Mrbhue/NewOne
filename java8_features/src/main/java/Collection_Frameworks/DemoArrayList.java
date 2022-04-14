package main.java.Collection_Frameworks;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        l1.add(2);
        l1.add(4);
        l1.add(5);
        l1.add(3);
        l1.add(4);
        l1.add(1);
        l1.add(9);
        l1.add(0);
        l1.add(77);
        l1.add(55);
        l1.add(55);
        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());
//        for (Integer i: l1) {
//            System.out.println(i);
//        }
        System.out.println(l1.indexOf(55));

    }
}
