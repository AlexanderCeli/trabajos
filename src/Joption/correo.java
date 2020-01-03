/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Joption;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexander
 */
public class correo {

    public static void main(String[] args) {
        try {
            email q = new email();
            q.verficar();
        } catch (NullPointerException t) {
            JOptionPane.showMessageDialog(null, "REGRESE PRONTO" + t);
        }
    }
}
