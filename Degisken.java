import java.util.Scanner;

public class Degisken {
    public static void main(String[] args) {
        int dMat ;
        int dFiz ;
        int dKim ;
        int dTur;
        int dTar;
        int dMuz;
        //Scanner Sınıfını Tanımladık
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        dMat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        dFiz = input.nextInt();
        System.out.print("Matematik notunuzu giriniz : ");
        dKim = input.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        dTur = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        dTar = input.nextInt();
        System.out.print("Tarih notunuzu giriniz : ");
        dMuz = input.nextInt();

        int toplam =  (dMat + dFiz + dKim + dTur + dTar + dMuz) ;
        double dOrt = toplam / 6.0;
        System.out.println(dOrt);
        System.out.println("Ortalamanız : " + " " + dOrt);

        String sonuc = dOrt>60 ? "Geçtiniz" : "Kaldınız";
        System.out.println(sonuc);
    }
}
