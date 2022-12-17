package Zadanie2;

public class Wieloryb extends Ryba{

    String name;
    int weight;

    public Wieloryb(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }


    public void jedz() {
        System.out.println(name + " jedzenie spożywa!");
    }
    public void wydalaj() {
        System.out.println(name + " wydala");
    }
    public void plyn() {
        System.out.println(name + " płynie w świat!");
    }
    public void wynurz() {
        System.out.println(name + " wynurza się!");
    }
    public void zanurz() {
        System.out.println(name + " zanurza się!");
    }


    @Override
    public void lec() {
    }

    @Override
    public void wyladuj() {
    }
}
