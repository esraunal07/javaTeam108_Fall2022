package day09_StringManipulations;

public class c02_Contains {
    public static void main(String[] args) {

        String str="Java ogren, mutlu ol" ;

        // str mutlu iceriyor mu?

        System.out.println(str.contains("mutlu")); //true

        //charSequense : char dizisi

        System.out.println(str.contains("j")); // false kucuk j oldugu icin
        System.out.println(str.contains("J")); //true
        System.out.println(str.contains(" ")); // true

        /* contasins methodu kactane olduguna degil,
        sadece var olup olmadigina bakar.
         */

        System.out.println(str.contains("Java") && str.contains("mutlu"));

    }
}
