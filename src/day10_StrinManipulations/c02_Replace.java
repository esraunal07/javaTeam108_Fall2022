package day10_StrinManipulations;

public class c02_Replace {
    public static void main(String[] args) {

        String str= "Java ogren, adana ye :) " ;
        System.out.println(str.replace('a', 'A')) ; //JAvA ogren, AdAnA ye :)

        System.out.println(str.replace(" ", "")); // Javaogren,adanaye:)

        System.out.println(str.replace("Java", "Yazilim")); //Yazilim ogren, adana ye :)

        String telefon= "5553451234" ;
        System.out.println(telefon.replace("555","532")) ; //5323451234
        System.out.println(telefon.replace('3','7')); //5557451274

        // Asagidaki arama sonucunun 10binden fazla oldugunu test edin

        String sonuc= "1-16 of over 100,000 results for \"Apple\"" ;

        int indexover=sonuc.indexOf("over") ;
        int indexresults=sonuc.indexOf("results") ;

        String sonucSayisiStr =sonuc.substring(indexover+5, indexresults+1) ;
        System.out.println(sonucSayisiStr);

        sonucSayisiStr=sonucSayisiStr.replace("," , "") ;
        System.out.println(sonucSayisiStr);

        int sonucSayisiInt= Integer.parseInt(sonucSayisiStr);

            if (sonucSayisiInt>10000){
                System.out.println("arama sonuc testi PASSED");
            }else {
                System.out.println("Arama sonuc testi failed");

        }





    }
}
