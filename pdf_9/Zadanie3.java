package PDF09;

import java.util.*;

public class Zadanie3 {
    public static void main(String[] args) {

        List<Integer> firstList = new ArrayList<Integer>();
        firstList.add(10);
        firstList.add(20);
        firstList.add(30);
        firstList.add(40);
        firstList.add(50);

        List<Integer> revereseList = new ArrayList<Integer>();

        ListIterator<Integer> iterator = firstList.listIterator(firstList.size());
        while (iterator.hasPrevious()) {
            revereseList.add(iterator.previous());
        }
        System.out.println("Pierwsza lista: " + firstList);
        System.out.println("Odwrócona lista: " + revereseList);
    }
}


