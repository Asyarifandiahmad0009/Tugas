/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import java.util.Scanner;

/**
 *
 * @author asy'ari
 */
public class Belah_Ketupat extends Bangun_datar {
    public void Belah_Ketupat(){      
        double ab,bc,cd,ad,d1,d2,lbk,kbk,phi = 3.14;
        Scanner b = new Scanner(System.in);
        System.out.println("BELAH KETUPAT");
        System.out.println("=========");
        System.out.print("Masukkan A            : ");
        ab = b.nextDouble();    
        System.out.print("Masukkan B            : ");
        bc = b.nextDouble();      
        System.out.print("Masukkan C            : ");
        cd = b.nextDouble(); 
        System.out.print("Masukkan D            : ");
        ad = b.nextDouble();
        System.out.print("Masukkan diameter 1   : ");
        d1 = b.nextDouble();
        System.out.print("Masukkan diameter 2   : ");
        d2 = b.nextDouble();
        lbk = 2/d1*d2;
        kbk = ab+bc+cd+ad;
        System.out.println("Luas Lingkaran adalah       : "+lbk);
        System.out.println("Keliling Lingkaran adalah   : "+kbk);
   }  
    
}
