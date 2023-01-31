package day21_StaticKeyword;

public class C01_StaticBlocks {


    C01_StaticBlocks(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("Main method calismaya basladi");

    }

    static {
        // static blocklar classdaki tum yapilardan, hatta main methoddan bile once calisir.
        // static blockta istedigimiz bir variable a baslangic degerinin atanmasi
        // kullanicidan yetki sorgulamasi gibi islemler yapabilir.
        // Methodlarin ve static blocklarin siralamasi java acisindan onemli degildir. ancak birden fazla
        // static block varsa kendi aralarinda once ustteki calisir.

        System.out.println("Static block calisti");
    }

    static {
        System.out.println("alttaki static block calisti");
    }
}
