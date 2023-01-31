package day28_Exceptions;

import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {

        /*
        Try-catch bloklarinin amaci riski 0 yapmak degil
        kodu iyi analiz yapip javanin cozemeyecegi durumlarda
        ne yapmasini istedigimizi kendisine soylemktir.

        Java try blogunda basedemeyecegi bir sorunla karsilasirsa siz o sorunu
        deklare edinceye kadar yani catch() satirina kadar calismayi durdurur.
        bu durumda sorun olan satir ile catch satiri arasindaki kodlar calismaz.

         */

        //Kullaniicidan 2 tam sayi alip, sayilarin birbirine bölup
        // sonucu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Birbirine bolmek icin 2 tam sayi giriniz");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        try {
            System.out.println("Iki sayinin bolumu:" + sayi1/sayi2);

            System.out.println("Kont1");
            System.out.println("Kont2");
            System.out.println("Kont3");
        } catch (ArithmeticException e) {

            System.out.println("Bolen sayi 0 olamaz");
            e.printStackTrace();
        }


    }
}
