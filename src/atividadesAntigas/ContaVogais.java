package atividadesAntigas;

public class ContaVogais {
    public static void main(String[]args){

        String xuxu = "Olá, Tudo bem?";
        System.out.println(contaVogais(xuxu));

    }

    static int contaVogais(String texto){

        int qtdVogais = 0;

        for (int cont = 0; cont < texto.length(); cont++){

            char ch = texto.charAt(cont);

            if("aeiouAEIOU".indexOf(ch)!= 1){

                qtdVogais++;

            }
        }
        return qtdVogais ;
    }


}
