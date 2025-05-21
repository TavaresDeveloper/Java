package atividadesAntigas;// Criar um método isSorted( ) que recebe um array de inteiros num[ ]
// e retorne true se os elementos do array estiverem em ordem crescente
// ou false caso contrário.

public class TestaIsSorted {
    public static void main(String[] args) {
        int[] xuxu = {1, 5, 13, 24, 45, 76, 87, 98};
        if (isSorted(xuxu)) {
            System.out.println("Tá classificado!");
        } else {
            System.out.println("NÃO tá classificado!");
        }
    }

    static boolean isSorted(int[] num) {
        for (int cont = 0; cont < num.length - 1; cont++) {
            if (num[cont] > num[cont + 1]) {
                return false;
            }
        }
        return true;
    }
}