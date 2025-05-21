package atividadesAntigas;

public class TestaIsPalindromo {

    public static void main(String[]args){

        String goiaba = "scorrammesubinoonibusemmarrocos";
        if(isPalindromo(goiaba)){

            System.out.println("É palíndromo");
        }else {

            System.out.println("Não é palíndromo");
        }


    }

    static boolean isPalindromo(String texto){

        int esq = 0;
        int dir = texto.length() -1;

        while (esq < dir){

            if(texto.charAt(esq) != texto.charAt(dir)){

                return false ;
            }
            esq++;
            dir--;
        }
        return true ;

    }



}
