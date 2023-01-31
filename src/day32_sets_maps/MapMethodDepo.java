package day32_sets_maps;

import java.util.*;

public class MapMethodDepo {

    //Bize ogrencimap

    public static Map<Integer, String> ogrenciMapOlustur() {

        Map<Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }

    public static boolean isimIleOgrenciArama(Map<Integer, String> ogrenciMap, String isim) {

        // 1- tum value'leri bir cocllection olarak kaydedelim

        Collection<String> valuesCollection = ogrenciMap.values();

        //2 - For-each kullanarak her bir value'yu ele alalim.
        //3-  -'yi kullanarak split yapalim [Ali,Can,11,H,MF]
        // 4 - Split yaptigimiz arrayden isim bilgisini alalim 0.index
        //5- Eger value den aldigimiz isim, aranan isimle ayni ise true dondurup donguyu bitiririz.
        //6- For-each bittiginde true olmadiysa false dondurelim.

        for (String eachvalue : valuesCollection
        ) {

            String[] valueArr = eachvalue.split("-");
            String valuedekiIsim = valueArr[0];

            if (valuedekiIsim.equalsIgnoreCase(isim)) {
                return true;
            }
        }
        return false;
    }

    public static void soyisimleOgrenciListesiYazdirma(Map<Integer, String> ogrenciMap, String soyisim) {

        /*
        1- map'de ki valueleri  bir collection olarak kaydedelim.
        2- for-each ile her bir value bilgisini ele alalim.
        3- value'yu - ile split yapip bir array elde edelim
        4- array'in 1.indexindeki soyisme bakip aranan soyisim ile ayni ise
         isim, soyisim, sinif ve sube bilgilerini yazdiralim.
         */

        Collection<String> ogrenciValueCollection = ogrenciMap.values();

        System.out.println("isim soyisim sinif sube");

        for (String eachValue : ogrenciValueCollection
        ) {
            String[] valuearr = eachValue.split("-");
            String valuesoyisim = valuearr[1];

            if (valuesoyisim.equalsIgnoreCase(soyisim)) {
                System.out.println(valuearr[0] + " " +
                        valuearr[1] + " " +
                        valuearr[2] + " " +
                        valuearr[3] + " ");
            }
        }

    }

    public static void subeListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif, String sube) {

        Collection<String> valueCollection = ogrenciMap.values();
        System.out.println("isim Soyisim");
        for (String eachValue : valueCollection
        ) {
            String[] valuearr = eachValue.split("-");
            if (valuearr[2].equalsIgnoreCase(sinif) && valuearr[3].equalsIgnoreCase(sube)) {
                System.out.println(valuearr[0] + " " + valuearr[1]);
            }
        }

    }

    public static Map<Integer, String> numaraIleSubeDegistirme(Map<Integer, String> ogrenciMap, int okulno, String yenisubeismi) {

        //1- okul numrarsini biliyouruz . direk ogrenci value ulasabiliriz

        String ogrenciValue = ogrenciMap.get(okulno);
        String[] valuearr = ogrenciValue.split("-");

        // 2- Sube ismini guncelleyelim

        valuearr[3] = yenisubeismi;

        //3- arraydeki guncel bilgileri yeniden value formatinda bir string yapalim

        String yeniValue = valuearr[0] + "-" + valuearr[1] + "-" + valuearr[2] + "-" + valuearr[3] + "-" + valuearr[4];

        //4- ogrenci no yani key ile value'yu mape ekleyelim.

        ogrenciMap.put(okulno, yeniValue);
        return ogrenciMap;
    }
    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif) {

        // verilen siniftaki ogrencilerin no, isim, soyisim, bolumlerini
        // bir liste olarak yazdiran bir method olusturun

        System.out.println("No isim soyisim bolum");
        System.out.println("=====================");

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry: entrySeti
        ) { // 101=Ali-Can-11-H-MF

            // 1- entry'den value'yu alalim
            String entryValue= eachEntry.getValue(); // Ali-Can-11-H-MF

            // 2- bu value'yu parcalayalim ve bir array'e store edelim
            String[] valueArr= entryValue.split("-"); // [Ali, Can, 11, H, MF]

            // sinif bilgisini kontrol edip
            // istenen sinif ile ayni ise, istenen bilgileri yazdiralim

            if (valueArr[2].equalsIgnoreCase(sinif)){
                System.out.println(eachEntry.getKey() + " " +
                        valueArr[0] +" "+
                        valueArr[1]+ " "+
                        valueArr[4]);
            }
        }

    }

    public static void bolumListesiOlusturma(Map<Integer, String> ogrenciMap, String bolum) {
        // verilen bolumdeki ogrencilerin
        // No, isim soyisim ve siniflarini yazdiran
        // bir method olusturun

        System.out.println("No isim soyisim sinif");
        System.out.println("=====================");

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry: entrySeti
        ) {

            String entryValue= eachEntry.getValue();

            String[] entryValueArr= entryValue.split("-"); // [Ali, Can, 11, H, MF]

            if (entryValueArr[4].equalsIgnoreCase(bolum)){

                System.out.println(eachEntry.getKey()+" " +
                        entryValueArr[0]+" "+
                        entryValueArr[1]+" " +
                        entryValueArr[2]);

            }


        }

    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {
        // soyisimleri buyuk harf yapalim
        // 1- entrySet olusturalim

        Set<Map.Entry<Integer, String>> entrySeti= ogrenciMap.entrySet();

        // 2- foreach loop ile her bir entry'yi elden gecirip, soyisimleri buyuk harf yapalim

        for (Map.Entry<Integer, String> eachEntry : entrySeti) {

            // 3- entry'den value'yu alalim
            String entryValue= eachEntry.getValue(); // Ali-Can-11-H-MF
            // 4- soyisim bilgisine ulasip degistirebilmek icin parcala
            String[] entryValueArr= entryValue.split("-"); // [Ali, Can, 11, H, MF]
            // 5- Soyisimi buyuk harf yapalim

            entryValueArr[1]= entryValueArr[1].toUpperCase(); // // [Ali, CAN, 11, H, MF]

            // 6- degisikligi yaptiktan sonra yeniden birlestirmeleri yapip
            //    map'i update etmeliyiz


            // 7- setValue() kullanarak value'yu yeni haline update edelim

            eachEntry.setValue(entryValueArr[0]+"-"+
                    entryValueArr[1]+"-"+
                    entryValueArr[2]+"-"+
                    entryValueArr[3]+"-"+
                    entryValueArr[4]);

        }
        return ogrenciMap;
    }

    public static void tumListeYazdir(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer,String>> ogrenciEntrySet=ogrenciMap.entrySet();
        System.out.println("No   Ogrenci Bilgileri");
        System.out.println("======================");

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySet
        ) {
            System.out.println(eachEntry);
        }
    }

    public static Map<Integer, String> siniflariArtir(Map<Integer, String> ogrenciMap) {

        // map'de istedigimiz degisikligi yaptiktan sonra
        // map'i update etmenin en kolay yolu setEntry()

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) { // 101=Ali-Can-11-H-MF

            String entryValue=eachEntry.getValue(); // Ali-Can-11-H-MF

            String[] entryValueArr = entryValue.split("-"); // [Ali, CAN, 11, H, MF]

            int sinifInt= Integer.parseInt(entryValueArr[2]);

            if (sinifInt==12){

                entryValueArr[2]="Mezun";
            }else{

                entryValueArr[2]=sinifInt+1+"";
            }

            // sinif bilgisini guncelledik
            // bu guncellemeyi map'e islememiz lazim

            eachEntry.setValue(entryValueArr[0]+"-"+
                    entryValueArr[1]+"-"+
                    entryValueArr[2]+"-"+
                    entryValueArr[3]+"-"+
                    entryValueArr[4]);

        }
        return ogrenciMap;
    }

    public static void sinifSiraliListeYazdir(Map<Integer, String> ogrenciMap) {
        // 101=Ali-Can-11-H-MF
        // 11 H Ali Can 101

        // tum ogrenci listesini
        // sinif sube isim soyisim no seklinde
        // dogal sirali olarak
        // Yazdiran bir method olusturun

        Set<Map.Entry<Integer, String>> entrySeti= ogrenciMap.entrySet();
        Set<String> siraliOgrenciSeti= new TreeSet<>();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) {

            String entryValue=eachEntry.getValue(); // Ali-Can-11-H-MF

            String[] entryValueArr= entryValue.split("-"); // [Ali, Can, 11, H, MF]

            // Entry'den istenen bilgileri alip yeni bir String olusturacagiz
            // ve bu String'leri sirali olarak yazdiracagiz

            String istenenFormattakiBilgi= entryValueArr[2]+" "+
                    entryValueArr[3]+" "+
                    entryValueArr[0]+" "+
                    entryValueArr[1]+" "+
                    eachEntry.getKey();

            siraliOgrenciSeti.add(istenenFormattakiBilgi);
        }

        System.out.println("sinif sube isim soyisim no");
        System.out.println("==========================");

        for (String each : siraliOgrenciSeti) {
            System.out.println(each);
        }

    }

    public static void isimSoyisimSiraliListeYazdir(Map<Integer, String> ogrenciMap) {

        // tum ogrenci listesini isim soyisim no sinif sube bolum

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        Set<String> isimSoyisimSiraliSet= new TreeSet<>();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) {

            String value= eachEntry.getValue();

            String[] valueArr=value.split("-"); // [Ali, Can, 11, H, MF]

            String istenenFormattakiBilgi= valueArr[0]+" "+
                    valueArr[1]+" "+
                    eachEntry.getKey()+" "+
                    valueArr[2]+" "+
                    valueArr[3]+" "+
                    valueArr[4];
            isimSoyisimSiraliSet.add(istenenFormattakiBilgi);


        }

        // sirali set'i yazdiralim
        System.out.println("isim soyisim no sinif sube bolum");
        System.out.println("================================");

        for (String each : isimSoyisimSiraliSet) {
            System.out.println(each);
        }


    }
}

