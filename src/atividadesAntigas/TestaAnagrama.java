package atividadesAntigas;

import java.util.Arrays;

public class TestaAnagrama {

    public static void main(String[] args) {

        String t1 = "Apple";
        String t2 = "papel";

        if (isAnagrama(t1, t2)){

            System.out.println("Formam um Anagrama");

        } else {

            System.out.println("Não Formam um Anagrama");

        }
    }

    static boolean isAnagrama(String texto1, String texto2){

        texto1 = texto1.toLowerCase();
        texto2 = texto2.toLowerCase();
         char[] ch1 = texto1.toCharArray();
         Arrays.sort(ch1);
        char[] ch2 = texto2.toCharArray();
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

}
