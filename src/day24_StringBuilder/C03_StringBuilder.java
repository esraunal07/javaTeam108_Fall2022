package day24_StringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java" ;

        System.out.println(sb1==sb2);//False
        System.out.println(sb1.equals(sb2)); //false

        //Stringbuilder metin esitligi sorgulamak icin equals() kullanmaz,

        System.out.println(sb1.compareTo(sb2)); // 0

        StringBuilder sb3=new StringBuilder("Hava");

        System.out.println(sb1.compareTo(sb3)); // 2

        sb3=new StringBuilder("Tava") ;
        System.out.println(sb1.compareTo(sb3)); //-10

        //alfabetik siralamaya gore sayiyor. harf gerideyse - koyar basina.
        // sonuc 0 ise birbirine esittir. 0 cikmazsa sonuc esit degil deriz.

        sb3=new StringBuilder("Jaka");
        System.out.println(sb1.compareTo(sb3)); //11 k l m n o p r s t u v Java-jaka
        // ilk buldugu yerde sayar.

        sb3=new StringBuilder("Javax");
        System.out.println(sb1.compareTo(sb3)); // -1

        sb3=new StringBuilder("Java Candir");
        System.out.println(sb1.compareTo(sb3)); //-7

        // System.out.println(sb1==str); data turleri farkli karsilastirma yapmaz.cte verir

        System.out.println(sb1.equals(str)); // yazdirir ama false döner




    }
}
