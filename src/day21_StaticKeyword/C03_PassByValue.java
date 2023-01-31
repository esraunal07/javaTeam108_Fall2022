package day21_StaticKeyword;

public class C03_PassByValue {
    public static void main(String[] args) {

        int s =20;

        System.out.println(s); //20

       //int sayi=30;
        // bir scopeda tanimlanan variable'in yeniden tanimlama imkani yoktur.

        //String sayi="Hasan";
        //data turunu degistirerek yendien tanimlamakta munkun degildir.
        // cunku kullanirken variable nin ismini yazdigimizda hangi sayi variablenin kullanilacagi mechul olur.
        method1();

    }

    public static void method1(){
    method2(5);
        String s ="Hasan";

        System.out.println(s.toLowerCase());
    }

    public static void method2(int s){
        s=s*s;
        System.out.println(s);
    }
}

