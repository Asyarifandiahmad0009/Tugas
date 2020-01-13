/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOptionPane;

import javax.swing.JOptionPane;
/**
 *
 * @author asy'ari
 */
public class Class_JOptionPane {
    public static void main(String[] args) {
        String nama,alamat,jurusan,jeniskelamin,nim,tahun;
        
        nama = JOptionPane.showInputDialog("Siapa nama kamu ?");
        alamat = JOptionPane.showInputDialog("Dimana alamat kamu ?");
        jurusan = JOptionPane.showInputDialog("Apa jurusan kamu ?");
        jeniskelamin = JOptionPane.showInputDialog("Apa Jenis kelamin kamu ?");
        nim = JOptionPane.showInputDialog("Berapa nim kamu ?");
        tahun = JOptionPane.showInputDialog("Tahun angkatan berapa kamu ?");
        
        
        JOptionPane.showMessageDialog(null,"Nama saya adalah  "+ nama);
        JOptionPane.showMessageDialog(null,"Alamat saya di  "+ alamat);
        JOptionPane.showMessageDialog(null,"Jurusan saya adalah  "+ jurusan);
        JOptionPane.showMessageDialog(null,"Jenis Kelamin saya adalah  "+ jeniskelamin);
        JOptionPane.showMessageDialog(null,"Nim saya adalah   "+ nim);
        JOptionPane.showMessageDialog(null,"Tahun angkatan saya adalah "+ tahun);
        
        
        
                System.out.println ("======================================");
                System.out.println (" Nim saya adalah                   :"+nim);
                System.out.println (" Perkenalkan Nama saya             :"+nama);
                System.out.println (" Alamat saya di                    :"+alamat);
                System.out.println (" Tahun angkatan saya adalah        :"+tahun);
                System.out.println (" Jurusan saya adalah               :"+jurusan);
                System.out.println (" Jenis Kelamin saya adalah         :"+jeniskelamin);
        
    }
}
