package day08_stringManipulation;

public class c07_substring {
    public static void main(String[] args) {

         String str= "Java ogren, isi kap" ;

        System.out.println(str.length()); //19

        //metnin tam ortasindaki karakter nedir? ikiye boleriz

        System.out.println(str.charAt(str.length()/2)); //n

        // son karakteri yazdirin

        System.out.println(str.charAt(str.length()-1)); //p

        // bir karakteri degilde verilen stringin icerdigi bir metin parcasini elde etmek istersek
        // ornegin "ogren" kelimesini yazdirin

        System.out.println(str.substring(5, 9)); //ogre
        //substring (bas, bitis) methodunda
        // baslangic olarak yazilan index dahil (inclusive)
        // bitis olarak yazilan index haric exclusive olur
        System.out.println(str.substring(5, 10));//ogren

        // java kelimesini yazdiralim

        System.out.println(str.substring(0, 4)); // java

        // kap yazdiralim

        System.out.println(str.substring(str.length()-3));
// j harfini yazdirin

        System.out.println(str.substring(0,1));

        // 9. indeksdeki harfi buyuk olarak yazdirin

        System.out.println(str.substring(9,10)); //n
        System.out.println(str.charAt(9));     // n
        System.out.println(str.substring(9,10).toUpperCase()); // N

        System.out.println(str.substring(5,5)); // karakter yazdirma demek hiclik yazdirir- bos satir olur
        System.out.println("=======");

        System.out.println(str.substring(str.length()-1));
    }
}
