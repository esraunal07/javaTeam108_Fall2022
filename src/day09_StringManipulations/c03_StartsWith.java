package day09_StringManipulations;

public class c03_StartsWith {
    public static void main(String[] args) {

        String str= "Java mutluluktur" ;

        System.out.println(str.startsWith("Java")); //true
        System.out.println(str.startsWith("j")); //false
        System.out.println(str.startsWith("Java mutluluktur")); //true
        System.out.println(str.startsWith("")); //true
        System.out.println(str.contains("mutlu")); //true  mutlu iceriyor
        System.out.println(str.startsWith("mutlu")); //false ama mutlu ile baslamiyor
        System.out.println(str.startsWith("mutlu", 5)); //true
        System.out.println(str.startsWith("v", 2)); //true


    }
}
