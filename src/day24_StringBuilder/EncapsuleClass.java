package day24_StringBuilder;

public class EncapsuleClass {




     /*JAva class uyelerine erisiminin write and read olarak ayrilmasi istendiginde
      Encapsulation kullanir.
      Bunun icin oncelikle bu class uyelerine normal yollarla erisim kapatilir.

    Sonra istedigimiz yetkiyi verecek public methoda olusturuz-
      */
     public void setSatis(int satis) {
         this.satis = satis;
         toplamSatis+=this.satis;

     }

     static int toplamSatis=0;

    public static int getToplamSatis() {
        return toplamSatis;
    }

    private int satis; // Satis bolumunden deger girilebilsin ama degeri gorunmesin

    private int rapor=100; // görulebilsin ama degistirelemsin

    public void setHalkaAcikSayi(int halkaAcikSayi) {
        this.halkaAcikSayi = halkaAcikSayi;
    }

    public int getHalkaAcikSayi() {
        return halkaAcikSayi;
    }

    private int halkaAcikSayi=10; // herkese acik olsun


}
