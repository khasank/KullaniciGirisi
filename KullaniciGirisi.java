import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        // Değişken tanımlamaları yapılıyor.
        String userName = "patika";
        String password = "java123";
        String select;
        String newPassword;
        String enteredUserName, enteredPassword;

        Scanner input = new Scanner(System.in); // Scanner tipi değişken tanımlanıyor.

        // Kullanıcıdan Kullanıcı adı ve şifresi alınıyor.
        System.out.print("Kullanıcı Adınız : ");
        enteredUserName = input.next();

        System.out.print("Şifreniz : ");
        enteredPassword = input.next();

        // Kullanıcı adı ve şifresi kontrol ediliyor.
        if (enteredUserName.equals(userName) && enteredPassword.equals(password)) {
            System.out.println("Giriş Yaptınız !");

            // Şifre yanlış ise değiştirmek isteyip istemediği soruluyor.
        } else if (enteredUserName.equals(userName) && !enteredPassword.equals(password)) {
            System.out.println("Şifreniz Yanlış. \nSıfırlamak ister misiniz ? ");
            System.out.println("E - Evet");
            System.out.println("H - Hayır");
            System.out.print("Seçiminiz (E/H): ");
            select = input.next().toUpperCase();

            switch (select) {
                case "E" -> {                               // Evet seçme durumunda yapılacak işlemler :
                    System.out.print("Lütfen yeni şifrenizi giriniz : ");
                    newPassword = input.next();
                    if (newPassword.equals(password)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        System.out.println("Programdan çıkıyorsunuz. İyi günler");
                    } else System.out.println("Şifre oluşturuldu. \nProgramdan çıkıyorsunuz. İyi günler");
                }
                // Hayır seçme durumunda yapılacak işlemler :
                case "H" -> System.out.println("Programdan çıkıyorsunuz. İyi günler");

                default -> {       // Evet veya Hayır harici seçim de yapılacak işlemler :
                    System.out.println("Geçersiz seçim. Sadece 'E' veya 'H' harflerinden birisi olmalı.");
                    System.out.println("Programdan çıkıyorsunuz. İyi günler");
                }
            }

        // kullanıcı adı ve parolası yanlış olma durumunda yapılacak işlemler :
        } else {
            System.out.println("Kullanıcı adı ve şifre yanlış.");
            System.out.println("Programdan çıkıyorsunuz. İyi günler");
        }

    }
}
