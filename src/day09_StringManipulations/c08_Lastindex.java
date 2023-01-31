package day09_StringManipulations;

public class c08_Lastindex {
    public static void main(String[] args) {

        String str= "Javayi iyi ogrenmek icin cok calismam lazim cok" ;
        //ilk a'nin indexini yazdirilaim

        System.out.println(str.indexOf("a")); //1

        // son 'a'nin indeksini yazdirin

        System.out.println(str.lastIndexOf("a")); //39

        System.out.println(str.lastIndexOf("a", 15)); // 3


        // verilen str da 'cok' kelimesinin kullanimini kontrol edip
        // -cok kelimesi kullanilmsamis
        // - bir kere kullanilmis
        // - birden fazla kullanilmis
        //sonuclarindan uygun olani yazdirin
        // Javayi iyi ogrenmek icin cok calismam lazim

        int ilkcokindexi=str.indexOf("cok") ;
        int soncokindexi=str.lastIndexOf("cok");

        if (!str.contains("cok")) {
            System.out.println("cok kelimesi kullanilmamis");
        } else if (ilkcokindexi==soncokindexi) {
            System.out.println("cok kelimesi bir kere kullanilmis");

        }else {
            System.out.println("cok kelimesi birden fazla kullanilmis");
        }


    }
}
