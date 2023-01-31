package day31_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {

    public static void main(String[] args) {

        /*
        Collections objeleri bir arada tutan yapilardir.
        Gercek hayattki ihtiyaclara gore JAva farkli collection yapilari olusturmustur.
        Bir uygulamada hangi collectioni kullanacagimiza istedigimiz ozelliklere gore karar veririz.

        Collections temel de 3 ana gruba ayrilir ve 3 interface ile kurallari belirlemistir.
        -List
        -Queue
        -Set
        Ancak interfacelerden obje olusturalamayacagi icin childclasslarinin constructorlari kullanilir.
        Burada ozellikleri belirleyen constructor degil DATA turu olarak secilen collectiondir.

         Ornegin Linked list olustururken sececegimiz data turu ile
         Queue, Deque, List veya tumunun ozelliklerini tasiyan LinkedList'ler olusturabiliriz
         */

        LinkedList<String> ll1=new LinkedList<>();
        List<String> ll2=new LinkedList<>();
        Queue<String> ll3=new LinkedList<>();
        Deque<String> ll4= new LinkedList<>();
    }
}
