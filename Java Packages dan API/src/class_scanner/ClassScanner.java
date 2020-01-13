/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_scanner;

import java.util.Scanner;

/**
 *
 * @author asy'ari
 */
public class ClassScanner {

    public static void main(String[] args) {
     String nama;
     String alamat;
     String jurusan;
     String jeniskelamin;
     long nim;
     int tahun;
     
 Scanner input = new Scanner(System.in);
 
        System.out.println("Masukkan Biodata Anda");
     
             
            System.out.print("Nama          : ");
             nama = input.nextLine();
             
            System.out.print("Jenis Kelamin : ");
             jeniskelamin = input.nextLine(); 
             
            System.out.print("Alamat        : ");
             alamat = input.nextLine();
             
            System.out.print("Jurusan       : ");
             jurusan = input.nextLine();
             
            System.out.print("Nim           : ");
             nim = input.nextLong();
             
             System.out.print("Tahun        : ");
             tahun = input.nextInt();
             
      
             
		System.out.println ("======================================");
                System.out.println (" Nim saya adalah                   :"+nim);
                System.out.println (" Perkenalkan Nama saya             :"+nama);
                System.out.println (" Alamat saya di                    :"+alamat);
                System.out.println (" Tahun angkatan saya adalah        :"+tahun);
                System.out.println (" Jurusan saya adalah               :"+jurusan);
                System.out.println (" Jenis Kelamin saya adalah         :"+jeniskelamin);
     }
}
    

