package atividadesAntigas;

public class InverterArray {
    public static void main(String[] args) {
        int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
          Inverter(numeros);
        for (int num : numeros){

            System.out.print(num + "");

        }

    }

    static void  Inverter(int [] num){

        int esq = 0;
        int dir = num.length - 1;
        int aux;

           while (esq < dir){

               aux = num[esq];
               num[esq] = num[dir];
               num[dir] = aux;
               esq++;
               dir--;
           }



    }
}
