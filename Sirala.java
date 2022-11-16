import java.util.Scanner;

public class Sirala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bSayi,iSayi,uSayi;

        System.out.print("Birinci sayıyı giriniz: ");
        bSayi = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        iSayi = input.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        uSayi = input.nextInt();

        if(bSayi > iSayi && bSayi > uSayi){
            if (iSayi > uSayi) {
                System.out.print(bSayi + ">" + iSayi + ">" + uSayi);
            }else {
                System.out.print(bSayi + ">" + uSayi + ">" + iSayi);
            }
        } else if (iSayi > bSayi && iSayi > uSayi) {
            if (bSayi > uSayi) {
                System.out.print(iSayi + ">" + bSayi + ">" + uSayi);
            }else{
                System.out.print(iSayi + ">" + uSayi + ">" + bSayi);
            }
        }else if (uSayi > bSayi && uSayi > iSayi){
            if (bSayi > iSayi){
                System.out.print(uSayi + ">" + bSayi + ">" + iSayi);
            }else {
                System.out.print(uSayi + ">" + iSayi + ">" + bSayi);
            }
        }


    }
}
