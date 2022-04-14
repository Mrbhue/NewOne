package main.java.Stram_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.Arrays.asList;

public class SteamDemo {
    public static void main(String[] args) {

        //Create a list and filter all even number in list

//        List<Integer> list= new ArrayList<>();
//        list.add(45);
//        list.add(55);
//        list.add(448);
//        list.add(454);
//        list.add(145);
//        list.add(485);
//=====================================================================
        //Without Stream Api
//======================================================================
        List<Integer> list2 = asList(22, 66, 55, 66);
        List<Integer> listEven = new ArrayList<>();
        for (Integer i : list2) {
            if (i % 2 == 0) {
                listEven.add(i);
            }
        }
        System.out.println(list2);
        System.out.println(listEven);

//=====================================================================
        //With Stream Api
//======================================================================
        Stream<Integer> str=list2.stream();
        List<Integer> newList= str.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList1=list2.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList1);

    }


}
