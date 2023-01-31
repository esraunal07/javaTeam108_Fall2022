package day08_stringManipulation;

public class c05_charArt {
    public static void main(String[] args) {

        String str= "Java guzeldir" ; // 13 tane karakter var

        // Javada index 0 dan baslar
        //J==> 0.index, r==>12
        // charArt(index) ile istedigimiz indexteki chara ulassabiliriz.

        // ilk a'yi yazdiralim
        System.out.println(str.charAt(1));
        // sondan 2. harfi yazdiralim
        System.out.println(str.charAt(13-2)); //karakter sayisi -2 . indexteki eleman

        // sondan 4. karakteri buyuk harf olarak yazdirin.

        System.out.println(str.toUpperCase().charAt(13-4)); //
        // charArt methodu bize char döndurugu icin touppercase calismaz.
        // strring methodlarini charArt ile kullanmak istersek
        // charArt den once kullanmaliyiz

        System.out.println(str.charAt(12));

        //eger index olarak karaktee sayisi veya daha buyuk bir deger girersek
        // o indeksi bulamayaci icin hata verir

    }
}
