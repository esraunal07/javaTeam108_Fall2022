package day22_inmutableClasses;

import java.time.LocalDate;
import java.util.Locale;

public class C05_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now();
        System.out.println(tarih); //2022-12-19

        System.out.println(tarih.getDayOfWeek()); // tuesday
        System.out.println(tarih.getDayOfMonth()); //20
        System.out.println(tarih.getMonth()); //December
        System.out.println(tarih.getChronology()); //ISO
        System.out.println(tarih.withYear(2015)); //2015-12-20
        System.out.println(tarih.withDayOfMonth(15)); //2022-12-15
        System.out.println(tarih.withDayOfMonth(15).withYear(2015)); //2015-12-15
        System.out.println(tarih.isLeapYear()); // false
        System.out.println(tarih.minusWeeks(5)); //2022-11-15
        System.out.println(tarih.minusDays(5)); //2022-12-15
        System.out.println(tarih.plusDays(15)); //2023-01-04


        LocalDate tarih1=LocalDate.of(1975,10,13);
        LocalDate tarih2=LocalDate.of(1975,10,20);

        System.out.println(tarih1.isBefore(tarih2)? "tarih1 daha eski" : "Tarih2 daha eski"); // tarih1 daha eski

        System.out.println(tarih1.isLeapYear()); //false

        System.out.println(tarih1.hashCode()); //4045453

        System.out.println(tarih.plusDays(7).hashCode()); //4141851

    }
}
