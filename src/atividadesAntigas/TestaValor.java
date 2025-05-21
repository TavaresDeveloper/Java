package atividadesAntigas;

public class TestaValor {

    public static void main(String[] args) {

        String numeroTexo = "123.467,78";
        System.out.println(valor(numeroTexo) + 1);

    }

    static double valor(String texto){

        texto = texto.replace(".", "");
        texto = texto.replace(",", ".");

        return Double.parseDouble(texto) ;

    }

}
