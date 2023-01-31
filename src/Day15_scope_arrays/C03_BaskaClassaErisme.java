package Day15_scope_arrays;

public class C03_BaskaClassaErisme {
    public static void main(String[] args) {
        /*
        java OOP konsept cercevesinde baska class'lardaki class uyelerini (variable/method) kullanabiliriz.
        Baska class'da ki herhangi bir class uyesine erismek istedigimizde
        static keyword onemli bir rol oynar.

        static olarak isaretlenen class uyelerine
        class.Ismi.staticuyeIsmi seklinde ulasabiliriz.

        static olmayan class uyelerine erisebilmek icin obje olusturmmaiz gerekir.

        Java runtime programdir. basinca calisir, calistigi surece yapilan islemleri kalici olarak tutar.
        calisma bittiginde her sey yok olur.
         */

        System.out.println(C01_Hastane.hastaneAdres); //Cankaya/Ankara
        C01_Hastane.method1(); //Cankaya/Ankara
        System.out.println(C01_Hastane.hastaneismi); //Yildiz Hastnesi

        C01_Hastane per1=new C01_Hastane(); //Java C01e gider oradan instance variable kopyasini alir.
                                                // staticleri classa baglar.

        System.out.println(per1.personelAdresi); //null
        System.out.println(per1.hastaneismi); //Yildiz Hastanesi

        per1.personelIsmi= "Belkis" ;
        per1.personelAdresi="Istanbul";
        per1.hastaneAdres="Uskudar" ;

        System.out.println(per1.personelIsmi); //Belkis
        System.out.println(per1.personelAdresi); //Istanbul
        System.out.println(per1.personelTel); //null
        System.out.println(per1.hastaneismi); //Yildiz Hastanesi
        System.out.println(per1.hastaneAdres); //Uskudar
    }
}
