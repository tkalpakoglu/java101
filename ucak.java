
import java.util.Scanner;
public class ucak {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int y_tipi;
        int km;
        int yas;
        double km_tutar = 0.10 ;
        System.out.print("Yolculuk Tipini Seçiniz. (Tek Yön ise 1 , Gidiş-Dönüş ise 2): ");
        y_tipi = input.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
        yas = input.nextInt();
        System.out.print("Gideceğiniz KM'yi Giriniz: ");
        km = input.nextInt();

        if (km <= 0 || yas <= 0 || (y_tipi != 1 && y_tipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        if (yas < 12){
            if (y_tipi == 2){
                double n_ucret = ( km * km_tutar);
                double yas_indirimi = (( km * km_tutar) * 0.50 );
                double t_indirim = (( km * km_tutar) * 0.10 );
                double fiyat = n_ucret - yas_indirimi - t_indirim;
                System.out.println("Ödeyeceğiniz tutar " + fiyat);
            }else {
                double n_ucret = ( km * km_tutar);
                double yas_indirimi = (( km * km_tutar) * 0.50 );
                double fiyat = n_ucret - yas_indirimi;
                System.out.println("Ödeyeceğiniz tutar " + fiyat);
            }
        } else if ( yas > 12 || yas < 24) {
            if (y_tipi == 2){
                double n_ucret = ( km * km_tutar);
                double yas_indirimi = (( km * km_tutar) * 0.10 );
                double t_indirim = (( km * km_tutar) * 0.10 );
                double fiyat = n_ucret - yas_indirimi - t_indirim;
                System.out.println("Ödeyeceğiniz tutar " + fiyat);
            }else {
                double n_ucret = ( km * km_tutar);
                double yas_indirimi = (( km * km_tutar) * 0.10 );
                double fiyat = n_ucret - yas_indirimi;
                System.out.println("Ödeyeceğiniz tutar " + fiyat);
            }
        }  else if ( yas > 65) {
            if (y_tipi == 2){
                double n_ucret = ( km * km_tutar);
                double yas_indirimi = (( km * km_tutar) * 0.30 );
                double t_indirim = (( km * km_tutar) * 0.10 );
                double fiyat = n_ucret - yas_indirimi - t_indirim;
                System.out.println("Ödeyeceğiniz tutar " + fiyat);
            }else {
                double n_ucret = ( km * km_tutar);
                double yas_indirimi = (( km * km_tutar) * 0.30 );
                double fiyat = n_ucret - yas_indirimi;
                System.out.println("Ödeyeceğiniz tutar " + fiyat);
            }
        } else if (yas > 24 || yas <65) {
            if (y_tipi == 2){
                double n_ucret = ( km * km_tutar);
                double t_indirim = (( km * km_tutar) * 0.10 );
                double fiyat = n_ucret - t_indirim;
                System.out.println("Ödeyeceğiniz tutar " + fiyat);
            }else {
                double n_ucret = ( km * km_tutar);
                double fiyat = n_ucret ;
                System.out.println("Ödeyeceğiniz tutar " + fiyat);
            }
        }
    }
}
