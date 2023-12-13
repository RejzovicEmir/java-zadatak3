import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Unos prvog broja
        System.out.println("Unesite prvi decimalni broj:");
        Scanner prviUneseniBroj = new Scanner(System.in);
        double prviBroj = prviUneseniBroj.nextFloat();

        //Unos drugog broja
        System.out.println("Unesite drugi decimalni broj:");
        Scanner drugiUneseniBroj = new Scanner(System.in);
        double drugiBroj = drugiUneseniBroj.nextFloat();

        //Zbir dva broja
        double zbir = prviBroj + drugiBroj;

        //if statement koji provjerava da li je zbir veci od 0
        if (zbir > 0){
            double rezultatPrveFunkcije = 2 * prviBroj + 15 * drugiBroj;
            System.out.println("Rezultat funkcije 2 * prviBroj + 15 * drugiBroj je: " + rezultatPrveFunkcije);
        } else if (zbir <= 0) {
            double rezultatDrugeFunkcije = prviBroj * drugiBroj + 1;
            System.out.println("Rezultat funkcije prviBroj * drugiBroj + 1 je: " + rezultatDrugeFunkcije);
        }
    }
}
