package Day14_doWhileLoop_scope;

import java.util.SplittableRandom;

public class C05_Scope {


    int sayi = 10;
    static int number;

    public static void main(String[] args) {
        String  mainStr="Java" ;
        number=10;
       // sayi=20;
        for (int i = 0; i <10 ; i++) {
            int toplam=i;
        }
        System.out.println();

    }

    public static void method1(){
        String method1Str="Guzeldir"  ;
        number=20;
        // sayi=14;
    }
    public void method2(){
        String method2Str="Candir" ;
        number=30;
        sayi=30;
    }
}
