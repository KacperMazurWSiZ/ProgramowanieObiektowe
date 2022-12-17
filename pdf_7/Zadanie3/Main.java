package Zadanie3;

public class Main {

    public static void main(String[] arg)
    {
        Prostokat maly_punkt = new Prostokat(3, 6, "czerwony");
        Trojkat rownoboczny = new Trojkat(7, 4, "bialy");
        Kwadrat kwadrat = new Kwadrat(10,"czarny");
        Punkt punkt = new Punkt(3,5);

//        System.out.println(maly_punkt.opis());
//        System.out.println(rownoboczny.opis());
//        System.out.println(kwadrat.getKolor());

        Figura[] tablicaFigur = new Figura[10];

        for (int i = 0; i < 10; i++) {
            tablicaFigur[i] = new Prostokat(i+2,i+5, "czarny");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(tablicaFigur[i].opis());
        }

        maly_punkt.skaluj(2.0f);

        IFigury [] figury = new IFigury[3];

        figury[0] = maly_punkt;
        figury[1] = rownoboczny;
        figury[2] = kwadrat;

        System.out.println(figury[0].getPowierzchnia());
        System.out.println(figury[1].getPowierzchnia());
        System.out.println(figury[2].getPowierzchnia());

        Okrag okrag = new Okrag(10,10,10);

        okrag.skaluj(2.0f);
        System.out.println(okrag.opis());
        okrag.przesun(2,4);
        System.out.println(okrag.opis());


    }

}
