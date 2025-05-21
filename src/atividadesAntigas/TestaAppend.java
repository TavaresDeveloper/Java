package atividadesAntigas;

public class TestaAppend {
    public static void main(String[]args){


        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
        numeros = append(numeros, 30);

        for(int n : numeros){

            System.out.print(n + " ");

        }

    }

    static int[] append(int [] num, int novo){

        int[] aux = new int[num.length + 1];
        for(int cont = 0; cont < num.length; cont++){

            aux[cont] = num[cont];

        }
        aux[aux.length - 1] = novo;
        return aux ;
    }


}
