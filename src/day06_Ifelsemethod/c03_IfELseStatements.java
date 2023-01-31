package day06_Ifelsemethod;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class c03_IfELseStatements {
    public static void main(String[] args) {
        // Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise
        // onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanicidan bir karakter giriniz");
        char girilenKarakter=scan.next().charAt(0);

        if (girilenKarakter>='a' && girilenKarakter<='z') {
            System.out.println((char) (girilenKarakter - 32));
            System.out.println(Character.toUpperCase(girilenKarakter));

        }else{
//kucuk harf degilse girilen harfi yazdiralim
            System.out.println(girilenKarakter);
        }



    }
}
