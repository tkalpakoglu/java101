import java.util.Scanner;

public class Endex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double vKE, boy, kilo;
        System.out.print("Boyunuzu cm cinsinden giriniz: ");
        boy = input.nextInt();
        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextInt();
        double boy2 = (boy / 100);
        vKE = (kilo / (boy2 * boy2));
        System.out.println("Vücut Kitle Endexiniz: " + vKE);

    }
}
