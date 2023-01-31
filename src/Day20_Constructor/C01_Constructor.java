package Day20_Constructor;

import day19_arrayList_forEachLoop.Toyota;

public class C01_Constructor {
    public static void main(String[] args) {

        Car car1=new Car();
        Toyota toyota=new Toyota();

        System.out.println(car1);

        System.out.println(toyota); // day19_arrayList_forEachLoop.Toyota@3b6eb2ec
        //Toyota bir obje oldugundan ozellikelrini direk yazdiramayiz, referansi yazdirir.
        //bir classdan olusturulan objelerin belirli özelliklerini kolayca yazdirabilmek icin
        // o class istenen ozellikelri kapsayan bir toString() olusturulabilir.

        /*
        toString methodunda yazilanlari istedigimiz sekil ve formata uyarlayabiliriz.
         */

        car1.marka="Audi";
        car1.model="A4";
        car1.yil=2020;
        car1.km=20000;
        car1.renk="Siyah";
    }
}
