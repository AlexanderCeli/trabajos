package Trow;

import java.util.Scanner;

public class Metodos {

    int dividendo;
    int divisor;

    public Metodos() {
    }

    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public void metodo1() {

        try {
            metodo2();
        } catch (Exception e) {
            System.out.println("No es divisible para 0" + e.getMessage());
        }

    }

    public void metodo2() throws Exception {
        try {
            metodo3();
        } catch (Exception e) {
            throw e;
        }
    }

    public void metodo3() throws Exception {

        try {
            leer();
            int r = getDividendo() / getDivisor();

        } catch (Exception e) {
            throw e;
        }
    }

    public void leer() {
        Scanner dato = new Scanner(System.in);

        System.out.println("Ingrese el Dividendo");
        setDividendo(dato.nextInt());
        System.out.println("Ingrese el Divisor");
        setDivisor(dato.nextInt());
    }

}
