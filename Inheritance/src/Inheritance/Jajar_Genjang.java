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
public class Jajar_Genjang extends Bangun_datar{
    public void Jajar_Genjang(){
        double ab,bc,cd,ad,t,lj,kj;
        Scanner c = new Scanner(System.in);
        System.out.println("JAJAR GENJANG");
        System.out.println("=============");
        System.out.print("Masukkan A : ");
        ab = c.nextDouble();    
        System.out.print("Masukkan B : ");
        bc = c.nextDouble();      
        System.out.print("Masukkan C : ");
        cd = c.nextDouble(); 
        System.out.print("Masukkan D : ");
        ad = c.nextDouble(); 
        System.out.print("Masukkan T : ");
        t  = c.nextDouble();      
        lj = ab*t;
        kj = ab+bc+cd+ad;
        System.out.println("Luas Bujur Sangkar adalah       : "+lj);
        System.out.println("Keliling Bujur Sangkar adalah   : "+kj);
    } 
}
