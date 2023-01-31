package day09_StringManipulations;

public class c05_indexof {
    public static void main(String[] args) {

        String str="Java ile kodlama cok kolay" ;

        // str "cok" iceriyor mu diye sorarsak ?
        System.out.println(str.contains("cok")); //true

        //kullanicidan aldigimiz cumle "cok" ile baslayan ilk kelimeyi yazdirin.

        System.out.println(str.endsWith("cok")); //false

        System.out.println(str.indexOf('a')) ; //1
        System.out.println(str.indexOf("cok")); //17 basladigi indexi yazdirir.
        System.out.println(str.indexOf("a", 5)); //13


        // 2. o'nun indexini yazdirin
        //once ilk o'nun indeksini buluruz
        //sonra o indexten sonrasinda 2.yi buluruz

        int ilkoindexi= str.indexOf ("o") ;
        int ikincioindexi= str.indexOf("o", ilkoindexi+1) ;

        System.out.println(ilkoindexi + " " + ikincioindexi); //10 18








    }
}
