package day24_StringBuilder;

public class C04_AccessModifier {

    String str;
    // access modifieri gözlerimizle göremiyorsak
    // default access modifier var demektir.

    // bu class da default constructor var.
    // str'in degeri null (default deger)
    // str'in access modifier'i default access modifier.


    public static void main(String[] args) {

        d obj1=new d();
        System.out.println((obj1.isimDefault)); //Furkan
        obj1.defaultStaticOlmayanMethod(); //default access modifierli static olmayn method calisti

        // baska classlardaki class uyelerine erisimde access modifier ve static keyword u dikkate almalidir.
        // static class uyelerini obje uzerinden kullanmaya gerek yok.
        // illaki obje uzerinden kullanmka istersek class uyesinin ismini yazmamiz gerek.

        System.out.println(d.isimDefaultStatic); //Sevilay
        d.isimDefaultStatic="Mehmet";

        obj1.defaultStaticMethod(); //default access modifierli static methoda calisti
        d.defaultStaticMethod(); //default access modifierli static methoda calisti

    }
}
