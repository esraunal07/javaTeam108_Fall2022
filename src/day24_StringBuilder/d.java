package day24_StringBuilder;

public class d {
    private String isim="Mustafa";
    String isimDefault="Furkan";
    static String isimDefaultStatic="Sevilay";

    public static void main(String[] args) {

       // System.out.println(isim);static olmadigindan static main methodda kullanilmaz

        d obj1=new d();
        System.out.println(obj1.isim); //Mustafa
        staticMethod();
        System.out.println(obj1.isim); // Mustafa
    }

    private void staticOlmayanMethod(){

        isim="Huseyin";
        System.out.println(isim);
    }
    void defaultStaticOlmayanMethod(){
        System.out.println("default access modifierli static olmayn method calisti");
    }
    static void defaultStaticMethod(){
        System.out.println("default access modifierli static methoda calisti");
    }

    private static void staticMethod(){

        d obj1= new d();
        obj1.isim="Zafer";
        System.out.println(obj1.isim); //zafer
    }
}

