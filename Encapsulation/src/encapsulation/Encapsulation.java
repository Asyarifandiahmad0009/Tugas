/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author asy'ari
 */
public class Encapsulation {

   private String name;

   // Getter
   public String getName() {
     return name;
   }

   // Setter
   public void setName(String newName) {
     this.name = newName;
   }

public static void main(String[] args) {
    Encapsulation myObj = new Encapsulation ();
    myObj.name = "Asy'ari";
    System.out.println(myObj.name);
  }
}
