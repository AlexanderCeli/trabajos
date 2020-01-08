package ventanas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventanas {

    JFrame ventana = new JFrame("Mi Primera ventana");
    JPanel p = new JPanel();
    JTextField t = new JTextField(20);
    JButton b = new JButton("Aceptar");
    JLabel l = new JLabel("Mi primera aplicacion");
    JLabel l1 = new JLabel("Aqui va el texto");

    public Ventanas() {
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.setSize(1200, 500);
        b.setLocation(1150,250);
//        ventana.setTitle("primera ventana");
        ventana.setLocation(100, 100);
//        ventana.setResizable(false);
        ventana.setVisible(true);
        agregarComponentes();

    }

    public void agregarComponentes() {
        ventana.getContentPane().add(p);
        b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String texto=t.getText();
            if(!texto.isEmpty()){
            l1.setText(texto);
            l1.setForeground(Color.blue);
            }else{
                JOptionPane.showMessageDialog(null,"Escriba algo en el campo ");
            }
        }
        
    });
        
        p.setBackground(Color.green);
        p.add(l);
        p.add(t);
        p.add(b);
        p.add(l1);

    }

}
