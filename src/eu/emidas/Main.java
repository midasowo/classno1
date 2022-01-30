package eu.emidas;

import java.sql.SQLOutput;

public class Main {
 public int liczba;

    public Main(int liczba) {
        this.liczba = liczba;
    }

    public Main() {
    }

    public static void main(String[] args) {
	int cyfra=8;
    long wielki=300;
    short maly=126;
    byte bajt=127;
    boolean t= true;
    char znak='a';
    String lancuchZnakow = "mama, tata";
    String nowyLancuch = "mama, tata";
    String trzeciLancuch = new String ("mama, tata");
        System.out.println(cyfra==8);
        System.out.println(lancuchZnakow.equals(nowyLancuch));
        System.out.println(lancuchZnakow.equals(trzeciLancuch));
        System.out.println();
        System.out.println(lancuchZnakow==trzeciLancuch);
        System.out.println(lancuchZnakow==nowyLancuch);
        Main main = new Main();
        Main main2 = new Main(88);
        System.out.println(main.liczba);
        System.out.println(main2.liczba);
        }
}
