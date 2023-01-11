package PDF09;

import java.lang.reflect.Array;
import java.util.*;

public class Zadanie1 {
    public static void main(String[] args) {


        List<Uczestnicy> uczestnicyList = new ArrayList<>(Arrays.asList(
                new Uczestnicy(1, "Kamil", 32),
                new Uczestnicy(2, "Maja", 12),
                new Uczestnicy(3, "Kamila", 23),
                new Uczestnicy(4, "Maciej", 22),
                new Uczestnicy(5, "Krzysztof", 53)
        ));

        for (Uczestnicy uczestnik : uczestnicyList) {
            int wiek = uczestnik.getWiek();
            boolean niepelnoletni = wiek < 18;
            if (niepelnoletni) System.out.println(uczestnicyList.toString());
        }
    }
}