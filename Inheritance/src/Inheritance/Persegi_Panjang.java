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
public class Persegi_Panjang extends Bangun_datar{
    public void Persegi_Panjang(){
        double p,l,lpp,kpp;
        Scanner d = new Scanner(System.in);
        System.out.println("PERSEGI PANJANG");
        System.out.println("===============");
        System.out.print("Masukkan Panjang    : ");
        p = d.nextDouble();      
        System.out.print("Masukkan Lebar      : ");
        l = d.nextDouble();      
        lpp = p*l;
        kpp = 2*(p+l);
        System.out.println("Luas Persegi Panjang adalah        : "+lpp);
        System.out.println("Keliling Persegi Panjang adalah    : "+kpp);
    }
}



