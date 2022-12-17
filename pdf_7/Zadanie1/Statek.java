package Zadanie1;

public class Statek implements Plywa {
    String statek = "Żongiel";

    public String getStatek() {
        return statek;
    }

    public void plyn(){
        System.out.printf( statek + " płynie w świat!");
    }
}
