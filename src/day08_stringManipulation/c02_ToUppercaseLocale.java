package day08_stringManipulation;

import java.util.Locale;

public class c02_ToUppercaseLocale {

    public static void main(String[] args) {

        String str = "JAVA CANDIR" ;
        System.out.println(str.toLowerCase());

        str=str.toLowerCase(Locale.forLanguageTag("tr")) ;
        System.out.println(str);
        str = "Sevgi insanı hayata bağlar" ;

        System.out.println(str.toUpperCase());

        str=str.toUpperCase(Locale.forLanguageTag("tr")) ;
        System.out.println(str);
    }
}
