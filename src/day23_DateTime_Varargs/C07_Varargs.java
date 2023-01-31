package day23_DateTime_Varargs;

public class C07_Varargs {
    public static void main(String[] args) {

        // Kac tane String argument yazarsam
        // yazayim, argumentleirn en uzun olanini yazddiran bir method olusturun
        // not: en uzun kelime olarak birden fazla kelime varsa ilkini yazdirin.

        enUzunuYazdir("Ilyas", "Berivan","Murat") ;
        enUzunuYazdir("Mehmet","Vahit", "Nurcan", "Zafer", "Java");
    }

    private static void enUzunuYazdir(String... Kelimeler) {

        String enUzunKelime=Kelimeler[0];
        for (String eachKelime: Kelimeler
             ) {
            if (eachKelime.length()>enUzunKelime.length()){ // esitlik koyarsak en sondakini yazdirir //Nurcan
                enUzunKelime=eachKelime;
            }
        }
        System.out.println(enUzunKelime); // Berivan //Mehmet

    }
}
