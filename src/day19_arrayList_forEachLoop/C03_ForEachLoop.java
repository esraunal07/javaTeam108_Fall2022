package day19_arrayList_forEachLoop;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        /*
        Eger coklu element iceren bir yapidaki tum elementlere
        ayni islemi yapmak istiyorsak
        indexten bagimsiz olarak foreachloop kullanilabilir.
        Foreachloop'ta 3 seyi belirtmemiz gerekir.
        1- getirilecek elemntlerin data turu
        2- getirilen elemente verilecek isim(genelde each veya w kullanilir.
        3- nereden getirilecegi
         */



        int[] arr ={2,4,6,8,1};

        //bu arrayin tum elementlerini yazdiralim.

        // arr ye git her bir eachi bana getir diye okuruz.

        for (int each: arr
             ) {
            System.out.print(each+" ");
        }

        // tum elemtleri toplayalim

        int toplam=0;

        for (int each: arr
             ) {
            toplam+=each;
            System.out.println("Sayilarin toplami:" + toplam);


            }
        }

    }

