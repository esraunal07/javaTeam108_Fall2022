package day18_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_set {
    public static void main(String[] args) {

        // javada bir cok yapida get ve set methodlari bulunur.
        //get methodlari bilgiyi bize getirilen set methidalari da bilgiyi update eder.

        List<String> harfler = new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler); //[A, Z, T]

        //2.indexe F elemanini ekleyin
        // add methodu var olan listeden herhangi bir elementi degistirmeden istedigimiz elementi ekler. kalanlari kaydirir.

        harfler.add(2,"F");
        System.out.println(harfler); // [A, Z, F, T]

        harfler.set(2,"M") ;
        System.out.println(harfler); // [A,Z,M,T]

        //set methodu var olan elemntin degerini gunceller
        //eleman sayisini arttirmaz.

    }
}
