package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C08_Constructor {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        Random rnd=new Random();

        List<Integer> sayilar=new ArrayList<>();

        // sayilar ArrayList class'indan olusturdugumuz bir objedir.
        // ve olusturuldugu classdaki tum ozelliklere(method ve variable'lar)  sahiptir.

        /*
        Bir class'dan bir obje olusturdugumuzda o classdaki tum instance variable'lar bir kopyasi
        olusturup objemizle iliskilendirilir.

        ayrica o classda bulunan tum methodlarda objemizle iliskilendirilir.
        bu islemleri saglayan java yapisi CONSTRUCTOR'dir.
        bu isleme de initialize (Ilk deger atamasi) denir.

        new keyword ile obje olusturulurken
        esitligin saginda new ile birlikte classIsmi () yazilir.

        iste bu classIsmi() o classin constructor'dur.
        bugune kadar gordugumuz yapilardan farklidir.

        Constructor, bir obje olusturmak istedigimizde devreye girer ve
        ilgili sinifin tum özellikleini obje ile iliskilendirir(initialize)
         */

    }
}
