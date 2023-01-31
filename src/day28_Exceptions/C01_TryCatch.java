package day28_Exceptions;

import java.util.Scanner;

public class C01_TryCatch {

    public static void main(String[] args) {

        //Kullaniicidan 2 tam sayi alip, sayilarin birbirine bölup
        // sonucu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Birbirine bolmek icin 2 tam sayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        try {
            //1- try bolumu :yapmak istedigimiz ama exception riski olusturan kodlar

            System.out.println("Iki sayinin bolimu: " + sayi1/sayi2);
        } catch (ArithmeticException e)
                //2- catch() : bekledigimiz muhtemel exceptionu ve
                //          bu exc. gerceklesirse hata dokumanini store edebilecegimiz variable
        {

            System.out.println("Bolecek sayi 0 olamaz.");
            e.printStackTrace();
            // catch blogu : exceptions gerceklesirse calismasini istedigimiz kodlar.
            //              burayi yazarken ömcelikle exc. olustugunda kodlarin calismasi dursun mu
            //              yoksa devam mi etsin karar vermeliiyiz.
        }
    }
}
