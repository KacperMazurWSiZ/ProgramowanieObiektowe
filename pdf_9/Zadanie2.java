package PDF09;
import java.util.*;
public class Zadanie2 {

    public static void main(String[] args) {
        Osoba[] people = new Osoba[]{
                new Osoba("Kacper", 25),
                new Osoba("Miłosz", 30),
                new Osoba("Jakub", 35),
                new Osoba("Wojciech", 40),
                new Osoba("Halina", 45)
        };

        List<Osoba> lista = new ArrayList<>(Arrays.asList(people));
        System.out.println("Lista początkowa: ");
        for (Osoba osoba : lista) {
            System.out.println(osoba.getImie() + " " +osoba.getWiek());
        }

        List<Osoba> podlista = lista.subList(2, 4);

        System.out.println("Podlista: ");

        for (Osoba osoba : podlista) {
            System.out.println(osoba.getImie() + " " +osoba.getWiek());
        }
        podlista.clear();

        System.out.println("Lista po usunięciu podlisty: ");
        for (Osoba osoba : lista) {
            System.out.println(osoba.getImie() + " " +osoba.getWiek());
        }
    }

}
