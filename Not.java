import java.util.Scanner;

public class Not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;

        System.out.print("Matematik Notunu Giriniz: ");
        mat = input.nextInt();
        System.out.print("Fizik Notunu Giriniz: ");
        fizik = input.nextInt();
        System.out.print("Türkçe Notunu Giriniz: ");
        turkce = input.nextInt();
        System.out.print("Kimya Notunu Giriniz: ");
        kimya = input.nextInt();
        System.out.print("Müzik Notunu Giriniz: ");
        muzik = input.nextInt();
        if (mat >=0 && mat <= 100 && fizik >=0 && fizik <= 100 && turkce >=0 && turkce <= 100 && kimya >=0 && kimya <= 100 && muzik >=0 && muzik <= 100) {
            double ort = (mat + fizik + turkce + kimya + muzik) / 5 ;
            if (ort <55 ){
                System.out.println("Ortalamanız " + ort + "'dır. Kaldınız.");
            }else{
                System.out.println("Ortalamanız " + ort + " 'dır. Geçtiniz.");
            }
        }else {
            System.out.println("Girdiniz notlar 0 ile 100 arası olmalıdır.");
        }



    }
}
