package Day12_MethodCreation;

public class c08_Palindrome {
    public static void main(String[] args) {

        // Verilen bir String'in palindrome olup olmadigini yazdirin
        // palindrome : duz ile ters okunusu ayni oaln

        String str= "madam";
        String tersstr=c07_TerseCevirme.metniTerseCevir(str);

        if (str.equals((tersstr))) {
            System.out.println("Verilen Metin Palindrome");
        }else {
            System.out.println("verilen metin palindrome degil");
        }
    }
}
