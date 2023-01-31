package day09_StringManipulations;

public class c07_ilktest {
    public static void main(String[] args) {
        // gittigimiz web sayfasindan aldigimiz
        // String arama sonuclarinda
        //arama sayisinin 50'den fazla oldugunu test edin.

        String input = "1-48 of 87 results for \"nutella\"";

        int indexOf=input.indexOf("of");
        int indexresults=input.indexOf("results") ;

        String sonucSayisiString=input.substring(indexOf+ 3, indexresults-1);

        //arama sayisinin 50'den fazla oldugunu test edin
        int sonucSayisiInt= Integer.parseInt(sonucSayisiString);

        if (sonucSayisiInt>50) {
            System.out.println("Nutella arama testi PASSED");
        } else {
            System.out.println("istenen kadar sonuc yok, Nutella arama testi failed");
        }

    }
}
