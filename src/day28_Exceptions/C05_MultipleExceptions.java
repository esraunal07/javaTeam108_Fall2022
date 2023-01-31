package day28_Exceptions;

import java.util.Scanner;

public class C05_MultipleExceptions {
    public static void main(String[] args) {

        /*
        Eger birden fazla exception olusma ihtimali varsa bu exceptionalr birbirinden bagimsiz ise;
            1- tek try istenen kadar catch yapilabilir.
            2- ikisi icin ic ice try catch yapabilirim.
            3- iki exceptioni da kapsayan tek bir catch de yapabilirim.
         */

        String str = "Java'da cok fazla exception var.";
        int[] arr = {3, 5, 1, 3, 2, 6, 3, 6, 8, 5, 2};

        //Kullanicidan bir tamsayi alin ve girilen sayiyi index olarak
        //kullanip str ve arr'den o indexleri elementleri yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir index girin");
        int index = scan.nextInt();
        ;

        // System.out.println("String'den istenen indexteki element :" + str.substring(index,index+1));
        //  System.out.println("Array'den istenen indexteki element:" + arr[index]);


        /* 1. cozum:

        try {System.out.println("String'den istenen indexteki element :" + str.substring(index,index+1));
            System.out.println("Array'den istenen indexteki element:" + arr[index]);

        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Istenen index Stringin sinirlari disinda");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Istenen index arrayin sinirlari disinda");
        }

         */
      /*  //2. cozum ic ice try catch

        try {
            try {

            System.out.println("String'den istenen indexteki element :" + str.substring(index,index+1));
            System.out.println("Array'den istenen indexteki element:" + arr[index]);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Istenen index Stringin disinda");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Istenen index Array sinirlari disinda");
        }

       */

        //3. cozum tek ama daha kapsamli bir exception kullanma

        try {
            System.out.println("String'den istenen indexteki element :" + str.substring(index, index + 1));
            System.out.println("Array'den istenen indexteki element:" + arr[index]);
        } catch (RuntimeException e) {

            System.out.println("index String ve/veya Array'in sinirlari disinda");
            e.printStackTrace();
        }
    }

}
