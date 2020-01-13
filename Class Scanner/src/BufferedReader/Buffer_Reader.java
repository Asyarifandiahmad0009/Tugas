/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BufferedReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author asy'ari
 */
public class Buffer_Reader {
    public static void main(String[] args) {
    BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
     String nama,alamat,jurusan,jeniskelamin,nim,tahun;
     
     try{
      System.out.println("Masukkan Biodata Anda");
     
             
            System.out.print("Nama : ");
             nama = input.readLine();
             
            System.out.print("Jenis Kelamin : ");
             jeniskelamin = input.readLine(); 
             
            System.out.print("Alamat : ");
             alamat = input.readLine();
             
            System.out.print("Jurusan : ");
             jurusan = input.readLine();
             
            System.out.print("Tahun : ");
             tahun = input.readLine();
             
             System.out.print("Nim : ");
             nim = input.readLine();

                System.out.println ("======================================");
                System.out.println ("Perkenalkan Nim saya :"+nim);
                System.out.println ("Perkenalkan Nama saya :"+nama);
                System.out.println ("Perkenalkan Alamat saya :"+alamat);
                System.out.println ("Perkenalkan Tahun saya :"+tahun);
                System.out.println ("Perkenalkan Jurusan saya :"+jurusan);
                System.out.println ("Perkenalkan Jenis Kelamin saya :"+jeniskelamin);
     } catch (IOException ex){
        System.out.println ("Jika terdapat kesalahan input data");
     }
    }
}

