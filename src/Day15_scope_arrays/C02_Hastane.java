package Day15_scope_arrays;

public class C02_Hastane {


        static String hastaneismi = "Yildiz Hastanesi";
        static String hastaneAdres = "Cankaya/Ankara";

        String personelIsmi="Personel" ;
        String personelAdresi="Adres";
        String personelTel= "Telefon" ;


    public static void main(String[] args) {

        C02_Hastane per1=new C02_Hastane();

        C02_Hastane per2=new C02_Hastane();

        per1.personelIsmi="Harun";
        per2.personelAdresi="Cankaya";
        hastaneismi="Java Hastanesi";

        System.out.println(per1.personelTel); //telefon
        System.out.println(per1.personelIsmi); //Harun
        System.out.println(per2.personelIsmi); //Personel
        System.out.println(per2.personelAdresi); //cankaya

        System.out.println(per1.hastaneismi); //Java Hastanesi
        System.out.println(per2.hastaneismi); //Java hastanesi
        System.out.println(hastaneismi); //Java hastanesi

        per1.personelIsmi="Mehmet" ;
        System.out.println(per1.personelIsmi); //Mehmet
    }

}