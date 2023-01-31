package day10_StrinManipulations;

public class c06_soru {
    public static void main(String[] args) {

/* Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve
 kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa,
  “sifre basariyla kaydedildi” yazdirin
  - ilk harf kucuk harf olmali
  - son karakter rakam olmali
  - sifre bosluk icermemeli
  - uzunlugu en az 10 karakter olmali

 */
        String sifre ="abc1453" ;
        /*
        bu soruda sartlari bagimsiz if cumlesi ile yapmak veya if-else ile yapmam mumkundur.
        eger if-else ile yaparsak ilk hatada hatayi yazdirir geriye kalanlara bakmaz
        avantaji ise eger hata yoksa otomatik olrak basarili sekilde olusturuldu diyebilir.

        bagimsiz if cumlelerinde tum hatalari bir kerede soyleyebilir
        ancak bagimsiz if cumleleri kodun geriye kalani ile ilgilenmediginden basarili sifre olusturdugunu
        bizim ayri bir mekanizma ile kontrol etmemiz gerekir.
         */
        /*
        sonucta basarili sifre olusturuldu demek icin bir kontrol mekanizmasi olusturmamizerekir.
        ya her adimda bir sayac yapip en son 4 oldu ise basarili deriz.
        veya basta verdigimiz deger olumsuz bir durum oldugunda arttirilir.
        en sonda kontrol edip eger bastaki degeri hala koruyorsa basarili olmustur diyebiliriz
         */

        int flag = 0;
        //- ilk harf kucuk harf olmali

        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')) { //ilk harf kucuk degilse hatayi yazdir
            System.out.println("ilk harf kucuk olmali") ;
            flag++ ; //bir ceza puani aldi
        }
        // - son karakter rakam olmali

        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            // son karakter rakam degilse rapor yazdir

            System.out.println("Son karakter rakam olmali");
            flag++;
        }
         //- sifre bosluk icermemeli
        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk iceremez");
            flag++;
        }
         //- uzunlugu en az 10 karakter olmali
        if (!(sifre.length()>=10)){
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            flag++;
        }
        if (flag==0) {
            System.out.println("sifreniz basariyla kaydedildi");

        }

    }
}
