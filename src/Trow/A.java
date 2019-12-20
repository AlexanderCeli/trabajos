/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trow;

/**
 *
 * @author Alexander
 */
public class A {
  
  private B b;

  public A() {
    this.b = new B();
  }

  public void dondeAtrapoLaExcepcion() {
    try {
      b.relanzaExcepcion();
    }
    catch(Exception e) {
      System.out.println("Excepcion: " + e.getMessage());
    }
  }
}

