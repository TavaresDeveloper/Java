package atividadesAntigas;

import javax.swing.*;

public class ExibirMaiorNumero {
    public static void main(String[]args){

        String entrada = JOptionPane.showInputDialog("Digite o primeiro numero");
        int n1 = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog("Digite o segundo número");
        int n2 = Integer.parseInt(entrada);

          if(n1 > n2){

              JOptionPane.showMessageDialog(null, "O maior número é: " + n1);

          } else{
              JOptionPane.showMessageDialog(null, "O maior número é: " + n2);
          }


    }
}
