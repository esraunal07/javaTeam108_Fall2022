package day10_StrinManipulations;

public class c01_NullPointer {
    public static void main(String[] args) {


        String str1= "";
        String str2="      " ;
        String str3;
        String str4= null ;

        System.out.println(str1.length()); //0
        System.out.println(str2.length()); //6

        System.out.println(str1.isEmpty()); //true
        System.out.println(str2.isEmpty()); //false
        System.out.println(str1.isBlank()); //true
        System.out.println(str2.isBlank()); //true

        // null bir deger degil isaretcidir.(Null Pointer)
        // null pointer: non-primitive bir objenin olusturuldugunu ancak bilincli olarak
        // deger atanmadigini isaretler.
        // str4'un degeri null demek yanlistir. str4 null olarak isaretlenmistir demek dogrudur.

        // System.out.println(str3.length());
       //  System.out.println(str3.concat("ali can"));
      //  System.out.println(str3.substring(3,4));
        // deger atamadan bir variable olusturabiliriz ama kullanamayiz.
       // str4= null ;
      //  System.out.println(str4.length()); // nullPointerException

        System.out.println(str4 + "Ali Can"); // nullAli Can
        System.out.println(str4.concat("Ali Can")); // nullPointerException













    }
}
