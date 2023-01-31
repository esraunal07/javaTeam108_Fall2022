package day26_inheritance;

import java.util.ArrayList;
import java.util.List;

public class FDizelCorolla extends ECorolla {

    String motor="1.6 Dizel Motor";
    String yakit="Dizel";
    String guvenlik="Abs";
    String renk="renk belirtilmedi";

    public static void main(String[] args) {

        DToyota c3=new FDizelCorolla();
        System.out.println(c3.motor); //T Motor belirtilmedi
        System.out.println(c3.yakit); // T Yakit belirtilmedi
      //  System.out.println(c3.guvenlik);
       // System.out.println(c3.renk);

        System.out.println(c3.model); // T Model belirtilmedi
       // System.out.println(c3.uretimYeri);
       // System.out.println(c3.teker);
       // System.out.println(c3.vites);

        System.out.println(c3.marka); //T Toyota



        /*
        Bazen child classdan obje olusturmakla beraber bu
        child classin parent classindaki hangi ozellikleri aldigini
        bilmek isteriz.
        bu durumda data turunu constructor i kullanilan classin
        parent classlarindan secebiliriz.
         */

        ECorolla c2=new FDizelCorolla();
        System.out.println(c2.motor); //T Motor belirtilmemis
        System.out.println(c2.yakit); //T Yakit belirtilmedi
       // System.out.println(c2.guvenlik); //CTE
        // System.out.println(c2.renk); //CTE

        System.out.println(c2.model); //C Corolla
        System.out.println(c2.uretimYeri); //C Turkiye
        System.out.println(c2.teker); //C 205.55
        System.out.println(c2.vites);//C Vites belirtilmedi

        System.out.println(c2.marka); //T Toyota


        FDizelCorolla c1=new FDizelCorolla();
        System.out.println(c1.motor); //DC 1.6 Dizel Motor
        System.out.println(c1.yakit); //DC Dizel
        System.out.println(c1.guvenlik); //DC ABS
        System.out.println(c1.renk); //DC Renk belirtilmedi

        System.out.println(c1.model); //C Corolla
        System.out.println(c1.uretimYeri); //C Turkiye
        System.out.println(c1.teker); //C 205.55 teker
        System.out.println(c1.vites);//C Vites belirtilmedi

        System.out.println(c1.marka); //T Toyota

        List<String> Liste=new ArrayList<>();



    }

}
