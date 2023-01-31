package day10_StrinManipulations;

public class c04_ReplaceFirst {
    public static void main(String[] args) {

        String str= "Java  heyecandir" ;

        //eger tum 'a' lari degil de sadece olk 'a'yi degistirmek istersek ;

        System.out.println(str.replaceFirst("a", "A")) ; //JAva  heyecandir


        //ilk harf veya rakami * yap

        System.out.println(str.replaceFirst("\\w", "*")) ; //*ava  heyecandir




    }
}
