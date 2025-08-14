package interfaces;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class InterfaceFuncional extends JFrame{

      private JLabel Base, Expoente;
      private JTextField txtBase, txtExpoente;
      private JButton Calcular;

      public InterfaceFuncional(){

          Base = new JLabel("Base: ");
          Expoente = new JLabel("Expoente");
          txtBase = new JTextField();
          txtExpoente = new JTextField();
          Calcular = new JButton("Calcular");

          JPanel pEntrada = new JPanel(new GridLayout(2,2));
          pEntrada.add(Base); pEntrada.add(txtBase);
          pEntrada.add(Expoente); pEntrada.add(txtExpoente);
          add(pEntrada, BorderLayout.CENTER);
          JPanel btn = new JPanel();
          btn.add(Calcular);
          add(btn, BorderLayout.SOUTH);

          setTitle("Atividade");
          setSize(350, 150);
          setVisible(true);
          setLocationRelativeTo(null);
          setDefaultCloseOperation(EXIT_ON_CLOSE);

           Ouvinte ov = new Ouvinte();
           Calcular.addActionListener(ov);


      }

    public static void main(String[] args) {
        new InterfaceFuncional();
    }

    private class Ouvinte implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent evt) {
            try {
                int n = Integer.parseInt(txtBase.getText());
                int expoente = Integer.parseInt(txtExpoente.getText());
                int resultado = 1;
                for (int cont = 1; cont <= expoente; cont++) {

                    resultado *= n;

                }
                JOptionPane.showMessageDialog(null, "Resultado =" + " " + resultado);
            }catch (NumberFormatException e){

                JOptionPane.showMessageDialog(null, "Caro usuário válido!");
            }
        }

    }
}
