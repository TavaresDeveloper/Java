package interfaces;

import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {

   private JLabel Nome, Salario,Cargo, Adicional;
    private JTextField txtNome, txtSalario, txtAdicional;
    private  JButton Enviar;

      public Interface(){

         Cargo = new JLabel("Cargo", JLabel.CENTER);
         Nome = new JLabel("Nome:");
         Salario = new JLabel("Salário:");
         Adicional = new JLabel("Adicional: ");
         txtNome = new JTextField();
         txtSalario = new JTextField();
         txtAdicional = new JTextField();
         Enviar = new JButton("Enviar");
           JPanel pEntrada = new JPanel(new GridLayout(3, 2));
           pEntrada.add(Nome);
           pEntrada.add(txtNome);
           pEntrada.add(Salario);
           pEntrada.add(txtSalario);
           pEntrada.add(Adicional);
           pEntrada.add(txtAdicional);
           add(pEntrada, BorderLayout.CENTER);
           JPanel pCargo = new JPanel();
           pCargo.add(Cargo);
           add(pCargo, BorderLayout.NORTH);

           JPanel btn = new JPanel();
           btn.add(Enviar);
           add(btn, BorderLayout.SOUTH);

           setTitle("Cadastro");
           setSize(350, 150);
           setVisible(true);
           setLocationRelativeTo(null);
           setDefaultCloseOperation(EXIT_ON_CLOSE);


     }

    public static void main(String[] args) {
        new Interface() ;
    }
}