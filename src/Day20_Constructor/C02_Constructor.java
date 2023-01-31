package Day20_Constructor;

public class C02_Constructor {
    public C02_Constructor() {
    }

    public static void main(String[] args) {

        /*
            Bir obje olusturulurken
            istedigimiz ozellikleri direk atayabilirsek
            sonradan tekrar bir atama islemi yapmama gerek kalmaz
            bu durumda atamayi tek tek bizim yapmamiz yerine
            constructor'in atama yapmasini istemeliyiz
            atama yapmak icin constructor'a parametre gondermeliyiz
         */

        Car car1 = new Car("BMW", "5.20", 2020, 15000, "Beyaz");
        /*
        Car{marka='BMW'
        , model='5.20'
        , yil=2020
        , km=15000
        , renk='Beyaz'}
         */

        System.out.println(car1);
        Car car2 = new Car("Tofas", "Sahin", 2010);
        System.out.println(car2);
        /*
        Car{marka='Tofas'
        , model='Sahin'
        , yil=2010
        , km=0
        , renk='Renk secilmedi'}
         */

        Car car3 = new Car("Toyota", "Corolla", 2016);
        System.out.println(car3);

    }
}