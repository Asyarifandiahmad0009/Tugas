/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author asy'ari
 */

interface Suara {
  public void suaraSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class huda implements Suara {
  public void suaraSound() {
    // The body of animalSound() is provided here
    System.out.println("suara huda kalau tidur");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("ghoghoghogho");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    huda myhuda = new huda();  // Create a Pig object
    myhuda.suaraSound();
    myhuda.sleep();
  }
}   

