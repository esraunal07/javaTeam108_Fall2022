package day32_sets_maps;

import java.util.Map;

public class C06_Value {

    public static void main(String[] args) {


        //MapOlustur methodu bize bir map donduruyor.
        //Biz o classdaki mapi kullanmak istiyoruz ama
        //her seferinde o classa gidip o mapi yeniden olusturmak isimize yaramaz.

        //Bu classda bir map olusturmak istedigimizde
        // new HAshMAp<>() yaziyoruz
        //Ancak bu bize bos bir map getiriyor.
        //Bu kodun yerine mapmethoddepo dan ogrencimapolustur methodunu calistirirsak
        //bize dolu bir map getirir
        //Bizde onu icinde oldugumuz classda olsuturdugumuz ogrencimap'e atama yapariz.


        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap.put(110,"Cemal-Han-12-M-MF");

        System.out.println(ogrenciMap);
        //{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 110=Cemal-Han-12-M-MF}

        System.out.println(ogrenciMap.keySet()); //[101, 102, 103, 104, 105, 106, 110]
        System.out.println(ogrenciMap.values());

        //Verilen ismin ogrenciMapte olup olmadigini kontrol edin
        //true veya false donen bir method olusturun.

        boolean sonuc=MapMethodDepo.isimIleOgrenciArama(ogrenciMap,"Ali");

        System.out.println(sonuc); // true

        System.out.println(MapMethodDepo.isimIleOgrenciArama(ogrenciMap, "Kemal")); // false
        System.out.println(MapMethodDepo.isimIleOgrenciArama(ogrenciMap, "Cem")); //false

    }
}
