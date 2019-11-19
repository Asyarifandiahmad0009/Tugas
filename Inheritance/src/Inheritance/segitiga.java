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

public class segitiga extends Bangun_datar{
    public void segitiga(){
        double ab,bc,ac,t,ls,ks;
        Scanner c = new Scanner(System.in);
        System.out.println("SEGITIGA");
        System.out.println("=============");
        System.out.print("Masukkan A : ");
        ab = c.nextDouble();    
        System.out.print("Masukkan B : ");
        bc = c.nextDouble();      
        System.out.print("Masukkan C : ");
        ac = c.nextDouble(); 
        System.out.print("Masukkan T : ");
        t  = c.nextDouble();      
        ls = ab+bc+ac;
        ks = 2/ab*t;
        System.out.println("Luas Bujur Sangkar adalah       : "+ls);
        System.out.println("Keliling Bujur Sangkar adalah   : "+ks);
    }   
}


