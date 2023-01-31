package day22_inmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    public static void main(String[] args) {

        // Verilen bir Listte degisiklik yapan 2 method olusturun
        //1. method Listin elementlerine yeni deger atayip yazdirsin
        // 2. method Liste yeni List degeri atayip, yeni liste elementler ekleyip yazdirsin
        // her iki methodu cagirdiktan sonra main methoddaki listi yazdiralim.

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(34);
        sayilar.add(45);
        System.out.println(sayilar); // [10,34,45)
        elemanlariDegistir(sayilar);
        System.out.println("1.method calldan sonra sayilar :" + sayilar); //[25, 54, 67]

        yeniListAta(sayilar);
        System.out.println("2.method calldan sonra sayilar :" + sayilar); //[25, 54, 67]

        /*
        Java passbyvalue kullanir.

        Passbyvalue demek methoda gonderilen variablenin kendisini degil degerini gondermek demektir.
        primitive data turleri veya string gonderdigimizde methodda yapilam degisiklik ,methodda kalir.
        main mathodda atama yapilmadikca main methoddaki variablenin degri degismez .

        Passbyvalua coklu elemenet iceren array ve list gibi yapilar icin de gecerlidir.
        ancak coklu elementi value olarak methoda gonderemediginden array veya List in adresini gonderir.
        eger methodda elementlere atama yapilirsa, main methoddaki elementlerde degismis olur.
        eger list veya arraye yeni bir list veya array degesri atanirsa bu atama methodda kalir, main methoddaki List ve Array degismez.

        araba ayni kaldi muddetce icindekilerin degismesi passbyvalue aykiri degildir.
         */

    }


    public static void elemanlariDegistir(List<Integer> sayilar){

        sayilar.set(0,25);
        sayilar.set(1,54);
        sayilar.set(2,67);
        System.out.println("elemanlariDegistir methodunda list:" + sayilar); // [25, 54, 67]

    }

    public static void yeniListAta(List<Integer> sayilar){

        sayilar=new ArrayList<>();
        sayilar.add(34);
        sayilar.add(98);
        sayilar.add(11);
        System.out.println("Yeni List ata methodunda:" + sayilar); // [34, 98, 11]
    }
}

