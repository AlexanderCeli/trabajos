package venta;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClaseGL extends JFrame {
    
    JLabel l1, l2, l3;
    JPanel panelSuperior, panelInferior, panelCentral;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bRT, bCE, bCL, bMas, bMenos, bMul, bDiv, bIgual, bMN, bPunto;
    JTextField campoTexto;

    public ClaseGL() {
        creandoPanelSuperior();
        creandoPanelCentral();
        creandoPanelInferior();
        
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.add(panelSuperior);
        this.add(panelCentral);
        this.add(panelInferior);
        this.setVisible(true);
        this.pack();
    }

    public void creandoPanelSuperior() {
        panelSuperior = new JPanel();

        l1 = new JLabel("Ver");
        l2 = new JLabel("Edición");
        l3 = new JLabel("Ayuda");
        l1.setForeground(Color.red);
        l2.setForeground(Color.red);
        l3.setForeground(Color.red);
        panelSuperior.setLayout(new FlowLayout());

        panelSuperior.add(l1);
        panelSuperior.add(l2);
        panelSuperior.add(l3);
        panelSuperior.setBackground(Color.black);
    }

    public void creandoPanelCentral() {

        campoTexto = new JTextField(30);
        panelCentral = new JPanel();
        panelCentral.setLayout(new FlowLayout());
        panelCentral.add(campoTexto);
        panelCentral.setBackground(Color.black);
    }

    public void creandoPanelInferior() {
        panelInferior = new JPanel();
        panelInferior.setBackground(Color.black);
        panelInferior.setLayout(new GridLayout(5, 4, 8, 8));
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bRT = new JButton("Rtc");
        bCE = new JButton("CE");
        bCL = new JButton("CL");
        bMas = new JButton("+");
        bMenos = new JButton("-");
        bMul = new JButton("x");
        bDiv = new JButton("/");
        bIgual = new JButton("=");
        bMN = new JButton("+/-");
        bPunto = new JButton(".");
        panelInferior.add(bRT);
        panelInferior.add(bCE);
        panelInferior.add(bCL);
        panelInferior.add(bMN);
        panelInferior.add(b7);
        panelInferior.add(b8);
        panelInferior.add(b9);
        panelInferior.add(bDiv);
        panelInferior.add(b4);
        panelInferior.add(b5);
        panelInferior.add(b6);
        panelInferior.add(bMul);
        panelInferior.add(b1);
        panelInferior.add(b2);
        panelInferior.add(b3);
        panelInferior.add(bMenos);
        panelInferior.add(b0);
        panelInferior.add(bPunto);
        panelInferior.add(bIgual);
        panelInferior.add(bMas);
    }
}
