package Day17_arrays;

import java.util.Arrays;

public class C04_MultiDimensionalArrays {
    public static void main(String[] args) {

        int [][] arr={ {1,2}, {3,4,5}, {6,7,4,5}, {2},{1,2,3,4,5}} ;

        System.out.println(arr.length); //5
        System.out.println(arr[2].length); //4
        System.out.println(arr[2][1]); //7
        System.out.println(arr[3]);  // [I@3ac3fd8b

        /*
        Multidimensional array ile calisirken dikkat etmemiz gereken en onemli sey
        yazdigimiz kodun bir array mi yoksa yazdirilacak bir element mi döndurdudur.
         */

        System.out.println(Arrays.toString(arr[3])); //[2]

        //20. satirdaki 2 elementini yazdirmak istersek

        System.out.println(arr[3][0]); //2










    }
}
