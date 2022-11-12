import java.util.Scanner;

public class Hipo {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);

        int a,b,c;
        int giris;

        System.out.println("Hipotenüs öğrenmek için 1 , Çevre öğrenmek için 2, Alan öğrenmek için 3 giriniz: ");
        giris = imp.nextInt();
        if(giris == 1 ){
            double hipo;
            System.out.println("A kenarını giriniz: ");
            a = imp.nextInt();
            System.out.println("B kenarını giriniz: ");
            b = imp.nextInt();
            hipo = Math.sqrt((a*a) + (b*b)) ;
            System.out.println("Üçgenin Hipotenüsü: " + hipo);

        } else if (giris == 2 ) {
            System.out.println("A kenarını giriniz: ");
            a = imp.nextInt();
            System.out.println("B kenarını giriniz: ");
            b = imp.nextInt();
            System.out.println("C kenarını giriniz: ");
            c = imp.nextInt();
            int cevre = ((a + b + c ) / 2)*2;
            System.out.println("Girdiğiniz üçgenin çevresi " + cevre);

        } else if (giris == 3) {
            System.out.println("Tabanı giriniz: ");
            a = imp.nextInt();
            System.out.println("Yüksekliği giriniz: ");
            b = imp.nextInt();
            int alan = (a * b ) / 2;
            System.out.println("Girdiğiniz üçgenin alanı: " + alan );
        }
        else {
            System.out.println("Girdiğiniz değer geçersizdir.");
        }

    }
}
