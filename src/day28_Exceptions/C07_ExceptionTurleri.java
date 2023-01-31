package day28_Exceptions;

public class C07_ExceptionTurleri {
    public static void main(String[] args) {

        String str="234";

        // str'a sayisal olarak 5 ekleyip yazdirin.

        System.out.println(Integer.parseInt(str)+5); //239

        //Eger str icinde sayi olmayan bir karakter olsaydi NumberFormatException olurdu-

        Object sayiobj=str;
        Integer sayiInt=(Integer) sayiobj;

        System.out.println(sayiInt); //ClassCastException

    }
}
