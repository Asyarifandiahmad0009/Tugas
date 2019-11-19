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
public class Bangun_datar{
    public static void main(String[] args) {
        boolean ulang=true;             
        int menu; 
        Lingkaran L = new Lingkaran();
        segitiga S = new segitiga();
        Persegi  B = new Persegi();
        Persegi_Panjang P = new Persegi_Panjang(); 
        Belah_Ketupat BK = new Belah_Ketupat();
        Jajar_Genjang JG = new Jajar_Genjang();
        Layang_Layang LL = new Layang_Layang();
        Trapesium T = new Trapesium();
        
while ( ulang ) {
    System.out.println("-<= Menu Bangun Datar =>-");
    System.out.println("1.Lingkaran 2. Segitiga 3. Persegi 4. Persegi panjang 5. Belah ketupat 6. Jajar genjang 7. Layang - layang 8. Trapesium 9.Keluar Aplikasi");
    System.out.println("=========================================================");
            Scanner input = new Scanner(System.in);
    System.out.print("Pilih Menu : ");
          menu = input.nextInt();
    switch(menu) {
            case 1 : L.Lingkaran();break;
            case 2 : S.segitiga();break;
            case 3 : B.Persegi();break;
            case 4 : P.Persegi_Panjang();break;
            case 5 : BK.Belah_Ketupat();break;
            case 6 : JG.Jajar_Genjang ();break;
            case 7 : LL.Layang_Layang ();break;
            case 8 : T.Trapesium ();break;
            case 9 : System.exit(0);
            default:
            System.out.println("Pilih salah satu nomor dari 1-9!");
     }
        }
System.out.println("");

}
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
 