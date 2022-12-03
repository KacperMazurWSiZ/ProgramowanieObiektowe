import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Budynek {

    String nazwa;
    int liczba_pieter;
    LocalDate rokBudowy;

    public Budynek(String nawzwa, int liczba_pieter, LocalDate rokBudowy) {
        this.nazwa = nawzwa;
        this.liczba_pieter = liczba_pieter;
        this.rokBudowy = rokBudowy;
    }

    public void setNazwa(String nawzwa) {
        this.nazwa = nawzwa;
    }

    public long getDataBudowy(){
        LocalDate today = LocalDate.now();
        long ileLat = ChronoUnit.YEARS.between(rokBudowy,today);
        return ileLat;
    }

    public void info(){
        System.out.println("Budynek: " + nazwa + " pieter: " + liczba_pieter + " rok budowy: " + rokBudowy + " wiek budowy: " + getDataBudowy());
    }
}