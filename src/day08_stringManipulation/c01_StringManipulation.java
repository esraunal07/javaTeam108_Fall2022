package day08_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class c01_StringManipulation {
    public static void main(String[] args) {
// Soru 4- Kullanicidan gunu ismini girmesini isteyin,
// girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var”
// seklinde hafta sonu tatiline
// kac gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Gun Ismini Giriniz");
        String girilenGun= scan.next();
        String KullanilacakGun=girilenGun.toLowerCase();

        /* String ifadeler case sensitivedir.
        kullanicinin Pazar, PAzAr,PAZAR... gibi 32 farkli sekilde yazma ihtimali vardir.
        Kullanicinin girdigi degeri kalici olarak degistirmek tercih edilmez.
        bunun yerine kullanicinin girdigi degeri degistirip yeni bir variable a atama yapar ve kodlarimizda
        yeni variable kullaniriz

        konsola yazdiracagimiz zaman, istersek kullanicinin giridigi orjinal metni yazdiririrz istersek de
        bizim cevirdigimiz hali yazabiliriz.ers
         */

        switch (KullanilacakGun) {
            case "pazartesi" :
                System.out.println(girilenGun + " calisma zamani tatile 5 gun var");
                break;
            case "sali"  :
                System.out.println(girilenGun + " calisma zamani tatile 4 gun var");
                break;
            case "carsamba"   :
                System.out.println(girilenGun + " calisma zamani tatile 3 gun var");
                break;
            case "persembe"    :
                System.out.println(girilenGun + " calisma zamani tatile 2 gun var");
                break;
            case "Cuma" :
                System.out.println(girilenGun + " calisma zamani tatile 1 gun var");
            case "cumartesi":
            case "pazar":
                System.out.println("Simdi dinlenme zamani");
                break;
            default:
                System.out.println("Yanlis gun ismi");

        }
    }
}
