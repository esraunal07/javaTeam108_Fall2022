package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_ForeachLoop {
    public static void main(String[] args) {

        Integer[] arr ={2,3,4,6,3,4,6,1,8,5,4};
        List<Integer> list1= new ArrayList<>();

        // arraydeki tum elementleri liste kopyalayalim

        for (Integer each :arr
             ) {
            list1.add(each);
            System.out.println(list1);
        }

        // arraydeki cift sayialri olusturacagimiz bir liste tasiyalim

        List<Integer> ciftsayilarlist=new ArrayList<>();

        for (Integer each: arr
             ) {
            if (each%2==0){
                ciftsayilarlist.add(each);

            }
        }
        System.out.println(ciftsayilarlist); //[2, 4, 6, 4, 6, 8, 4]
    }
}
