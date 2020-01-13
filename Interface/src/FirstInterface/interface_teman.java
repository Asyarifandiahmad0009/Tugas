/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstInterface;

/**
 *
 * @author asy'ari
 */
public interface interface_teman {
interface teman {
  public void TemanSound(); // interface method (does not have a body)
  public void hudi(); // interface method (does not have a body)
}

// yudi "mengimplementasikan" interface teman
class yudi implements teman {
  public void TemanSound() {
    //  TemanSound () disediakan di sini
    System.out.println("yudi :Kemana hudi?");
  }
  public void hudi() {
    //  hudi () disediakan di sini
    System.out.println("hudi :dia sepak bola di lapangan dekat kantor desa ");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    yudi myyudi = new yudi();  // Buat objek yudi
    myyudi.TemanSound();
    myyudi.hudi();
  }
}
}
