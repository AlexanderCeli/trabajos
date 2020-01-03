package Joption;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class email {

      public void verficar() {

        boolean retorno = false;
        int validacion = 0;

        String email = (String) JOptionPane.showInputDialog(null, ("INGRESE SU CORREO "));
        String valida1 = email, valida2 = email;

        int contador1 = 0, valor = 3, conta2 = 0;
       
        for (int i = 0; i < valida1.length(); i++) {

            contador1++;
        }
        if (contador1 >= valor) {
            validacion = 1;
        }
        if (validacion == 0) {
            JOptionPane.showMessageDialog(null, "Debe contener mas tres caracteres   " );
            retorno = false;
        } else {
            if (contador1 < valor) {
                validacion = 0;
            }
        }
        
        boolean arroba = false;
        boolean punto = false;
        char arro = '@';
        char pnt = '.';

        
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == arro && email.charAt(i) == pnt) {
                arroba = true;
                punto = true;
            }
        }
        
           if (email.matches("..+@@.+\\...+")) {
            JOptionPane.showMessageDialog(null,"El mail ingresado es incorrecto");
            }else{
          JOptionPane.showMessageDialog(null,"El mail ingresado es correcto" );
           }
            }

}