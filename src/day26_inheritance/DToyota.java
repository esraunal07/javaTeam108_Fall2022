package day26_inheritance;

public class DToyota {

    /*
    Bir objenin data turu, constructor olarak kullanilan class veya o classin
    parent classlari olabilir.

   data turu olarak parent class secilmesindeki amac
   child classdan olusturulan objenin parent classin tum child classlarinin tasidigi
   ortak ozellikleri vurgulamaktadir.
   (Personel toplantisina katilan doktor Kemal gibi)

   Data turu ile constructor farkli oldgunda variable ile methodlar farkli davranirlar.

   Variable'larin alacagi degeri bulmak icin aramaya data turu olan classdan baslariz
   o classda yoksa parentlarina bakariz. ve ilk buldugumuz degeri atama yapariz.
   Data turu olan class veya parentlarinda bulunamazsa CTE olur.


     */

    String marka="Toyota";
    String model="Model belirtilmemis";
    String motor="Motor belirtilmemis";
    String yakit="Yakit belirtilmedi";


}
