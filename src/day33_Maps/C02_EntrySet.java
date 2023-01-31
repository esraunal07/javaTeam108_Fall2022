package day33_Maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {

    public static void main(String[] args) {

        //Tum ogrencileri 101=Ali-Can-11-H-MF seklinde yazdirin.

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        System.out.println("No      Ogrenci Bilgileri");
        System.out.println("=========================");

        //once ogrenci numaralarini elde edelim

       Set<Integer> ogrenciNoSeti= ogrenciMap.keySet(); //[101, 102, 103, 104, 105, 106]

        for (Integer eachKey:ogrenciNoSeti
             ) {
            System.out.println(eachKey+"="+ogrenciMap.get(eachKey));
        }
        /*
        Aslinda bizden istenen MAp'in icindeki elementler.
        Java map'deki elementleri key-value ikilisi olarak birilte alabilmemiz icin
        Entry classi olusturmustur.

        Enty'ler de map ile ayni data yapisina sahip olmalidir.
        Ornegin ogrenci map'ini dusunursek entryler

        Entry<Integer,String>
         */

    Set<Map.Entry<Integer,String>> ogrenciEntrySet= ogrenciMap.entrySet();
        System.out.println("No      Ogrenci Bilgileri");
        System.out.println("=========================");

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySet
             ) {
            System.out.println(eachEntry);
        }

    }
}
