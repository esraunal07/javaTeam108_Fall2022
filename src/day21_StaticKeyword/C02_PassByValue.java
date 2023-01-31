package day21_StaticKeyword;

public class C02_PassByValue {
    public static void main(String[] args) {

        /*
        Java passbyvalue kullanir. yani methodlar arasinda gonderilen variablelarin degil,
        valuelari diger methoda yollanir.
         */

        int fiyat=100;
        //Fiyat uzerinden %10 indirim yapip, indiirmli fiyati dönduren  bir method olsuturun.
        System.out.println(indirimYap10(fiyat));
        System.out.println(fiyat);


        // eger indirimli fiyatin kalici olarak fiyatimizi degistirmesini istersek
        //atama yapariz.
        fiyat=indirimYap10(fiyat);
    }

    public static int indirimYap10(int a){

        a=a *90 /100;
        return a;



    }
}
