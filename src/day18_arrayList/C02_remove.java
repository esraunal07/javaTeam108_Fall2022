package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_remove {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler.remove("Z")); //True Z'yi bulup siler ve görevi tamamladigi icin true der.
        System.out.println(harfler); // [A, T]

        System.out.println(harfler.remove(0)); // A
        // 0.indexteki elementi siler ve görevi tamamladigi icin sililen elementi bize dondurur

        System.out.println(harfler); //[T]

        List<String> yenilist= new ArrayList<>();
        yenilist.add("C");
        yenilist.add("D");
        yenilist.add("T");

        System.out.println(yenilist.removeAll(harfler)); //true
        //harfler listesindeki tum elementleri yenilistten siler
        //görevi tamamlarsa true, yoksa false döner.


        System.out.println(yenilist); // [C,D]


    }
}
