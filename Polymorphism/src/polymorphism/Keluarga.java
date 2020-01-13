/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author asy'ari
 */
class Keluarga {
    
public void keluargaSound() {
    System.out.println("ini keluarga besar budi");
  }
}

class ayah extends Keluarga {
  public void keluargaSound() {
    System.out.println("ayah    : dimana budi?");
  }
}

class ibu extends Keluarga {
  public void keluargaSound() {
    System.out.println("ibu     : budi bermain bola.");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Keluarga myKeluarga = new Keluarga();
    Keluarga myayah = new ayah();
    Keluarga myibu = new ibu();
        
    myKeluarga.keluargaSound();
    myayah.keluargaSound();
    myibu.keluargaSound();
  }
}
    

