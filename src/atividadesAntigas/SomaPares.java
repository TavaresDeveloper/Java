package atividadesAntigas;

import javax.swing.*;


public class SomaPares {

    public static void main(String[]args){
        String entrada =JOptionPane.showInputDialog("Quantos números?");
        int n = Integer.parseInt(entrada);
        int soma = 0;

        for(int cont = 1; cont <=n; cont++){

            entrada = JOptionPane.showInputDialog("Digite o número");
            int num = Integer.parseInt(entrada);
            if(num % 2 == 0){

                soma+= num;

            }

        }

        JOptionPane.showMessageDialog(null, "A soma é: " + soma);

    }


}
