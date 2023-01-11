package PDF08;

public class Zadanie3 {
    public static void main(String[] args) {

        try {
            Adres adres = new Adres("Sucharskiego", "32-221", "Rzeszow", 2);
        } catch (AdresError e) {

            System.out.println("Blad adresu: " + e.getMessage());
        }

        try {
            Adres adres = new Adres("Okulickiego", null, "Rzeszow", 2);
        } catch (AdresError e) {

            System.out.println("Blad adresu: " + e.getMessage());
        }

        try {
            Adres adres = new Adres("", "32-221", "Rzeszow", -2);
        } catch (AdresError e) {

            System.out.println("Blad adresu: " + e.getMessage());
        }

        try {
            Adres adres = new Adres(null, null, null, 0);
        } catch (AdresError e) {

            System.out.println("Blad adresu: " + e.getMessage());
        }

    }

}