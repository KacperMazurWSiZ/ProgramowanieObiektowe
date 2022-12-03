public class Punkt {

    public double x,y;

    public Punkt(double x) {
        this.x = x;
        this.y = y;
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void  zeruj(){
        x = 0.0;
        y = 0.0;
    }

    String opis(){
        return "Klasa Punkt Pkt o wspol. [x,y] " + x + " " + y;
    }

    public void przesun(double x, double y){
        this.x += x;
        this.y += y;

    }
}