package day23_DateTime_Varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {


        LocalTime zaman=LocalTime.now();
        System.out.println(zaman); // 10:07:02.364878500

        System.out.println(zaman.getHour()); //10
        System.out.println(zaman.getMinute()); //7
        System.out.println(zaman.withSecond(0).withNano(0)); //10:08
        System.out.println(zaman.withSecond(1).withNano(1)); //10:09:01.000000001
        System.out.println(zaman.plusHours(100).plusMinutes(250)); //18:20:39.422767600

        // Bir for loop ile 1'den 10000'e kadar olan sayilari yan yana yazdirin-
        //bu islem icin gecen zamani bulun.

        LocalTime baslangicZamani=LocalTime.now();
        System.out.println("Baslangic" + baslangicZamani); // 10:17:55.655474800
        for (int i = 0; i <=10000 ; i++) {
            System.out.print(i+ " ");
        }
        System.out.println(" ");
        LocalTime bitisZamani=LocalTime.now();
        System.out.println("bitis" + bitisZamani); //10:17:55.705682300

        System.out.println("Islem suresi :" +
                (bitisZamani.getNano() - baslangicZamani.getNano()) +
                "nano saniye"); // Islem suresi :49340600nano saniye


        /*
        Olusturdugumuz time veya date guncel zamani veya tarihi tutmaya yarayan bir sayac dgil
        oliustirdugumuz satirdaki zamani veya tarihi sistemden alip kaydeden bir variabledir.

        ilerleyen satirlarda guncel zman ve tarihe ihtiyacimiz oldugunda
        yeni bir time veya date olsuturup o andaki degeri atayabiliriz.
         */
    }
}
