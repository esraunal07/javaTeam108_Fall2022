package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_remove {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);
        System.out.println(sayilar);  // [10, 5, 7, 9]

       // sayilar.remove(5);
        //eger listemiz integerlardan olusuyorsa parametre olarak yazdigimiz sayinin index mi yoksa
        //silmek istedigimiz obje mi oldugu belirsiz olmasin diye java otomatik olarak girilen sayiyi index kabul eder.
        /*
        eger int lardan olusan bir listede obje olarak bir elemnti silmek isterseniz once onu tanimlamaliyiz
         */

        Integer silinecekElement=5;
        System.out.println(sayilar.remove(silinecekElement)); //true
        System.out.println(sayilar); //[10, 7, 9]
        silinecekElement=20;

        System.out.println(sayilar.remove(silinecekElement)); //false



    }
}
