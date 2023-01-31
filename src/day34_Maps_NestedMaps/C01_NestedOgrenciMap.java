package day34_Maps_NestedMaps;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedOgrenciMap {
    public static void main(String[] args) {

        Map<Integer, Map<String, String>> ogrenciMap=new HashMap<>();


        Map<String,String> ogrenci101=new HashMap<>();
        ogrenci101.put("Isim", "Ali");
        ogrenci101.put("SoyIsim","Can");
        ogrenci101.put("Sinif","11");
        ogrenci101.put("Sube","H");
        ogrenci101.put("Bolum","MF");

        Map<String,String> ogrenci102=new HashMap<>();
        ogrenci102.put("Isim","Veli");
        ogrenci102.put("SoyIsim","Can");
        ogrenci102.put("Sinif","11");
        ogrenci102.put("Sube","H");
        ogrenci102.put("Bolum","MF");

        Map<String,String> ogrenci103=new HashMap<>();
        ogrenci103.put("Isim","Ali");
        ogrenci103.put("SoyIsim","Cem");
        ogrenci103.put("Sinif","11");
        ogrenci103.put("Sube","K");
        ogrenci103.put("Bolum","TM");

        ogrenciMap.put(101, ogrenci101);
        ogrenciMap.put(102, ogrenci102);
        ogrenciMap.put(103, ogrenci103);

        System.out.println(ogrenciMap);
         /*
        {101={SoyIsim=Can, Bolum=MF, Sube=H, Sinif=11, Isim=Ali},
        102={SoyIsim=Can, Bolum=MF, Sube=H, Sinif=11, Isim=Veli},
        103={SoyIsim=Cem, Bolum=TM, Sube=K, Sinif=11, Isim=Ali}}
         */

        //101 numarali ogrencinin ismini yazdiralim
        System.out.println(ogrenciMap.get(101).get("Isim")); //ALi

        Set<Map.Entry<Integer,Map<String,String>>> ogrenciEntrySeti=ogrenciMap.entrySet();

        for (Map.Entry<Integer, Map<String,String>> eachOgrenciEntry:ogrenciEntrySeti
             ) {
            // 103={Bolum=TM,SoyIsim=Cem, Sube=K, Sinif=11, Isim=Ali}}
            // once ogrenci valuesini kaydetmeliyiz.

            if (eachOgrenciEntry.getKey()==103){
                Map<String,String> eachogrenciValueMap=eachOgrenciEntry.getValue();
                //103={Bolum=TM,SoyIsim=Cem, Sube=K, Sinif=11, Isim=Ali}}

                eachogrenciValueMap.put("Sinif","12");

                eachOgrenciEntry.setValue(eachogrenciValueMap);
            }
        }
        System.out.println(ogrenciMap);
    }
}
