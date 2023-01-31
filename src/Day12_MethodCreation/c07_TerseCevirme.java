package Day12_MethodCreation;

public class c07_TerseCevirme {
    public static void main(String[] args) {

        // Verilen bir Stringi terse cevirip
        // o halini bize donduren bir method olusturun.

        System.out.println(metniTerseCevir("java Candir"));
    }

    public static String metniTerseCevir(String str){
        String tersstr= "";
        for (int i = str.length()-1; i>=0; i--) {
            tersstr+=str.charAt(i);

        }

        return tersstr;

    }
}
