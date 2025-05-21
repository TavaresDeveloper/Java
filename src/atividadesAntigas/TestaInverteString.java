package atividadesAntigas;

public class TestaInverteString {

    public static void main(String[] args) {
        String dado = "Oi tudo bem";
        String invertida = inverter(dado);
        System.out.println(dado.toLowerCase());
        System.out.println(invertida);
    }

    static String inverter( String texto){

        String resp = "";

             for(int cont = texto.length() - 1; cont >= 0; cont--){

                   resp += texto.charAt(cont);

             }

        return resp;


    }


}
