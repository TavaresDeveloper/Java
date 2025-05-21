package atividadesAntigas;

public class InverteNumeros {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.print("Array original: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Inverter(array);

        System.out.print("Array invertido: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void Inverter(int[] num) {
        int inicio = 0;
        int fim = num.length - 1;

        while (inicio < fim) {

            int temp = num[inicio];
            num[inicio] = num[fim];
            num[fim] = temp;

            inicio++;
            fim--;
        }
    }
}