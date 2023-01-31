package day19_arrayList_forEachLoop;

public class Toyota {

    String marka= "Toyota";
    String model= "Model belirtilmemis" ;
    int yil;
    int km;
    String renk;
    // default constructor suna benzer.

   public Toyota(){
        System.out.println("Toyata classindaki cons. calisti");
    }
    /*
    bir kod blogunun const. olup olmadigini anlamak icin 2 seye bakmaliyiz.
    1-   Constructor class ismi ile ayni isimde olmalidir.
    (dolayisiyla cons. isimleri buyuk harfle baslar.)
    2- Const.larin return type'i olmaz.
     */

    /*
    Java'da her class obje uretmek uzere olusturulur.
    bir obje olusturulup, ilk deger atama yapilabilmesi icinde mutlaka constructor calismalidir.
    JAva da her class da mutlaka constructor bulunur.
    her classta bizim constructor olusturmamiza gerek kalmamasi icin java her classa otomatik olarak
    default constructor koyar.

    default constructor gorunmez.
    default constructor parametresi olmayan
    ve bodysinde hic kod bulunmayan bir constructordur.

    bir classda gözlerimizle bir constructor gormuyorsak o classda default constructor vardir.

    eger kullanicilar tarafindan gozle gorunur bir constructor olusturulursa  JAva default siler
    yani gozlerimizle gormuyorsak

     */

}
