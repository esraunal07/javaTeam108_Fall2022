package day23_DateTime_Varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C03_DateTimeFormatlar {
    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt); // 2022-12-20T10:38:51.478590500

        // sadece tarihi GG/AA/YYYY olarak yazdiralim

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(ldt.format(format1)); //20/12/2022

        // sadece tarihi 12.20.2022 Tuesday olarak yazdirin

        DateTimeFormatter format2=DateTimeFormatter.ofPattern("MM.dd.yy EEEE") ;
        System.out.println(ldt.format(format2)); // 12.20.22 Salı

        // zamani 10.49 am olarak yazdirin

        DateTimeFormatter format3=DateTimeFormatter.ofPattern("HH:m a");
        System.out.println(ldt.format(format3)); // 10:51 ÖÖ
        /*
         format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini

         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami
         m :Minut

         YY : yilin son iki rakamini
         YYYY : Yilin tamamini


         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati

         a yazarsak AM veya PM degerini yazar

        */
    }
}
