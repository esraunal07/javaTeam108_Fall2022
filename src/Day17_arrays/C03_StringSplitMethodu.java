package Day17_arrays;

import java.util.Arrays;
import java.util.SplittableRandom;

public class C03_StringSplitMethodu {
    public static void main(String[] args) {


        String str = "Java her gecen gun guzellesiyor" ;

        //str'da kac kelime var?
        //split methodu istedigimiz Stringi, istedigimiz ayirac kullanarak
        //parcalara ayirmamiza imkan verir.

       String[] spacesplit=str.split(" ") ;
        System.out.println(Arrays.toString(spacesplit));
        System.out.println("Verilen cumledeki kelime sayisi :" + spacesplit.length); //5

        System.out.println(Arrays.toString(str.split("e"))); // [Java h, r g, c, n gun guz, ll, siyor]
        System.out.println(Arrays.toString(str.split("")));
        // [J, a, v, a,  , h, e, r,  , g, e, c, e, n,  , g, u, n,  , g, u, z, e, l, l, e, s, i, y, o, r]



    }
}
