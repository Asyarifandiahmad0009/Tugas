/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parfum;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author asy'ari
 */
public class CRUD {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/wangian";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // register driver
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            while (!conn.isClosed()) {
                showMenu();
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void showMenu() {
        System.out.println("\n========= MENU UTAMA =========");
        System.out.println("1. Insert Data");
        System.out.println("2. Show Data");
        System.out.println("3. Edit Data");
        System.out.println("4. Delete Data");
        System.out.println("0. Keluar");
        System.out.println("");
        System.out.print("PILIHAN> ");

        try {
            int pilihan = Integer.parseInt(input.readLine());

            switch (pilihan) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    insertparfum();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
                    updateparfum();
                    break;
                case 4:
                    deleteparfum();
                    break;
                default:
                    System.out.println("Pilihan salah!");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void showData() {
        String sql = "SELECT * FROM parfum";

        try {
            rs = stmt.executeQuery(sql);
            
            System.out.println("+--------------------------------+");
            System.out.println("|    DATA PARFUM                 |");
            System.out.println("+--------------------------------+");

            while (rs.next()) {
                int serialparfum = rs.getInt("serial_parfum");
                String produk = rs.getString("produk");
                String namaparfum = rs.getString("nama_parfum");
                String pembuat = rs.getString("pembuat");
                String alamat = rs.getString("alamat");

                
                System.out.println(String.format("%d, %s, %s, %s, %s", serialparfum, produk, namaparfum, pembuat, alamat));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void insertparfum() {
        try {
            // ambil input dari user
            System.out.print("Serial parfum: ");
            int serialparfum = Integer.parseInt(input.readLine());
            System.out.print("Produk: ");
            String produk = input.readLine().trim();
            System.out.print("Nama parfum: ");
            String namaparfum = input.readLine().trim();
            System.out.print("Pembuat: ");
            String pembuat = input.readLine().trim();
            System.out.print("Alamat: ");
            String alamat = input.readLine().trim();
 
            // query simpan
            String sql = "INSERT INTO parfum ( serial_parfum, produk, nama_parfum, pembuat, alamat) VALUE('%d', '%s', '%s', '%s', '%s')";
            sql = String.format(sql, serialparfum, produk, namaparfum, pembuat, alamat);

            // simpan buku
            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void updateparfum() {
        try {
            
            // ambil input dari user
            System.out.print("Serial yang mau diedit: ");
            int serialparfum = Integer.parseInt(input.readLine());
           
            System.out.print("Produk: ");
            String produk = input.readLine().trim();
            System.out.print("Nama parfum: ");
            String namaparfum = input.readLine().trim();
            System.out.print("Pembuat: ");
            String pembuat = input.readLine().trim();
            System.out.print("Alamat: ");
            String alamat = input.readLine().trim();

            // query update
            String sql = "UPDATE parfum SET  produk='%s', nama_parfum='%s', pembuat='%s', alamat='%s' WHERE serial_parfum=%d";
            sql = String.format(sql, produk, namaparfum, pembuat, alamat, serialparfum);

            // update data buku
            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void deleteparfum() {
        try {
            
            // ambil input dari user
            System.out.print("Serial yang mau dihapus: ");
            int serialparfum = Integer.parseInt(input.readLine());
            
            // buat query hapus
            String sql = String.format("DELETE FROM parfum WHERE serial_parfum=%d", serialparfum);

            // hapus data
            stmt.execute(sql);
            
            System.out.println("Data telah terhapus...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


