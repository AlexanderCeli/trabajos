package VentanaFace;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Pantalla extends JFrame {

    JFrame frame = new JFrame("Facebook");
    JPanel panelSuperior, panelInferior;
    JLabel contraseña, correo, olvido, Registro, l1, l2, l3, l4, l5, l6, l7, l8, l9;
    JButton entrar;
    JTextField t = new JTextField(20);
    JTextField Txt = new JTextField();
    JTextField Txt2 = new JTextField();
    JTextField Txt3 = new JTextField();
    JTextField Txt4 = new JTextField();
    JTextField Txt6 = new JTextField();
    JTextField Txt7 = new JTextField();
    JTextField Txt8 = new JTextField();
    GridBagConstraints a = new GridBagConstraints();
    GridBagConstraints c = new GridBagConstraints();
    GridBagConstraints d = new GridBagConstraints();
    GridBagConstraints b = new GridBagConstraints();

    public void ppanelSuperior() {
        panelSuperior = new JPanel();
        panelSuperior = new JPanel(new GridBagLayout());

        c.weightx = 2;
        c.weighty = 1;
        c.fill = GridBagConstraints.HORIZONTAL;

        correo = new JLabel("Correo Electronico o telefono ");
        correo.setForeground(Color.white);
        c.gridx = 0;
        c.gridy = 0;
        panelSuperior.add(correo, c);

        JTextField TextoCorreo = new JTextField(10);
        c.gridx = 0;
        c.gridy = 1;
        panelSuperior.add(TextoCorreo, c);

        contraseña = new JLabel("Contraseña ");
        contraseña.setForeground(Color.white);
        c.gridx = 1;
        c.gridy = 0;
        panelSuperior.add(contraseña, c);

        JTextField Texto1 = new JTextField(10);
        c.gridx = 1;
        c.gridy = 1;
        panelSuperior.add(Texto1, c);

        entrar = new JButton("Entrar");
        entrar.setForeground(Color.black);
        c.gridx = 2;
        c.gridy = 1;
        panelSuperior.add(entrar, c);

        olvido = new JLabel("¿Has olvidado los datos de tu cuenta ");
        olvido.setForeground(Color.gray);
        c.gridx = 1;
        c.gridy = 3;
        panelSuperior.add(olvido, c);

        panelInferior = new JPanel();
        panelInferior = new JPanel(new GridBagLayout());
        panelSuperior.setBackground(Color.blue);
        Registro = new JLabel("Registrarte");
        Font fuente = new Font("Calibri", 3, 40);
        Registro.setFont(fuente);
        Registro.setForeground(Color.BLACK);
        c.gridx = 0;
        c.gridy = 4;
        panelInferior.add(Registro, c);

        l2 = new JLabel("Es gratis y lo sera siempre");
        c.gridx = 0;
        c.gridy = 5;
        panelInferior.add(l2, c);

        d.weightx = 2;
        d.weighty = 1;
        d.fill = GridBagConstraints.HORIZONTAL;

        Txt = new JTextField("Nombre");
        d.gridx = 0;
        d.gridy = 6;
        panelInferior.add(Txt, d);

        Txt2 = new JTextField("Apellidos");
        d.gridx = 1;
        d.gridy = 6;
        panelInferior.add(Txt2, d);

        Txt3 = new JTextField("Numero de movil o correo electronico");
        c.gridx = 0;
        c.gridwidth = 2;
        c.gridy = 8;
        panelInferior.add(Txt3, c);

        Txt4 = new JTextField("Contraseña nueva");
        c.gridx = 0;
        c.gridwidth = 2;
        c.gridy = 10;
        panelInferior.add(Txt4, c);

        l3 = new JLabel("Fecha de Nacimiento");
        c.gridx = 0;
        c.gridwidth = 0;
        c.gridy = 11;
        panelInferior.add(l3, c);

     
        Txt6 = new JTextField("Dia");
        d.gridx = 0;
//        b.gridwidth = 0;
        d.gridy = 14;
        panelInferior.add(Txt6, d);

        Txt7 = new JTextField("Mes");
        d.gridx = 1;
//        b.gridwidth = 0;
        d.gridy = 14;
        panelInferior.add(Txt7, d);

        Txt8 = new JTextField("año");
        d.gridx = 2;
//        b.gridwidth = 0;
        d.gridy = 14;
        panelInferior.add(Txt8, d);

        l4 = new JLabel("¿Porque devo facilitar");
        d.gridx = 3;
        d.gridwidth = 3;
        d.gridy = 13;
        panelInferior.add(l4, d);

        l5 = new JLabel(" mi fecha de nacimiento? ");
        d.gridx = 3;
        d.gridwidth = 3;
        d.gridy = 14;
        panelInferior.add(l5, d);

        a.weightx = 2;
        a.weighty = 1;
        a.fill = GridBagConstraints.HORIZONTAL;

        JButton hombre = new JButton("Hombre");
        a.gridx = 1;
        a.gridy = 15;
        panelInferior.add(hombre, a);

        JButton Mujer = new JButton("Mujer");
        a.gridx = 0;
        a.gridy = 15;
        panelInferior.add(Mujer, a);

        l6 = new JLabel("Al hacer clic en Registrarte, aceptas las Condiciones, la Política ");
        d.gridx = 0;
        d.gridwidth = 3;
        d.gridy = 18;
        panelInferior.add(l6, d);

        l7 = new JLabel("de datos y la Política de cookies. Es posible que te enviemos");
        d.gridx = 0;
        d.gridwidth = 3;
        d.gridy = 19;
        panelInferior.add(l7, d);

        l8 = new JLabel("notificaciones por SMS que podrás desactivar cuando quieras ");
        d.gridx = 0;
        d.gridwidth = 3;
        d.gridy = 20;
        panelInferior.add(l8, d);

        JButton Registrarte = new JButton("Registrarte");
        Registrarte.setForeground(Color.white);
        Registrarte.setBackground(Color.green);
        a.gridx = 1;
        a.gridwidth = 3;
        a.gridy = 21;
        panelInferior.add(Registrarte, a);

    }

    public Pantalla() {
        ppanelSuperior();
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.add(panelSuperior);
        this.add(panelInferior);
        panelSuperior.setVisible(true);
        panelInferior.setVisible(true);
        this.setResizable(false);
        this.setSize(600, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
