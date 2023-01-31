package day06_Ifelsemethod;

import java.util.Scanner;

public class c09_NestedIfELse {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
           /* eger degisken sayimiz birden fazla ise degiskenlerden birini oncelige alarak,
            ona göre bir if else yapisi kurulur. ornegin bu soruda kadin/erkek secimini
            ana degisken yapalim.
             */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizi Giriniz \nK : Kadin, E:Erkek");
        char cinsiyet=scan.next().charAt(0);

        System.out.println("Lutfen tam sayi olarak yasi giriniz");

        int yas= scan.nextInt();

        if (cinsiyet=='K' || cinsiyet=='E') {
            if(yas<18 || yas>80) System.out.println("gecersiz yas");
            else if (yas>=60) System.out.println("Emekli olabilirsin");
            else System.out.println("emekli olmak icin" +(60-yas) + " yil daha calismalisin");

        } else if (cinsiyet=='k' || cinsiyet=='e') {
            if(yas<18 || yas>80) System.out.println("gecersiz yas");
            else if (yas>=65) System.out.println("emekli olabilirsin");
            else System.out.println("emekli olmak icin" + (65-yas) + " yil daha calismalisin");

        }else {
            System.out.println("cinsiyet bilgisi hatali");
        }
    }
}
