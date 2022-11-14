import java.util.Scanner;

public class Hesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Toplama için 1\n" +
                            "Çarpma için 2\n" +
                            "Bölme için 3\n" +
                            "Çıkarma için 4\n");
        System.out.print("Yapmak İstediğiniz İşlemi Seçiniz: ");
        a = input.nextInt();
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        switch (a){
            case 1:
                System.out.println("Toplama işlemini seçtiniz.");
                int sonuc = sayi1 + sayi2;
                System.out.println(sonuc);
                break;
            case 2:
                System.out.println("Çarpma işlemini seçtiniz.");
                int sonuc2 = sayi1 * sayi2;
                System.out.println(sonuc2);
                break;
            case 3:
                System.out.println("Bölme işlemini seçtiniz.");
                int sonuc3 = sayi1 / sayi2;
                System.out.println(sonuc3);
                break;
            case 4:
                System.out.println("Çıkarma işlemini seçtiniz.");
                int sonuc4 = sayi1 - sayi2;
                System.out.println(sonuc4);
                break;


        }
    }
}
