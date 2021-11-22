import java.util.Scanner;

public class discount {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Unesite cenu: ");
        double cena = scanner.nextDouble();
        System.out.println(" Unesite popust u procentima: ");

        double novaCena = scanner.nextDouble();

        novaCena = cena - (cena * novaCena / 100);
        System.out.println("Nova cena proizvoda je " + novaCena + " RSD.");


    }
}
