import java.sql.SQLOutput;
import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int yil;
        System.out.print("Yıl Giriniz: ");
        yil = input.nextInt();

        if (yil % 4 == 0){
            System.out.print( yil + " bir artık yıldır.");
        }else if(yil % 400 == 0){
            System.out.print("Bu bir artık yıldır.");
        }else{
            System.out.print( yil + " bir artık yıl değildir.");
        }

    }
}
