package day24_StringBuilder;

public class C05_Encapsulation {
    public static void main(String[] args) {
        /*
        Access modifiers bir class uyesine erisimi sirnirlandirirken görme yetkisi (read)
        ve degistirme yetkisini(write) ayirt edemez.
        Ama gercek hayatta bu ihtiyac vardir.
        bazi class uyelerinin readable olmasi istenirken
        bazi class uyelerinin writeable olmasi olmasi istenir.
        ve bazi class uyeleri icin iki yetkide istenir.
        Java bu yetkilendirme islemini Encapsulation ile cozmustur.

        Sadece yazma yetkisi icin setter()
        sadece okuma yetkisi icin getter()
        kodlarimizin daha anlasilir bir sekilde atama ve yazma islemlerini yapmasi icin de
        getter() ve setter() methodlari birlikte kullanilabilir.

         */

        EncapsuleClass obj1=new EncapsuleClass();
        obj1.setSatis(100);
        obj1.setSatis(200);
        obj1.setSatis(300);

       System.out.println(obj1.getToplamSatis()); //600

        System.out.println(EncapsuleClass.toplamSatis); //60
        // EncapsuleClass.toplamSatis=2600;
        obj1.setHalkaAcikSayi(400);
        System.out.println(obj1.getHalkaAcikSayi()); //400


    }
}
