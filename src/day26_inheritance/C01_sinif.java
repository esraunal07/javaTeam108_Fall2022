package day26_inheritance;


class Okul{
    String okulIsmi="Yildiz Koleji";
    String telefon="3123456543";
}
public class C01_sinif extends Okul{
    String sinif="11-C";
    String telefon="3122343434";
    C01_sinif(String telefon){
        System.out.println(telefon);
        System.out.println(this.telefon);
        System.out.println(super.telefon);
        System.out.println(okulIsmi);
        System.out.println(this.okulIsmi);
        System.out.println(super.okulIsmi);
        System.out.println(sinif);
        System.out.println(this.sinif);
        // System.out.println(super.sinif);
        // Java'da parent'da bulamadigini gidip child'a sorayim OLMAZ
        // parent class'da aranan sinif degeri olmadigindan CTE verir
    }
    public static void main(String[] args) {
        C01_sinif obj= new C01_sinif("4222342323");
    }
}

