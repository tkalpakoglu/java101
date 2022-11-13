import java.sql.SQLOutput;
import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        double r;
        double pi = 3.14;
        double del;
        Scanner daire = new Scanner(System.in);
        System.out.print("Yarı Çapı(r) Giriniz: ");
        r = daire.nextInt();
        System.out.print("Merkez açı ölçüsü giriniz: ");
        del = daire.nextInt();
        double alan = (pi * r * r);
        double cevre = ( 2 * pi * r);
        double dDA = ((pi * (r*r)*del)/360);
        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);
        System.out.println("Daire diliminin alanı: " + dDA);



    }
}
