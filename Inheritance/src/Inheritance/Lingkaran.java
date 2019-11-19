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
public class Lingkaran extends Bangun_datar {
    
    public void Lingkaran(){      
        double r,d,ll,kl,phi = 3.14;
        Scanner b = new Scanner(System.in);
        System.out.println("LINGKARAN");
        System.out.println("=========");
        System.out.print("Masukkan jari-jari  : ");
        r = b.nextDouble();
        System.out.print("Masukkan diameter   : ");
        d = b.nextDouble();
        ll = phi*r*r;
        kl = phi*d;
        System.out.println("Luas Lingkaran adalah       : "+ll);
        System.out.println("Keliling Lingkaran adalah   : "+kl);
   }
}


