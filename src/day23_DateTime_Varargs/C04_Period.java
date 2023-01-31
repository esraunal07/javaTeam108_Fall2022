package day23_DateTime_Varargs;

import java.time.LocalDate;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {

        LocalDate dogumtarihi =LocalDate.of(1989,8,17);
        LocalDate bugun=LocalDate.now();

        Period yas= Period.between(dogumtarihi,bugun);
        System.out.println(yas); //P33Y4M3D 33 yil 4 ay 3gun
        System.out.println(yas.getYears()); //33

        LocalDate baslangic=LocalDate.of(2010,8,5);
        LocalDate bitis=LocalDate.of(2015,7,20);
        Period sure=Period.between(baslangic,bitis);
        System.out.println(sure); // P4Y11M15D

    }
}
