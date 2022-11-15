import java.util.Scanner;
public class Havadurumu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Hava Kaç Derece? ");
        int answer =  inp.nextInt();
        if(answer < 5){
            System.out.print("Kayak Yapabilirsiniz.");
        }else if (answer > 5 && answer <15){
            System.out.print("Sinemaya gidebilirsiniz.");
        }else if(answer > 15 && answer < 25){
            System.out.print("Pikniğe gidebilirsiniz.");
        }else if (answer > 25){
            System.out.print("Yüzmeye gidebilirsiniz.");
        }
    }
}
