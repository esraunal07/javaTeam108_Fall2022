package Day15_scope_arrays;

import Day14_doWhileLoop_scope.Hastane;

public class C01_Hastane {
    static String hastaneismi="Yildiz Hastanesi";
    static String hastaneAdres="Cankaya/Ankara";
    String personelIsmi;
    String personelAdresi;
    String personelTel;
    public static void main(String[] args) {

        /*
        Eger tum methodlardan kullanabilecek variable'lar olusturmak isterseniz
        bu variable'lari class level'da
        olustururuz.
        Class Level'da olusturulacak variable'lar icin 2 ihtimal vardir.
        1- static variable (Class  variable)
        2- instance (static olmayan) variable (obje variable)

        Kural1: static variable'lar tum objeler icin tek bir deger alir
                instance variable'lar her obje icin java tarafindan cogaltilir.
        Kural2_ class level variablelara deger atamasak da kullanabiliriz. biz deger atamasak bile
java class level variable'lara default degerler atar.

        non-primiive==> null (String)
        sayisal primitive ==> 0
        char==> hiclik''
        boolean ==>false
        kural3_ static olan methodlardan static olmayan variable ve methodlara direk ulasilmaz
        instance variable ve static olmayan methodlari static alanlardan kullanmak isterseniz
        obje uzerinden kullanabilirsiniz
        kural4: class'da olusturulan instance variable'lar ilk deger atamasini yapar.
yani bir obje ilk olusturuldugunda otomatik olarak instance variable'a atanan degeri alir
deger atanmissa default degerleri alir.
obje olusturulduktan sonra obje uzerinden yapilan atamalar
class leveldaki instance variablea degil, Java tarafindan olusturulup objeye yapistirilan kopya variable'a yapilir.
        Kural5_ Static variable'lar tum objeler icin ortaktir.
                static variable'lara'
         */
        C01_Hastane per1= new C01_Hastane();
        System.out.println(per1.personelIsmi); //null
        System.out.println(per1.personelAdresi); //null
        System.out.println(per1.personelTel); //null

     // System.out.println(personeIsmi);

        per1.personelIsmi= "Fidan";
        per1.personelAdresi="Germany";
        per1.personelTel= "+491712364795";

        C01_Hastane per2=new C01_Hastane();
        System.out.println(per2.personelIsmi);

        per1.personelIsmi="Yusuf";
        System.out.println(per2.personelIsmi); //null
        per2.personelIsmi="Ayten";
        System.out.println(per2.personelIsmi); //Ayten
        System.out.println(per1.personelIsmi); //Yusuf


        System.out.println(hastaneismi);
}
    public static void method1(){
         }
}