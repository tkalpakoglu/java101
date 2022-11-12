import java.util.Scanner;

public class Degisken {
    public static void main(String[] args) {
        int tutar ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Ödediğiniz KDV'siz Tutar: ");
        tutar = inp.nextInt();
        if(tutar <= 1000){
            System.out.println("1000 TL altı tutarlarda KDV %18'den hesaplanır.");
            double kdv = (tutar / 100.0) * 18.0;
            System.out.println("KDV Tutarınız: " + kdv);
            System.out.println("KDV'li Tutarınız: " + (tutar + kdv));
        } else if (tutar > 1000) {
            System.out.println("1000 TL üstü tutarlarlarda KDV %8'den hesaplanır.");
            double kdv = (tutar / 100.0) * 8.0;
            System.out.println("KDV Tutarınız: " + kdv);
            System.out.println("KDV'li Tutarınız: " + ( tutar + kdv));

        }


    }
}
