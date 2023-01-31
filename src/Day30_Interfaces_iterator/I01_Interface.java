package Day30_Interfaces_iterator;

public interface I01_Interface {


    //Interface'lerde tum methodlar public ve abstractir.
    //interfacelerde tum variablelar public, static ve finaldir.
    //final oldugundan sonradan deger atamak mumkun degil, olustururken atanmalidir.

    int SAYI=10;
    public static final String OkulIsmi="Yildiz Koleji";
    public int SAYI2 =20;

    void method1();
    public int method2();
    abstract String method3();
    public abstract void method4();

    void method5();

    /*
    Bir interface e sonradan bir method eklemek istedigimizde
    o interfacei daha once implement eden tum classlar yeni eklenen methodu implement etmek zorunda kalir.

    Javaya yapilan talepler sonucunda Java8 ile birlikte bu konuda bir istisna getirilmistir.
    Eger sonradan eklenen methodun tum eski classlar tarafindan implement edilme mecburiyeti
    olmasin istiyorsak;

    yeni olusturulan methoda default veya static keyword ekleyip body olusturursak o zaman
    bu methodun child classlar tarafindan implement edilme mecburiyeti olmaz.

     */

    public default void method44() {

        System.out.println("Interfacedeki default olarak isaretlenen method calisti");

    }

    public static void method34(){
        System.out.println("Interfacedeki static olarak isaretlenen method calisti");
    }

}
