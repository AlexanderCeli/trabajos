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
public class B {
    private C c;

  public B() {
    this.c = new C();
  }
  public void relanzaExcepcion() throws Exception {
      this.c.lanzaExcepcion();
  }
}
