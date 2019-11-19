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
public class Trapesium extends Bangun_datar{
    public void Trapesium(){
        double ab,bc,cd,ad,t,lt,kt;
        Scanner c = new Scanner(System.in);
        System.out.println("TRAPESIUM");
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
        lt = 2/(ab+bc)*t;
        kt = ab+bc+cd+ad;
        System.out.println("Luas Bujur Sangkar adalah       : "+lt);
        System.out.println("Keliling Bujur Sangkar adalah   : "+kt);
    }   
}
