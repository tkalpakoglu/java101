import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int gun ;
        int ay;
        System.out.print("Doğum gününüzü sayısal olarak giriniz: ");
        gun = input.nextInt();
        System.out.print("Doğum ayınızı sayısal olarak giriniz: ");
        ay = input.nextInt();
        if (ay <1 || ay > 12){
            System.out.println("Ay bölümüne 1 ile 12 arasında değer girmeniz gerekmektedir.");
        }

        if (ay == 1 || ay == 3 || ay == 5 || ay == 7 || ay == 8|| ay == 10){
            if (gun <1 || gun >31)
            {
                System.out.println("Bu aylarda 1 ile 31 arasında değer girmeniz gerekmektedir");
            }
        } else if (ay == 4 || ay == 6 || ay == 9 || ay == 11 ){
            if (gun <1 || gun >30)
            {
                System.out.println("Bu aylarda 1 ile 31 arasında değer girmeniz gerekmektedir");
            }
        }else if (ay == 2 ){
            if (gun <1 || gun >29)
            {
                System.out.println("Şubat ayında 1 ile 29 arasında değer girmeniz gerekmektedir");
            }
        }


        if (gun >=22 && ay == 1 || gun <=19 && ay == 2){
            System.out.print("Burcunuz Kovadır.");
        } else if (gun >= 20 && ay == 2 || gun <= 20 && ay == 3) {
            System.out.println("Burcunuz Balıktır.");
        }else if (gun >= 21 && ay == 3 || gun <= 20 && ay == 4) {
            System.out.println("Burcunuz Koç.");
        }else if (gun >= 21 && ay == 4 || gun <= 21 && ay == 5) {
            System.out.println("Burcunuz Boğadır.");
        }else if (gun >= 22 && ay == 5 || gun <= 22 && ay == 6) {
            System.out.println("Burcunuz İkizler.");
        }else if (gun >= 23 && ay == 6 || gun <= 22 && ay == 7) {
            System.out.println("Burcunuz Yengeç.");
        }else if (gun >= 23 && ay == 7 || gun <= 22 && ay == 8) {
            System.out.println("Burcunuz Aslan.");
        }else if (gun >= 23 && ay == 8 || gun <= 22 && ay == 9) {
            System.out.println("Burcunuz Başak.");
        }else if (gun >= 23 && ay == 9 || gun <= 22 && ay == 10) {
            System.out.println("Burcunuz Terazi.");
        }else if (gun >= 23 && ay == 10 || gun <= 21 && ay == 11) {
            System.out.println("Burcunuz Akrep.");
        }else if (gun >= 22 && ay == 11 || gun <= 21 && ay == 12) {
            System.out.println("Burcunuz Yay.");
        }else if (gun >= 22 && ay == 12 || gun <= 21 && ay == 01) {
            System.out.println("Burcunuz Oğlak.");
        }

    }
}
