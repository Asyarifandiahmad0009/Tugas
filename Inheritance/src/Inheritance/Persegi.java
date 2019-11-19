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
public class Persegi extends Bangun_datar{
    public void Persegi(){
        double s,lp,kp;
        Scanner c = new Scanner(System.in);
        System.out.println("BUJUR SANGKAR");
        System.out.println("=============");
        System.out.print("Masukkan sisi : ");
        s = c.nextDouble();      
        lp = s*s;
        kp = 4*s;
        System.out.println("Luas Bujur Sangkar adalah       : "+lp);
        System.out.println("Keliling Bujur Sangkar adalah   : "+kp);
    }   
}

  
