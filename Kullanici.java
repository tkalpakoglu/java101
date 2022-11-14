import java.util.Scanner;
public class Kullanıcı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName,password;

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();



        if(userName.equals("patika") && password.equals("patika123")){
            System.out.println("Giriş Başarılı");
        }else{
            System.out.println("Bilgiler Hatalı.");
            if (password != "patika123"){
                System.out.println("Şifrenizi yenilemek ister misiniz?");
                String que = input.nextLine();
                if (que.equals("evet")) {
                    System.out.println("Yeni Şifrenizi Giriniz.");
                    String npassword = input.nextLine();
                    if (npassword.equals("patika123")) {
                        System.out.println("Yeni Şifreniz Eski Şifreniz ile Aynı Olamaz.");
                    } else {
                        System.out.println("Giriş Başarılı.");
                    }
                }else{
                    System.out.println("Giriş Başarısız.");
                }
            }
        }

    }
}
