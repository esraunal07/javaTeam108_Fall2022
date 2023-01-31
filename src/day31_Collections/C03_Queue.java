package day31_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {

        Queue<String> harfler=new LinkedList<>();

        harfler.add("H");
        harfler.add("K");
        harfler.add("B");
        harfler.add("K");

        System.out.println(harfler); // [H, K, B, K]

        //1. indexe F ekleyelim
        //Queue ozselliginden dolayi ekleme sona olmali, araya ekleme olmaz.

        System.out.println(harfler.remove()); //H
        System.out.println(harfler); //[K, B, K]
        System.out.println(harfler.remove("K")); //True
        System.out.println(harfler); // [B, K]

        System.out.println(harfler.element()); //B
        System.out.println(harfler); // [B, K]
        System.out.println(harfler.peek()); //B
        System.out.println(harfler); //[B,K]

        Queue<String> karakterler=new LinkedList<>();

       // System.out.println(karakterler.element()); exception firlatir

        System.out.println(karakterler.peek()); //Null

        System.out.println(harfler.poll()); // B

        System.out.println(harfler); //[K]

      //  System.out.println(karakterler.remove()); //NoSuchElementException

        System.out.println(karakterler.poll()); //null
        System.out.println(harfler.offer("C")); //add ile offer arasindaki fark; offer varsa kapasiteyi kontrol eder
                                                // kapasite uygunsa ekler, add ise kapasiteye bakmazsizin direk ekler.

        System.out.println(harfler); //[K, C]

    }
}
