package Day30_Interfaces_iterator;

import Day29_final_abstractClasses.FChild;

import java.util.List;

public class M01_ChildOfInterface  implements I01_Interface, I02_Interface{

    //Bir class baska bir classi extends keyword ile parent edilebilir.
    //Ancak birden fazla classi parent edinemez
    //Interfaceler icin böyle bir sınırlama yokturç
    //Bır class ıstedıgı kadar interfacei implement edebilir.
    public static void main(String[] args) {

        System.out.println(I01_Interface.SAYI2); //20

        /*
        Interfacede olusturulan static veya default olarak isaretlenen methodlarin farki
        static  olana interfaceIsmi.staticMethodIsmi seklinde ulasabilirken
        default olana child classdan olusturulacak obje uzerinden erisilebilir.
         */

        I01_Interface.method34();

        M01_ChildOfInterface obj=new M01_ChildOfInterface();
        obj.method44();

    }
    //Eger birden fazla interface implement edildiginde
    //Ayni isimde methodlar farkli interfacelerde varsa return type bakilir.
    //Return type ayni ise sorun olmaz., cunku ikisinide implement edebiliriz.
    //Ancak return typelari farkli ise birbirini tercih ettigimizde digeri CTE verir.
    //Bu durumda parent interfacelere mudahale etmek mumkunse mudahale edilebilir.
    //veya bu interfacelerden birini implement etmekten vazgecebiliriz.



    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public int method6() {
        return 0;
    }
}
