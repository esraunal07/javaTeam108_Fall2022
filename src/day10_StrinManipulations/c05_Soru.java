package day10_StrinManipulations;

public class c05_Soru {
    public static void main(String[] args) {

      /*  Soru 1 : Kullanicidan bir cumle alin
        - cumlede ev geciyorsa, “home home sweet home” yazdirin
        - cumlede is geciyorsa, “calismak guzeldir”
        - ikisini de iceriyorsa “Hem ev lazim hem is”
        - hicbirini icermiyorsa “cok calisman lazim” yazdirin
           */

    String str= "Evden Calisiyorum, ise gitmeye gerek yok" ;
    String calisilacakstr=str.toLowerCase() ;

    if (calisilacakstr.contains("ev") && calisilacakstr.contains(" is")) {
        System.out.println("Hem ev lazim hem is");
    } else if (calisilacakstr.contains("is")) {
        System.out.println("calismak guzeldir");
    } else if (calisilacakstr.contains("ev")) {
            System.out.println("Home home sweet home");

    } else {
            System.out.println("cok calismam lazim");

        }


    }






}
