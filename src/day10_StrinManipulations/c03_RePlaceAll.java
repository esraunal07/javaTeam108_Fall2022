package day10_StrinManipulations;

public class c03_RePlaceAll {
    public static void main(String[] args) {


        // bu metindeki sayilardan kurtulun
        String str = "Ja1va 56Guz, zel-dir" ;
        System.out.println(str.replace("1", "") .replace("5", "")
                .replace("6", ""));



        /* replace () zateb istenen degisikligi verilen özellige uyan tum degerler icin yapar.
        eger genellemeyi butun sayilari, butun spaceleri, butun ozel karakterleri gibi genilsetmek istersek
        replace() yerine replaceAll() kullaniriiz.
        Java bu genellemeleri yzabilmemiz icin regex(regular expressions) tanimlamistir.
         */

        str= "Ja1va4 56G7uz, z9el-d0ir8" ;

        str=str.replaceAll("\\d", "") ; //tum sayilardan kurtulduk
        System.out.println(str); //Java Guz, zel-dir

        // ozel karakterleden kurtulun
        // space de ozel karakter oldugundan bu durumda space'in yok olmamasi icin
        // once space yerine metinde olmayan bir deger atayalim

        str=str.replace(" ", "5") ;
        str=str.replaceAll("\\W", "");
        str=str.replace("5", " ") ;

        System.out.println(str);








    }
}