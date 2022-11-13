import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        Scanner mKH = new Scanner(System.in);
        double armut = 2.14;
        double elma = 3.67;
        double domat = 1.11;
        double muz = 0.95;
        double pat = 5.00;

        double armut1,elma1,domat1,muz1,pat1;

        System.out.print("Armut kaç kilo?: ");
        armut1 = mKH.nextInt();
        System.out.print("Elma kaç kilo?: ");
        elma1 = mKH.nextInt();
        System.out.print("Domat kaç kilo?: ");
        domat1 = mKH.nextInt();
        System.out.print("Muz kaç kilo?; ");
        muz1 = mKH.nextInt();
        System.out.print("Patlıcan kaç kilo?; ");
        pat1 = mKH.nextInt();

        double toplam = (armut1 * armut) + (elma1 * elma) + (domat1 * domat) + (muz1 * muz) + (pat1 * pat);
        System.out.println("Topam ödeyeceğiniz tutar " + toplam + " TL'dir.");
    }
}
